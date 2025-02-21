package com.library.owen.admin.vo;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class GetItemInventoryInfoInput {
    public Integer skipCount;
    public Integer maxResultCount;
    public String[] filter;
    public Date  minLastModificationTime;
    public Date maxLastModificationTime;
    public Integer inventoryState;
    public String locationId;
    public String structId;
    public String rowId;
    public String layerCodeFilter;
    public boolean isLoc;
    public Integer tenantId;
}
