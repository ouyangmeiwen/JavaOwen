/***********************************************************
 * @Description : 配置接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 20:09
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.SysConfig;
import com.huawei.owen.core.service.CurdService;

import java.util.List;

public interface SysConfigService extends CurdService<SysConfig> {
    List<SysConfig> findByLabel(String label);
}
