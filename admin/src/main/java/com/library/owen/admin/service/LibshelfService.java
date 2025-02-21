package com.library.owen.admin.service;

import com.library.owen.admin.model.Libshelf;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;
import com.library.owen.core.service.CurdCustomService;

public interface LibshelfService extends CurdCustomService<Libshelf, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
