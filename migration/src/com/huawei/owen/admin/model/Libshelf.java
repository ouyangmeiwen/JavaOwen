package com.huawei.owen.admin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Libshelf implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Long getCreatoruserid() {
        return creatoruserid;
    }

    public void setCreatoruserid(Long creatoruserid) {
        this.creatoruserid = creatoruserid;
    }

    public Date getLastmodificationtime() {
        return lastmodificationtime;
    }

    public void setLastmodificationtime(Date lastmodificationtime) {
        this.lastmodificationtime = lastmodificationtime;
    }

    public Long getLastmodifieruserid() {
        return lastmodifieruserid;
    }

    public void setLastmodifieruserid(Long lastmodifieruserid) {
        this.lastmodifieruserid = lastmodifieruserid;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Long getDeleteruserid() {
        return deleteruserid;
    }

    public void setDeleteruserid(Long deleteruserid) {
        this.deleteruserid = deleteruserid;
    }

    public Date getDeletiontime() {
        return deletiontime;
    }

    public void setDeletiontime(Date deletiontime) {
        this.deletiontime = deletiontime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getShelfno() {
        return shelfno;
    }

    public void setShelfno(Integer shelfno) {
        this.shelfno = shelfno;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public String getRowidentity() {
        return rowidentity;
    }

    public void setRowidentity(String rowidentity) {
        this.rowidentity = rowidentity == null ? null : rowidentity.trim();
    }

    public String getRfidreaderid() {
        return rfidreaderid;
    }

    public void setRfidreaderid(String rfidreaderid) {
        this.rfidreaderid = rfidreaderid == null ? null : rfidreaderid.trim();
    }

    public String getSerialportid() {
        return serialportid;
    }

    public void setSerialportid(String serialportid) {
        this.serialportid = serialportid == null ? null : serialportid.trim();
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    public BigDecimal getX1() {
        return x1;
    }

    public void setX1(BigDecimal x1) {
        this.x1 = x1;
    }

    public BigDecimal getY1() {
        return y1;
    }

    public void setY1(BigDecimal y1) {
        this.y1 = y1;
    }

    public BigDecimal getX2() {
        return x2;
    }

    public void setX2(BigDecimal x2) {
        this.x2 = x2;
    }

    public BigDecimal getY2() {
        return y2;
    }

    public void setY2(BigDecimal y2) {
        this.y2 = y2;
    }

    public BigDecimal getAngel() {
        return angel;
    }

    public void setAngel(BigDecimal angel) {
        this.angel = angel;
    }

    public String getStructid() {
        return structid;
    }

    public void setStructid(String structid) {
        this.structid = structid == null ? null : structid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Boolean getIsbosseyed() {
        return isbosseyed;
    }

    public void setIsbosseyed(Boolean isbosseyed) {
        this.isbosseyed = isbosseyed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", creatoruserid=").append(creatoruserid);
        sb.append(", lastmodificationtime=").append(lastmodificationtime);
        sb.append(", lastmodifieruserid=").append(lastmodifieruserid);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", deleteruserid=").append(deleteruserid);
        sb.append(", deletiontime=").append(deletiontime);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", shelfno=").append(shelfno);
        sb.append(", side=").append(side);
        sb.append(", rowidentity=").append(rowidentity);
        sb.append(", rfidreaderid=").append(rfidreaderid);
        sb.append(", serialportid=").append(serialportid);
        sb.append(", isenable=").append(isenable);
        sb.append(", x1=").append(x1);
        sb.append(", y1=").append(y1);
        sb.append(", x2=").append(x2);
        sb.append(", y2=").append(y2);
        sb.append(", angel=").append(angel);
        sb.append(", structid=").append(structid);
        sb.append(", remark=").append(remark);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", isbosseyed=").append(isbosseyed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}