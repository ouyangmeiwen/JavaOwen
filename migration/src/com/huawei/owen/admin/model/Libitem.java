package com.huawei.owen.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Libitem implements Serializable {
    private String id;

    private Date creationtime;

    private Long creatoruserid;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private Boolean isdeleted;

    private Long deleteruserid;

    private Date deletiontime;

    private String infoid;

    private String title;

    private String author;

    private String barcode;

    private Boolean isenable;

    private String callno;

    private String precallno;

    private String catalogcode;

    private Byte itemstate;

    private String pressmarkid;

    private String pressmarkname;

    private String locationid;

    private String locationname;

    private String bookbarcode;

    private String isbn;

    private Short pubno;

    private String publisher;

    private String pubdate;

    private String price;

    private String pages;

    private Byte itemtype;

    private String remark;

    private Byte origintype;

    private Byte createtype;

    private Integer tenantid;

    private String summary;

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

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        this.callno = callno == null ? null : callno.trim();
    }

    public String getPrecallno() {
        return precallno;
    }

    public void setPrecallno(String precallno) {
        this.precallno = precallno == null ? null : precallno.trim();
    }

    public String getCatalogcode() {
        return catalogcode;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode == null ? null : catalogcode.trim();
    }

    public Byte getItemstate() {
        return itemstate;
    }

    public void setItemstate(Byte itemstate) {
        this.itemstate = itemstate;
    }

    public String getPressmarkid() {
        return pressmarkid;
    }

    public void setPressmarkid(String pressmarkid) {
        this.pressmarkid = pressmarkid == null ? null : pressmarkid.trim();
    }

    public String getPressmarkname() {
        return pressmarkname;
    }

    public void setPressmarkname(String pressmarkname) {
        this.pressmarkname = pressmarkname == null ? null : pressmarkname.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public String getBookbarcode() {
        return bookbarcode;
    }

    public void setBookbarcode(String bookbarcode) {
        this.bookbarcode = bookbarcode == null ? null : bookbarcode.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Short getPubno() {
        return pubno;
    }

    public void setPubno(Short pubno) {
        this.pubno = pubno;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate == null ? null : pubdate.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages == null ? null : pages.trim();
    }

    public Byte getItemtype() {
        return itemtype;
    }

    public void setItemtype(Byte itemtype) {
        this.itemtype = itemtype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getOrigintype() {
        return origintype;
    }

    public void setOrigintype(Byte origintype) {
        this.origintype = origintype;
    }

    public Byte getCreatetype() {
        return createtype;
    }

    public void setCreatetype(Byte createtype) {
        this.createtype = createtype;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
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
        sb.append(", infoid=").append(infoid);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", barcode=").append(barcode);
        sb.append(", isenable=").append(isenable);
        sb.append(", callno=").append(callno);
        sb.append(", precallno=").append(precallno);
        sb.append(", catalogcode=").append(catalogcode);
        sb.append(", itemstate=").append(itemstate);
        sb.append(", pressmarkid=").append(pressmarkid);
        sb.append(", pressmarkname=").append(pressmarkname);
        sb.append(", locationid=").append(locationid);
        sb.append(", locationname=").append(locationname);
        sb.append(", bookbarcode=").append(bookbarcode);
        sb.append(", isbn=").append(isbn);
        sb.append(", pubno=").append(pubno);
        sb.append(", publisher=").append(publisher);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", price=").append(price);
        sb.append(", pages=").append(pages);
        sb.append(", itemtype=").append(itemtype);
        sb.append(", remark=").append(remark);
        sb.append(", origintype=").append(origintype);
        sb.append(", createtype=").append(createtype);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", summary=").append(summary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}