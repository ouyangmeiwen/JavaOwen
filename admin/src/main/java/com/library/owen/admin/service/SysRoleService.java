/***********************************************************
 * @Description : 角色接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 22:14
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service;

import com.library.owen.admin.model.SysMenu;
import com.library.owen.admin.model.SysRole;
import com.library.owen.admin.model.SysRoleMenu;
import com.library.owen.core.service.CurdService;

import java.util.List;

public interface SysRoleService extends CurdService<SysRole> {
    /**
     * 查询全部角色
     *
     * @return 全部角色的列表
     */
    List<SysRole> findAll();

    /**
     * 查询角色菜单集合
     *
     * @param roleId 角色的id
     * @return 查询指定角色下的菜单
     */
    List<SysMenu> findRoleMenus(Long roleId);

    /**
     * 保存角色菜单
     *
     * @param records 保存角色的菜单
     * @return 保存成功与否的标志
     */
    int saveRoleMenus(List<SysRoleMenu> records);

    /**
     * 根据名称查询
     *
     * @param name 根据角色名查询角色列表
     * @return 角色列表
     */
    List<SysRole> findByName(String name);
}
