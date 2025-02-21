/***********************************************************
 * @Description : 配置接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 20:09
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service;

import com.library.owen.admin.model.SysConfig;
import com.library.owen.core.service.CurdService;

import java.util.List;

public interface SysConfigService extends CurdService<SysConfig> {
    List<SysConfig> findByLabel(String label);
}
