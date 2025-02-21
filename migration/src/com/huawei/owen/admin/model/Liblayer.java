package com.library.owen.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Liblayer implements Serializable {
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

    public String getShelfid() {
        return shelfid;
    }

    public void setShelfid(String shelfid) {
        this.shelfid = shelfid == null ? null : shelfid.trim();
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

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public Byte getLayerno() {
        return layerno;
    }

    public void setLayerno(Byte layerno) {
        this.layerno = layerno;
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
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

    public String getItembarcode() {
        return itembarcode;
    }

    public void setItembarcode(String itembarcode) {
        this.itembarcode = itembarcode == null ? null : itembarcode.trim();
    }

    public String getItemcallno() {
        return itemcallno;
    }

    public void setItemcallno(String itemcallno) {
        this.itemcallno = itemcallno == null ? null : itemcallno.trim();
    }

    public String getPrecallno() {
        return precallno;
    }

    public void setPrecallno(String precallno) {
        this.precallno = precallno == null ? null : precallno.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Byte getOrigintype() {
        return origintype;
    }

    public void setOrigintype(Byte origintype) {
        this.origintype = origintype;
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
        sb.append(", shelfid=").append(shelfid);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", tid=").append(tid);
        sb.append(", side=").append(side);
        sb.append(", layerno=").append(layerno);
        sb.append(", isenable=").append(isenable);
        sb.append(", remark=").append(remark);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", itembarcode=").append(itembarcode);
        sb.append(", itemcallno=").append(itemcallno);
        sb.append(", precallno=").append(precallno);
        sb.append(", barcode=").append(barcode);
        sb.append(", origintype=").append(origintype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}