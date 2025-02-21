/***********************************************************
 * @Description : 字段管理接口实现
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 16:32
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service.impl;

import com.library.owen.admin.mapper.SysDictMapper;
import com.library.owen.admin.model.SysDict;
import com.library.owen.admin.service.SysDictService;
import com.library.owen.core.page.MyBatisPageHelper;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findByLabel(label);
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysDictMapper.insertSelective(record);
        }
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        for (SysDict record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParamValue("label");
        if (label != null) {
            return MyBatisPageHelper.findPage(pageRequest, sysDictMapper, "findPageByLabel", label);
        }
        return MyBatisPageHelper.findPage(pageRequest, sysDictMapper);
    }
}
