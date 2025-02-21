package com.library.owen.admin.vo;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
@Data
public class GetItemInventoryInfoItem {
    public String itemBarcode;
    public String itemTitle;
    public String layerId;
    public String layerCode;
    public String layerName;
    public int inventoryState;
    public String locLayerId;
    public String locLayerCode;
    public String locLayerName;
    public Date lastModificationTime;
    public Date creationTime;
    public String id;
}
