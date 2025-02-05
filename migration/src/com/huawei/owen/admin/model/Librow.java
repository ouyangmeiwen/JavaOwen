package com.huawei.owen.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Librow implements Serializable {
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

    public String getCatalogcode() {
        return catalogcode;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode == null ? null : catalogcode.trim();
    }

    public Integer getRowno() {
        return rowno;
    }

    public void setRowno(Integer rowno) {
        this.rowno = rowno;
    }

    public Byte getRowtype() {
        return rowtype;
    }

    public void setRowtype(Byte rowtype) {
        this.rowtype = rowtype;
    }

    public Byte getRowusagetype() {
        return rowusagetype;
    }

    public void setRowusagetype(Byte rowusagetype) {
        this.rowusagetype = rowusagetype;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
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
        sb.append(", catalogcode=").append(catalogcode);
        sb.append(", rowno=").append(rowno);
        sb.append(", rowtype=").append(rowtype);
        sb.append(", rowusagetype=").append(rowusagetype);
        sb.append(", locationid=").append(locationid);
        sb.append(", remark=").append(remark);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}