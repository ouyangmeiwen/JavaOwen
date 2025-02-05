package com.huawei.owen.admin.model;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class Librow {
    private String id;

    private Date creationtime;

    private Long creatoruserid;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private Boolean isdeleted;

    private Long deleteruserid;

    private Date deletiontime;

    private String code;

    private String name;

    private String catalogcode;

    private Integer rowno;

    private Byte rowtype;

    private Byte rowusagetype;

    private String locationid;

    private String remark;

    private Integer tenantid;
}
