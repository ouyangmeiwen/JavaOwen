package com.huawei.owen.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.huawei.owen.admin.mapper.LibrowMapper;
import com.huawei.owen.admin.model.Librow;
import com.huawei.owen.admin.service.LibrowService;
import com.huawei.owen.core.page.MyBatisPageHelper;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;

@Service
public class LibrowServiceImpl implements LibrowService {


    @Autowired
    private LibrowMapper librowMapper;

    @Override
    public int save(Librow record) {
        if (record.getId() == null || record.getId().equals("")) {
            return librowMapper.insertSelective(record);
        }
        return librowMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Librow record) {
        return librowMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<Librow> records) {
       for (Librow record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public Librow findById(String id) {
        return librowMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MyBatisPageHelper.findPage(pageRequest, librowMapper);
    }

    @Override
    public PageResult findPageByMap(PageRequest pageRequest) {
        String id = pageRequest.getParamValue("id");
        Map<String, Object> mapparams = new HashMap<>();
        mapparams.put("id", id);

        //开启分页查找
        MyBatisPageHelper.startPage(pageRequest);

        //构建查询语句
        List<?> result= librowMapper.findPageByMap(mapparams);
        
        //设置分页信息
        PageInfo<?> pageInfo=new PageInfo((List) result);

        //返回查询结果集
        PageResult pageResult = MyBatisPageHelper.getPageResult(pageRequest, pageInfo);
        return pageResult;
    }
}
