package com.library.owen.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Libiteminventoryinfo implements Serializable {
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

    public String getItemtid() {
        return itemtid;
    }

    public void setItemtid(String itemtid) {
        this.itemtid = itemtid == null ? null : itemtid.trim();
    }

    public String getItemepc() {
        return itemepc;
    }

    public void setItemepc(String itemepc) {
        this.itemepc = itemepc == null ? null : itemepc.trim();
    }

    public String getLayerid() {
        return layerid;
    }

    public void setLayerid(String layerid) {
        this.layerid = layerid == null ? null : layerid.trim();
    }

    public String getAntenna() {
        return antenna;
    }

    public void setAntenna(String antenna) {
        this.antenna = antenna == null ? null : antenna.trim();
    }

    public Byte getInventorystate() {
        return inventorystate;
    }

    public void setInventorystate(Byte inventorystate) {
        this.inventorystate = inventorystate;
    }

    public String getItembarcode() {
        return itembarcode;
    }

    public void setItembarcode(String itembarcode) {
        this.itembarcode = itembarcode == null ? null : itembarcode.trim();
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

    public String getLayercode() {
        return layercode;
    }

    public void setLayercode(String layercode) {
        this.layercode = layercode == null ? null : layercode.trim();
    }

    public String getExceptionmsg() {
        return exceptionmsg;
    }

    public void setExceptionmsg(String exceptionmsg) {
        this.exceptionmsg = exceptionmsg == null ? null : exceptionmsg.trim();
    }

    public String getOcritemauthor() {
        return ocritemauthor;
    }

    public void setOcritemauthor(String ocritemauthor) {
        this.ocritemauthor = ocritemauthor == null ? null : ocritemauthor.trim();
    }

    public String getOcritemcallno() {
        return ocritemcallno;
    }

    public void setOcritemcallno(String ocritemcallno) {
        this.ocritemcallno = ocritemcallno == null ? null : ocritemcallno.trim();
    }

    public String getOcritemisbn() {
        return ocritemisbn;
    }

    public void setOcritemisbn(String ocritemisbn) {
        this.ocritemisbn = ocritemisbn == null ? null : ocritemisbn.trim();
    }

    public String getOcritempublisher() {
        return ocritempublisher;
    }

    public void setOcritempublisher(String ocritempublisher) {
        this.ocritempublisher = ocritempublisher == null ? null : ocritempublisher.trim();
    }

    public String getOcritemtitle() {
        return ocritemtitle;
    }

    public void setOcritemtitle(String ocritemtitle) {
        this.ocritemtitle = ocritemtitle == null ? null : ocritemtitle.trim();
    }

    public Byte getOrigintype() {
        return origintype;
    }

    public void setOrigintype(Byte origintype) {
        this.origintype = origintype;
    }

    public String getLayername() {
        return layername;
    }

    public void setLayername(String layername) {
        this.layername = layername == null ? null : layername.trim();
    }

    public String getLoclayercode() {
        return loclayercode;
    }

    public void setLoclayercode(String loclayercode) {
        this.loclayercode = loclayercode == null ? null : loclayercode.trim();
    }

    public String getLoclayerid() {
        return loclayerid;
    }

    public void setLoclayerid(String loclayerid) {
        this.loclayerid = loclayerid == null ? null : loclayerid.trim();
    }

    public String getLoclayername() {
        return loclayername;
    }

    public void setLoclayername(String loclayername) {
        this.loclayername = loclayername == null ? null : loclayername.trim();
    }

    public Date getOffshelftime() {
        return offshelftime;
    }

    public void setOffshelftime(Date offshelftime) {
        this.offshelftime = offshelftime;
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
        sb.append(", itemtid=").append(itemtid);
        sb.append(", itemepc=").append(itemepc);
        sb.append(", layerid=").append(layerid);
        sb.append(", antenna=").append(antenna);
        sb.append(", inventorystate=").append(inventorystate);
        sb.append(", itembarcode=").append(itembarcode);
        sb.append(", remark=").append(remark);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", layercode=").append(layercode);
        sb.append(", exceptionmsg=").append(exceptionmsg);
        sb.append(", ocritemauthor=").append(ocritemauthor);
        sb.append(", ocritemcallno=").append(ocritemcallno);
        sb.append(", ocritemisbn=").append(ocritemisbn);
        sb.append(", ocritempublisher=").append(ocritempublisher);
        sb.append(", ocritemtitle=").append(ocritemtitle);
        sb.append(", origintype=").append(origintype);
        sb.append(", layername=").append(layername);
        sb.append(", loclayercode=").append(loclayercode);
        sb.append(", loclayerid=").append(loclayerid);
        sb.append(", loclayername=").append(loclayername);
        sb.append(", offshelftime=").append(offshelftime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}