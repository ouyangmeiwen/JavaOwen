package com.library.owen.admin.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.library.owen.admin.mapper.LibiteminventoryinfoMapper;
import com.library.owen.admin.mapper.LiblayerMapper;
import com.library.owen.admin.mapper.LibrowMapper;
import com.library.owen.admin.mapper.LibshelfMapper;
import com.library.owen.admin.model.Libitem;
import com.library.owen.admin.model.Libiteminventoryinfo;
import com.library.owen.admin.model.Liblayer;
import com.library.owen.admin.model.Librow;
import com.library.owen.admin.model.Libshelf;
import com.library.owen.admin.service.LibiteminventoryinfoService;
import com.library.owen.admin.vo.GetItemInventoryInfoDto;
import com.library.owen.admin.vo.GetItemInventoryInfoInput;
import com.library.owen.admin.vo.GetItemInventoryInfoItem;
import com.library.owen.core.page.MyBatisPageHelper;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;

@Service
public class LibiteminventoryinfoServiceImpl implements LibiteminventoryinfoService{

    @Autowired
    private LibiteminventoryinfoMapper libiteminventoryinfoMapper;


    @Autowired
    private LibrowMapper librowMapper;

    @Autowired
    private LibshelfMapper libshelfMapper;

    @Autowired
    private LiblayerMapper liblayerMapper;




    @Override
    public int save(Libiteminventoryinfo record) {
        if (record.getId() == null || record.getId().equals("")) {
            return libiteminventoryinfoMapper.insertSelective(record);
        }
        return libiteminventoryinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Libiteminventoryinfo record) {
        return libiteminventoryinfoMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<Libiteminventoryinfo> records) {
       for (Libiteminventoryinfo record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public Libiteminventoryinfo findById(String id) {
        return libiteminventoryinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
         return MyBatisPageHelper.findPage(pageRequest, libiteminventoryinfoMapper);
    }

    @Override
    public PageResult findPageByMap(PageRequest pageRequest) {
        String id = pageRequest.getParamValue("id");
        Map<String, Object> mapparams = new HashMap<>();
        mapparams.put("id", id);

        //开启分页查找
        MyBatisPageHelper.startPage(pageRequest);

        //构建查询语句
        List<?> result= libiteminventoryinfoMapper.findPageByMap(mapparams);
        
        //设置分页信息
        PageInfo<?> pageInfo=new PageInfo((List) result);

        //返回查询结果集
        PageResult pageResult = MyBatisPageHelper.getPageResult(pageRequest, pageInfo);
        return pageResult;
    }

    @Override
    public GetItemInventoryInfoDto GetItemInventoryInfo(GetItemInventoryInfoInput input) {

        Map<String,Object> rowmap=new HashMap<>();
        if(input.locationId!=null &&!input.locationId.equals("")){
            rowmap.put("locationId", input.locationId);
        }
        if(input.rowId!=null &&!input.rowId.equals("")){
            rowmap.put("rowId", input.rowId);
        }
        List<String> rowids=new ArrayList<>();
        if(!rowmap.isEmpty()){
            List<Librow> rowList=librowMapper.findPageByMap(rowmap);
            if(rowList.size()==0){
                return null;
            }
            for (Librow librow : rowList) {
                rowids.add(librow.getId());
            }
        }
        Map<String,Object> shelfMap=new HashMap<>();
        if(rowids.size()>0){
            shelfMap.put("rowids", rowids);
        }
        if(input.structId!=null && !input.structId.equals("")){
            shelfMap.put("structId", input.structId);
        }
        List<String> shelfids=new ArrayList<>();
        if(shelfMap.size()>0){
           List<Libshelf> shelfList =libshelfMapper.findPageByMap(shelfMap);
           if(shelfList.size()==0){
                return null;
           }
           for (Libshelf libshelf : shelfList) {
                shelfids.add(libshelf.getId());
           }
        }
        List<String> layerids=new ArrayList<>();
        if(shelfids.size()>0){
            Map<String,Object> layerMap=new HashMap<>();
            layerMap.put("shelfids", shelfids);
            List<Liblayer> layerList=liblayerMapper.findPageByMap(layerMap);
            if(layerList.size()==0){
                return null;
            }
            for (Liblayer liblayer : layerList) {
                layerids.add(liblayer.getId());
            }
        }

        Map<String,Object> invMap=new HashMap<>();

        if(layerids.size()>0){
            invMap.put("layerids", layerids);
        }

        if(input.filter!=null&&input.filter.length>0){
            invMap.put("filter", input.filter);
        }

        if(input.minLastModificationTime!=null){
            invMap.put("minLastModificationTime", input.minLastModificationTime);
        }
        if(input.maxLastModificationTime!=null){
            invMap.put("maxLastModificationTime", input.maxLastModificationTime);
        }
        if(input.inventoryState!=null){
            invMap.put("inventoryState", input.inventoryState);
        }
        if(input.layerCodeFilter!=null&&!input.layerCodeFilter.equals("")){
            invMap.put("layerCodeFilter", input.layerCodeFilter);
        }
        if(input.tenantId!=null){
            invMap.put("tenantId", input.tenantId);
        }

        PageRequest pageRequest=new PageRequest();
        int pageNum=input.getSkipCount()/input.getMaxResultCount()+1;

        pageRequest.setPageNum(pageNum);
        pageRequest.setPageSize(input.getMaxResultCount());
        //开启分页查找
        MyBatisPageHelper.startPage(pageRequest);
        //构建查询语句
        List<Libiteminventoryinfo> result=libiteminventoryinfoMapper.findPageByMap(invMap);
        //设置分页信息
        PageInfo<Libiteminventoryinfo> pageInfo=new PageInfo((List) result);

        List<Libiteminventoryinfo> inv_list=pageInfo.getList();
        List<GetItemInventoryInfoItem> items=new ArrayList<>();
        for (Libiteminventoryinfo libiteminventoryinfo : inv_list) {
            GetItemInventoryInfoItem it=new GetItemInventoryInfoItem();
            it.setItemBarcode(libiteminventoryinfo.getItembarcode());
            it.setItemTitle(libiteminventoryinfo.getOcritemtitle());
            it.setLayerId(libiteminventoryinfo.getLayerid());
            it.setLayerCode(libiteminventoryinfo.getLayercode());
            it.setLayerName(libiteminventoryinfo.getLayername());

            it.setInventoryState(libiteminventoryinfo.getInventorystate());
            it.setLocLayerId(libiteminventoryinfo.getLoclayerid());
            it.setLocLayerCode(libiteminventoryinfo.getLoclayercode());
            it.setLocLayerName(libiteminventoryinfo.getLoclayername());

            it.setLastModificationTime(libiteminventoryinfo.getLastmodificationtime());
            it.setCreationTime(libiteminventoryinfo.getCreationtime());
            it.setId(libiteminventoryinfo.getId());
            items.add(it);
        }
        GetItemInventoryInfoDto dto=new GetItemInventoryInfoDto();
        dto.setTotalCount(pageInfo.getTotal());
        dto.setItems(items);
        return dto;
    }
}
