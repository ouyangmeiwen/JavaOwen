package com.huawei.owen.admin.vo;

import java.util.List;

import lombok.Data;

@Data
public class GetItemInventoryInfoDto {
    public long totalCount;
    public List<GetItemInventoryInfoItem> items;
}
