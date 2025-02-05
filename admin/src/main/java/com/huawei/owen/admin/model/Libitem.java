package com.huawei.owen.admin.model;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Libitem {
    /**
     */
    private String id;

    /**
     */
    private Date creationtime;

    /**
     */
    private Long creatoruserid;

    /**
     */
    private Date lastmodificationtime;

    /**
     */
    private Long lastmodifieruserid;

    /**
     */
    private Boolean isdeleted;

    /**
     */
    private Long deleteruserid;

    /**
     */
    private Date deletiontime;

    /**
     */
    private String infoid;

    /**
     */
    private String title;

    /**
     */
    private String author;

    /**
     */
    private String barcode;

    /**
     */
    private Boolean isenable;

    /**
     */
    private String callno;

    /**
     */
    private String precallno;

    /**
     */
    private String catalogcode;

    /**
     */
    private Byte itemstate;

    /**
     */
    private String pressmarkid;

    /**
     */
    private String pressmarkname;

    /**
     */
    private String locationid;

    /**
     */
    private String locationname;

    /**
     */
    private String bookbarcode;

    /**
     */
    private String isbn;

    /**
     */
    private Short pubno;

    /**
     */
    private String publisher;

    /**
     */
    private String pubdate;

    /**
     */
    private String price;

    /**
     */
    private String pages;

    /**
     */
    private Byte itemtype;

    /**
     */
    private String remark;

    /**
     */
    private Byte origintype;

    /**
     */
    private Byte createtype;

    /**
     */
    private Integer tenantid;

    /**
     */
    private String summary;
}
