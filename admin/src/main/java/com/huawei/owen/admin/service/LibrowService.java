package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.Librow;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;
import com.huawei.owen.core.service.CurdCustomService;

public interface LibrowService extends CurdCustomService<Librow, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
