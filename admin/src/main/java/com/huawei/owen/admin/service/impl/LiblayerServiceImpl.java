package com.huawei.owen.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.huawei.owen.admin.mapper.LiblayerMapper;
import com.huawei.owen.admin.model.Liblayer;
import com.huawei.owen.admin.service.LiblayerService;
import com.huawei.owen.core.page.MyBatisPageHelper;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;

@Service
public class LiblayerServiceImpl implements LiblayerService {

    @Autowired
    private LiblayerMapper liblayerMapper;


    @Override
    public int save(Liblayer record) {
        if (record.getId() == null || record.getId().equals("")) {
            return liblayerMapper.insertSelective(record);
        }
        return liblayerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Liblayer record) {
        return liblayerMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<Liblayer> records) {
       for (Liblayer record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public Liblayer findById(String id) {
        return liblayerMapper.selectByPrimaryKey(id);

    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
          return MyBatisPageHelper.findPage(pageRequest, liblayerMapper);
    }

    @Override
    public PageResult findPageByMap(PageRequest pageRequest) {
        String id = pageRequest.getParamValue("id");
        Map<String, Object> mapparams = new HashMap<>();
        mapparams.put("id", id);

        //开启分页查找
        MyBatisPageHelper.startPage(pageRequest);

        //构建查询语句
        List<?> result= liblayerMapper.findPageByMap(mapparams);
        
        //设置分页信息
        PageInfo<?> pageInfo=new PageInfo((List) result);

        //返回查询结果集
        PageResult pageResult = MyBatisPageHelper.getPageResult(pageRequest, pageInfo);
        return pageResult;
    }
    
}
