package com.huawei.owen.admin.controller;

import com.huawei.owen.admin.service.LiblayerService;
import com.huawei.owen.core.http.HttpResult;
import com.huawei.owen.core.page.PageRequest;

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
@RequestMapping("/gpi/liblayer")
@Api(tags = "层信息列表")
public class LiblayerController {
    @Autowired
    private LiblayerService liblayerService;

    @PostMapping("/findPage")
    @ApiOperation("获取层信息")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(liblayerService.findPage(pageRequest));
    }
}
