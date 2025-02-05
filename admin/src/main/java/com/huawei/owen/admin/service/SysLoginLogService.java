/***********************************************************
 * @Description : 用户登录日志接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 21:49
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.SysLoginLog;
import com.huawei.owen.core.service.CurdService;

public interface SysLoginLogService extends CurdService<SysLoginLog> {
    /**
     * 记录登录日志
     *
     * @param username 登录用户名
     * @param ipAddr   登录者的ip
     * @return 执行成功与否的错误码
     */
    int writeLoginLog(String username, String ipAddr);
}
