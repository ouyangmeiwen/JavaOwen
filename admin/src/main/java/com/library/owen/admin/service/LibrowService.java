package com.library.owen.admin.service;

import com.library.owen.admin.model.Librow;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;
import com.library.owen.core.service.CurdCustomService;

public interface LibrowService extends CurdCustomService<Librow, String>{
    PageResult findPageByMap(PageRequest pageRequest);
}
