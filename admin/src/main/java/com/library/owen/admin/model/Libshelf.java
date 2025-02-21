package com.library.owen.admin.model;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)

public class Libshelf {
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

    private Integer shelfno;

    private String side;

    private String rowidentity;

    private String rfidreaderid;

    private String serialportid;

    private Boolean isenable;

    private BigDecimal x1;

    private BigDecimal y1;

    private BigDecimal x2;

    private BigDecimal y2;

    private BigDecimal angel;

    private String structid;

    private String remark;

    private Integer tenantid;

    private Boolean isbosseyed;

}
