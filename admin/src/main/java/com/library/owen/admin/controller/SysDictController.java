/***********************************************************
 * @Description : 字典管理接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 16:44
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.controller;

import com.library.owen.admin.model.SysDict;
import com.library.owen.admin.service.SysDictService;
import com.library.owen.core.http.HttpResult;
import com.library.owen.core.page.PageRequest;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dict")
@Api(tags = "字典管理接口")
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sys:dict:add') AND hasAuthority('sys:dict:edit')")
    public HttpResult save(@RequestBody SysDict record) {
        return HttpResult.ok(sysDictService.save(record));
    }

    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sys:dict:delete')")
    public HttpResult delete(@RequestBody List<SysDict> records) {
        return HttpResult.ok(sysDictService.delete(records));
    }

    @PostMapping("/findPage")
    @PreAuthorize("hasAuthority('sys:dict:view')")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }

    @GetMapping("/findByLabel")
    @PreAuthorize("hasAuthority('sys:dict:view')")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysDictService.findByLabel(label));
    }
}
