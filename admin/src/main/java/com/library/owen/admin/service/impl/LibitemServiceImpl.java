package com.library.owen.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.library.owen.admin.mapper.LibitemMapper;
import com.library.owen.admin.model.Libitem;
import com.library.owen.admin.service.LibitemService;
import com.library.owen.admin.vo.LibitemParams;
import com.library.owen.core.page.MyBatisPageHelper;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;

@Service
public class LibitemServiceImpl implements LibitemService {

    @Autowired
    private LibitemMapper libitemMapper;

    @Override
    public int save(Libitem record) {
        if (record.getId() == null || record.getId().equals("")) {
            return libitemMapper.insertSelective(record);
        }
        return libitemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Libitem record) {
        return libitemMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<Libitem> records) {
        for (Libitem record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public Libitem findById(String id) {
        return libitemMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MyBatisPageHelper.findPage(pageRequest, libitemMapper);
    }

    @Override
    public List<Libitem> findByBarcode(String barcode) {
        return libitemMapper.findByBarcode(barcode);
    }

    @Override
    public List<Libitem> findPage() {
        return libitemMapper.findPage();
    }

    @Override
    public PageResult findPageByParams(PageRequest pageRequest) {
        String barcode = pageRequest.getParamValue("barcode");
        String title = pageRequest.getParamValue("title");
        String callno = pageRequest.getParamValue("callno");
        String isbn = pageRequest.getParamValue("isbn");
        LibitemParams cri = new LibitemParams();
        cri.setBarcode(barcode);
        cri.setTitle(title);
        cri.setCallno(callno);
        cri.setIsbn(isbn);
        return MyBatisPageHelper.findPage(pageRequest, libitemMapper,
                "findPageByParams", cri);// 反射调用findPageByMap 会报错 单独的对象可以使用，但是Map不支持
    }

    @Override
    public PageResult findPageByMap(PageRequest pageRequest) {
        String barcode = pageRequest.getParamValue("barcode");
        String title = pageRequest.getParamValue("title");
        String callno = pageRequest.getParamValue("callno");
        String isbn = pageRequest.getParamValue("isbn");
        Map<String, Object> mapparams = new HashMap<>();
        mapparams.put("barcode", barcode);
        mapparams.put("title", title);
        mapparams.put("callno", callno);
        mapparams.put("isbn", isbn);

        //开启分页查找
        MyBatisPageHelper.startPage(pageRequest);

        //构建查询语句
        List<Libitem> result= libitemMapper.findPageByMap(mapparams);
        
        //设置分页信息
        PageInfo<?> pageInfo=new PageInfo((List) result);

        //返回查询结果集
        PageResult pageResult = MyBatisPageHelper.getPageResult(pageRequest, pageInfo);
        return pageResult;
    }
}
