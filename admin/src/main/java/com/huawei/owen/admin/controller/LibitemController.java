package com.huawei.owen.admin.controller;

import com.huawei.owen.admin.model.Libitem;
import com.huawei.owen.admin.service.LibitemService;
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

@RestController
@RequestMapping("/gpi/libitem")
@Api(tags = "图书相关接口")
public class LibitemController {

    @Autowired
    private LibitemService libitemService;

    @PostMapping("/save")
    @ApiOperation("保存图书信息")
    public HttpResult save(@RequestBody Libitem record) {
        return HttpResult.ok(libitemService.save(record));
    }

    @PostMapping("/delete")
    @ApiOperation("删除图书信息")
    public HttpResult delete(@RequestBody List<String> records) {
        List<Libitem> recordItem=new ArrayList<>();
        for (String s : records) {
            Libitem libitem=new Libitem();
            libitem.setId(s);
            recordItem.add(libitem);
        }
        return HttpResult.ok(libitemService.delete(recordItem));
    }

    @PostMapping("/findPageByParams")
    @ApiOperation("获取分页图书信息")
    public HttpResult findPageByParams(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(libitemService.findPageByParams(pageRequest));
    }

    @GetMapping("/findByBarcode")
    @ApiOperation("根据条码获取图书信息")
    public HttpResult findByBarcode(@RequestParam String barcode) {
        return HttpResult.ok(libitemService.findByBarcode(barcode));
    }
    
    @PostMapping("/findPageByMap")
    @ApiOperation("获取图书信息")
    public HttpResult findPageByMap(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(libitemService.findPageByMap(pageRequest));
    }
}
