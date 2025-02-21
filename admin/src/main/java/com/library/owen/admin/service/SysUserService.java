/***********************************************************
 * @Description : 用户服务实现
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 1:51
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service;

import com.library.owen.admin.model.SysUser;
import com.library.owen.admin.model.SysUserRole;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.service.CurdService;

import java.io.File;
import java.util.List;
import java.util.Set;

public interface SysUserService extends CurdService<SysUser> {
    /**
     * 获取所有的用户信息
     *
     * @return 所有的用户信息
     */
    List<SysUser> findAll();

    /**
     * 根据完整的用户名获取指定用户的完整信息
     *
     * @param userName 用户名，非模糊查询
     * @return 用户对象
     */
    SysUser findByName(String userName);

    /**
     * 获取指定用户的权限标志集合
     *
     * @param userName 用户名
     * @return 权限集合
     */
    Set<String> findPermissions(String userName);

    /**
     * 根据用户id获取用户的角色集合
     *
     * @param userId 用户id
     * @return 角色集合
     */
    List<SysUserRole> findUserRoles(Long userId);

    /**
     * 生成用户信息的excel文件
     *
     * @param pageRequest 要导出的分页查询参数
     * @return 用户信息的对象
     */
    File createUserExcelFile(PageRequest pageRequest);
}
