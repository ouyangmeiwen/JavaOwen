package com.huawei.owen.admin.service;

import com.huawei.owen.admin.model.Libiteminventoryinfo;
import com.huawei.owen.admin.vo.GetItemInventoryInfoDto;
import com.huawei.owen.admin.vo.GetItemInventoryInfoInput;
import com.huawei.owen.core.page.PageRequest;
import com.huawei.owen.core.page.PageResult;
import com.huawei.owen.core.service.CurdCustomService;

public interface LibiteminventoryinfoService extends CurdCustomService<Libiteminventoryinfo, String> {
    /**
     * 分页查询
     *
     * @return 返回结果
     */
    PageResult findPageByMap(PageRequest pageRequest);

    GetItemInventoryInfoDto GetItemInventoryInfo(GetItemInventoryInfoInput input);
}
