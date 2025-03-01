/***********************************************************
 * @Description : 用户登录日志获取接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 21:50
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service.impl;

import com.library.owen.admin.mapper.SysLoginLogMapper;
import com.library.owen.admin.model.SysLoginLog;
import com.library.owen.admin.service.SysLoginLogService;
import com.library.owen.core.page.MyBatisPageHelper;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysLoginLogServiceImpl implements SysLoginLogService {
    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Override
    public int save(SysLoginLog record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysLoginLogMapper.insertSelective(record);
        }
        return sysLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysLoginLog record) {
        return sysLoginLogMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysLoginLog> records) {
        for (SysLoginLog record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysLoginLog findById(Long id) {
        return sysLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object userName = pageRequest.getParamValue("userName");
        if (userName != null) {
            return MyBatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByUserName", userName);
        }
        Object status = pageRequest.getParamValue("status");
        if (status != null) {
            return MyBatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByStatus", status);
        }
        return MyBatisPageHelper.findPage(pageRequest, sysLoginLogMapper);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int writeLoginLog(String userName, String ip) {
        List<SysLoginLog> sysLoginLogs = sysLoginLogMapper.findByUserNameAndStatus(userName, SysLoginLog.STATUS_ONLINE);
        for (SysLoginLog sysLoginLog : sysLoginLogs) {
            sysLoginLog.setStatus(SysLoginLog.STATUS_LOGIN);
            sysLoginLogMapper.updateByPrimaryKey(sysLoginLog);
        }
        SysLoginLog record = new SysLoginLog();
        record.setUserName(userName);
        record.setIp(ip);
        record.setStatus(SysLoginLog.STATUS_LOGOUT);
        sysLoginLogMapper.insertSelective(record);
        record.setStatus(SysLoginLog.STATUS_ONLINE);
        sysLoginLogMapper.insertSelective(record);
        return 0;
    }
}
