package com.huawei.owen.admin.model;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Liblayer {
    private String id;

    private Date creationtime;

    private Long creatoruserid;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private Boolean isdeleted;

    private Long deleteruserid;

    private Date deletiontime;

    private String shelfid;

    private String code;

    private String name;

    private String tid;

    private String side;

    private Byte layerno;

    private Boolean isenable;

    private String remark;

    private Integer tenantid;

    private String itembarcode;

    private String itemcallno;

    private String precallno;

    private String barcode;

    private Byte origintype;
}
