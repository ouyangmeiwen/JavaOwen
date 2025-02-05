/***********************************************************
 * @Description : 菜单管理
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 19:11
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.SysMenu;
import com.huawei.owen.core.service.CurdService;

import java.util.List;

public interface SysMenuService extends CurdService<SysMenu> {
    /**
     * 查询菜单树，用户名和菜单类型均为空则查询全部
     *
     * @param userName 用户名
     * @param menuType 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
     * @return 菜单树
     */
    List<SysMenu> findTree(String userName, int menuType);

    /**
     * 根据用户名得到菜单列表
     *
     * @param userName 用户名
     * @return 菜单列表
     */
    List<SysMenu> findByUser(String userName);
}
