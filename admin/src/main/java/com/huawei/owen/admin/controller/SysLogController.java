/***********************************************************
 * @Description : 系统日志对外接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 21:36
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.controller;

import com.huawei.owen.admin.model.SysLog;
import com.huawei.owen.admin.service.SysLogService;
import com.huawei.owen.core.http.HttpResult;
import com.huawei.owen.core.page.PageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
@Api(tags = "操作日志接口")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @PostMapping("/findPage")
    @ApiOperation("获取系统日志的分页列表")
    @PreAuthorize("hasAuthority('sys:log:view')")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLogService.findPage(pageRequest));
    }

    @PostMapping("/delete")
    @ApiOperation("删除系统日志")
    @PreAuthorize("hasAuthority('sys:log:delete')")
    public HttpResult delete(@RequestBody List<SysLog> records) {
        return HttpResult.ok(sysLogService.delete(records));
    }
}
