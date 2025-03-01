/***********************************************************
 * @Description : 部门管理接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 21:08
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service;

import com.library.owen.admin.model.SysDept;
import com.library.owen.core.service.CurdService;

import java.util.List;

public interface SysDeptService extends CurdService<SysDept> {
    /**
     * 查询部门树
     *
     * @return 部门树
     */
    List<SysDept> findTree();
}
