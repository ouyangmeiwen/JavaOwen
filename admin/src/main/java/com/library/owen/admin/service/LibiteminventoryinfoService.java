package com.library.owen.admin.service;

import com.library.owen.admin.model.Libiteminventoryinfo;
import com.library.owen.admin.vo.GetItemInventoryInfoDto;
import com.library.owen.admin.vo.GetItemInventoryInfoInput;
import com.library.owen.core.page.PageRequest;
import com.library.owen.core.page.PageResult;
import com.library.owen.core.service.CurdCustomService;

public interface LibiteminventoryinfoService extends CurdCustomService<Libiteminventoryinfo, String> {
    /**
     * 分页查询
     *
     * @return 返回结果
     */
    PageResult findPageByMap(PageRequest pageRequest);

    GetItemInventoryInfoDto GetItemInventoryInfo(GetItemInventoryInfoInput input);
}
