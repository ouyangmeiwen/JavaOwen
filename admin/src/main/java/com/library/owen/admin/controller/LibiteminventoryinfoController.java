package com.library.owen.admin.controller;

import com.library.owen.admin.service.LibiteminventoryinfoService;
import com.library.owen.admin.vo.GetItemInventoryInfoInput;
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
@RequestMapping("/gpi/libiteminventoryinfo")
@Api(tags = "盘点你相关接口")
public class LibiteminventoryinfoController {
    @Autowired
    private LibiteminventoryinfoService libiteminventoryinfoService;

    @PostMapping("/findPage")
    @ApiOperation("获取盘点信息")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(libiteminventoryinfoService.findPage(pageRequest));
    }

    @PostMapping("/GetItemInventoryInfo")
    @ApiOperation("获取盘点信息")
    public HttpResult GetItemInventoryInfo(@RequestBody GetItemInventoryInfoInput input) {
        return HttpResult.ok(libiteminventoryinfoService.GetItemInventoryInfo(input));
    }


}
