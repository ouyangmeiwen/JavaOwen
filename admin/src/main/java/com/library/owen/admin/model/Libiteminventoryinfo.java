package com.library.owen.admin.model;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Libiteminventoryinfo {
    private String id;

    private Date creationtime;

    private Long creatoruserid;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private String itemtid;

    private String itemepc;

    private String layerid;

    private String antenna;

    private Byte inventorystate;

    private String itembarcode;

    private String remark;

    private Integer tenantid;

    private String layercode;

    private String exceptionmsg;

    private String ocritemauthor;

    private String ocritemcallno;

    private String ocritemisbn;

    private String ocritempublisher;

    private String ocritemtitle;

    private Byte origintype;

    private String layername;

    private String loclayercode;

    private String loclayerid;

    private String loclayername;

    private Date offshelftime;

}
