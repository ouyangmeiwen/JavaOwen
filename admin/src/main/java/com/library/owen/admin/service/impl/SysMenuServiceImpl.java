/***********************************************************
 * @Description : 
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 19:12
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.service.impl;

import com.library.owen.admin.constant.SysConstants;
import com.library.owen.admin.mapper.SysMenuMapper;
import com.library.owen.admin.model.SysMenu;
import com.library.owen.admin.service.SysMenuService;
import com.library.owen.core.page.MyBatisPageHelper;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> findTree(String userName, int menuType) {
        List<SysMenu> sysMenus = new ArrayList<>();
        List<SysMenu> menus = findByUser(userName);
        for (SysMenu menu : menus) {
            if (menu.getParentId() == null || menu.getParentId() == 0) {
                menu.setLevel(0);
                if (!exists(sysMenus, menu)) {
                    sysMenus.add(menu);
                }
            }
        }
        sysMenus.sort((o1, o2) -> o1.getOrderNum().compareTo(o2.getOrderNum()));
        findChildren(sysMenus, menus, menuType);
        return sysMenus;
    }

    @Override
    public List<SysMenu> findByUser(String userName) {
        if (userName == null || "".equals(userName) || SysConstants.ADMIN.equalsIgnoreCase(userName)) {
            return sysMenuMapper.findAll();
        }
        return sysMenuMapper.findByUserName(userName);
    }

    private void findChildren(List<SysMenu> sysMenus, List<SysMenu> menus, int menuType) {
        for (SysMenu sysMenu : sysMenus) {
            List<SysMenu> children = new ArrayList<>();
            for (SysMenu menu : menus) {
                if (menuType == 1 && menu.getType() == 2) {
                    // 如果是获取类型不需要按钮，且菜单类型是按钮的，直接过滤掉
                    continue;
                }
                if (sysMenu.getId() != null && sysMenu.getId().equals(menu.getParentId())) {
                    menu.setParentName(sysMenu.getName());
                    menu.setLevel(sysMenu.getLevel() + 1);
                    if (!exists(children, menu)) {
                        children.add(menu);
                    }
                }
            }
            sysMenu.setChildren(children);
            children.sort((o1, o2) -> o1.getOrderNum().compareTo(o2.getOrderNum()));
            // 递归获取菜单，支持无限层级
            findChildren(children, menus, menuType);
        }
    }

    private boolean exists(List<SysMenu> sysMenus, SysMenu sysMenu) {
        boolean exist = false;
        for (SysMenu menu : sysMenus) {
            if (menu.getId().equals(sysMenu.getId())) {
                exist = true;
            }
        }
        return exist;
    }

    @Override
    public int save(SysMenu record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysMenuMapper.insertSelective(record);
        }
        if (record.getParentId() == null) {
            record.setParentId(0L);
        }
        return sysMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysMenu record) {
        return sysMenuMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysMenu> records) {
        for (SysMenu record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysMenu findById(Long id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MyBatisPageHelper.findPage(pageRequest, sysMenuMapper);
    }
}
