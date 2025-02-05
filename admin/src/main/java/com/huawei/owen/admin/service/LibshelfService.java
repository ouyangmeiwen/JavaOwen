package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.Libshelf;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;
import com.huawei.owen.core.service.CurdCustomService;

public interface LibshelfService extends CurdCustomService<Libshelf, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
