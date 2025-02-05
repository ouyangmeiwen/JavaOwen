package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.Liblayer;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;
import com.huawei.owen.core.service.CurdCustomService;

public interface LiblayerService extends CurdCustomService<Liblayer, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
