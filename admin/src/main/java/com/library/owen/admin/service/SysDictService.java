/***********************************************************
 * @Description : 字典管理接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 16:31
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service;

import com.library.owen.admin.model.SysDict;
import com.library.owen.core.service.CurdService;

import java.util.List;

public interface SysDictService extends CurdService<SysDict> {
    /**
     * 根据label名进行查询
     *
     * @param label 标签名
     * @return 字典对象列表
     */
    List<SysDict> findByLabel(String label);
}
