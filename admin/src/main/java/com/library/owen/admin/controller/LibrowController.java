package com.library.owen.admin.controller;

import com.library.owen.admin.service.LibrowService;
import com.library.owen.core.http.HttpResult;
import com.library.owen.core.page.PageRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gpi/librow")
@Api(tags = "架信息列表")
public class LibrowController {
    @Autowired
    private LibrowService librowService;

    @PostMapping("/findPage")
    @ApiOperation("获取架的信息")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(librowService.findPage(pageRequest));
    }
}
