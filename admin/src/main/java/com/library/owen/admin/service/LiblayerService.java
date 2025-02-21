package com.library.owen.admin.service;

import com.library.owen.admin.model.Liblayer;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;
import com.library.owen.core.service.CurdCustomService;

public interface LiblayerService extends CurdCustomService<Liblayer, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
