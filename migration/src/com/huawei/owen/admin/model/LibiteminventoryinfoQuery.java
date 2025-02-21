package com.library.owen.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibiteminventoryinfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LibiteminventoryinfoQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CreationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("CreationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("CreationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("CreationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("CreationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("CreationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("CreationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("CreationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("CreationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("CreationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIsNull() {
            addCriterion("CreatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIsNotNull() {
            addCriterion("CreatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridEqualTo(Long value) {
            addCriterion("CreatorUserId =", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotEqualTo(Long value) {
            addCriterion("CreatorUserId <>", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThan(Long value) {
            addCriterion("CreatorUserId >", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("CreatorUserId >=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThan(Long value) {
            addCriterion("CreatorUserId <", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThanOrEqualTo(Long value) {
            addCriterion("CreatorUserId <=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIn(List<Long> values) {
            addCriterion("CreatorUserId in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotIn(List<Long> values) {
            addCriterion("CreatorUserId not in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridBetween(Long value1, Long value2) {
            addCriterion("CreatorUserId between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotBetween(Long value1, Long value2) {
            addCriterion("CreatorUserId not between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNull() {
            addCriterion("LastModificationTime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNotNull() {
            addCriterion("LastModificationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeEqualTo(Date value) {
            addCriterion("LastModificationTime =", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotEqualTo(Date value) {
            addCriterion("LastModificationTime <>", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThan(Date value) {
            addCriterion("LastModificationTime >", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModificationTime >=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThan(Date value) {
            addCriterion("LastModificationTime <", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModificationTime <=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIn(List<Date> values) {
            addCriterion("LastModificationTime in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotIn(List<Date> values) {
            addCriterion("LastModificationTime not in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeBetween(Date value1, Date value2) {
            addCriterion("LastModificationTime between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModificationTime not between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIsNull() {
            addCriterion("LastModifierUserId is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIsNotNull() {
            addCriterion("LastModifierUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridEqualTo(Long value) {
            addCriterion("LastModifierUserId =", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotEqualTo(Long value) {
            addCriterion("LastModifierUserId <>", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridGreaterThan(Long value) {
            addCriterion("LastModifierUserId >", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("LastModifierUserId >=", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridLessThan(Long value) {
            addCriterion("LastModifierUserId <", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridLessThanOrEqualTo(Long value) {
            addCriterion("LastModifierUserId <=", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIn(List<Long> values) {
            addCriterion("LastModifierUserId in", values, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotIn(List<Long> values) {
            addCriterion("LastModifierUserId not in", values, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridBetween(Long value1, Long value2) {
            addCriterion("LastModifierUserId between", value1, value2, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotBetween(Long value1, Long value2) {
            addCriterion("LastModifierUserId not between", value1, value2, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andItemtidIsNull() {
            addCriterion("ItemTid is null");
            return (Criteria) this;
        }

        public Criteria andItemtidIsNotNull() {
            addCriterion("ItemTid is not null");
            return (Criteria) this;
        }

        public Criteria andItemtidEqualTo(String value) {
            addCriterion("ItemTid =", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidNotEqualTo(String value) {
            addCriterion("ItemTid <>", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidGreaterThan(String value) {
            addCriterion("ItemTid >", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidGreaterThanOrEqualTo(String value) {
            addCriterion("ItemTid >=", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidLessThan(String value) {
            addCriterion("ItemTid <", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidLessThanOrEqualTo(String value) {
            addCriterion("ItemTid <=", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidLike(String value) {
            addCriterion("ItemTid like", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidNotLike(String value) {
            addCriterion("ItemTid not like", value, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidIn(List<String> values) {
            addCriterion("ItemTid in", values, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidNotIn(List<String> values) {
            addCriterion("ItemTid not in", values, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidBetween(String value1, String value2) {
            addCriterion("ItemTid between", value1, value2, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemtidNotBetween(String value1, String value2) {
            addCriterion("ItemTid not between", value1, value2, "itemtid");
            return (Criteria) this;
        }

        public Criteria andItemepcIsNull() {
            addCriterion("ItemEpc is null");
            return (Criteria) this;
        }

        public Criteria andItemepcIsNotNull() {
            addCriterion("ItemEpc is not null");
            return (Criteria) this;
        }

        public Criteria andItemepcEqualTo(String value) {
            addCriterion("ItemEpc =", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcNotEqualTo(String value) {
            addCriterion("ItemEpc <>", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcGreaterThan(String value) {
            addCriterion("ItemEpc >", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcGreaterThanOrEqualTo(String value) {
            addCriterion("ItemEpc >=", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcLessThan(String value) {
            addCriterion("ItemEpc <", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcLessThanOrEqualTo(String value) {
            addCriterion("ItemEpc <=", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcLike(String value) {
            addCriterion("ItemEpc like", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcNotLike(String value) {
            addCriterion("ItemEpc not like", value, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcIn(List<String> values) {
            addCriterion("ItemEpc in", values, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcNotIn(List<String> values) {
            addCriterion("ItemEpc not in", values, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcBetween(String value1, String value2) {
            addCriterion("ItemEpc between", value1, value2, "itemepc");
            return (Criteria) this;
        }

        public Criteria andItemepcNotBetween(String value1, String value2) {
            addCriterion("ItemEpc not between", value1, value2, "itemepc");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNull() {
            addCriterion("LayerId is null");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNotNull() {
            addCriterion("LayerId is not null");
            return (Criteria) this;
        }

        public Criteria andLayeridEqualTo(String value) {
            addCriterion("LayerId =", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotEqualTo(String value) {
            addCriterion("LayerId <>", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThan(String value) {
            addCriterion("LayerId >", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThanOrEqualTo(String value) {
            addCriterion("LayerId >=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThan(String value) {
            addCriterion("LayerId <", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThanOrEqualTo(String value) {
            addCriterion("LayerId <=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLike(String value) {
            addCriterion("LayerId like", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotLike(String value) {
            addCriterion("LayerId not like", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridIn(List<String> values) {
            addCriterion("LayerId in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotIn(List<String> values) {
            addCriterion("LayerId not in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridBetween(String value1, String value2) {
            addCriterion("LayerId between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotBetween(String value1, String value2) {
            addCriterion("LayerId not between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andAntennaIsNull() {
            addCriterion("Antenna is null");
            return (Criteria) this;
        }

        public Criteria andAntennaIsNotNull() {
            addCriterion("Antenna is not null");
            return (Criteria) this;
        }

        public Criteria andAntennaEqualTo(String value) {
            addCriterion("Antenna =", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaNotEqualTo(String value) {
            addCriterion("Antenna <>", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaGreaterThan(String value) {
            addCriterion("Antenna >", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaGreaterThanOrEqualTo(String value) {
            addCriterion("Antenna >=", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaLessThan(String value) {
            addCriterion("Antenna <", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaLessThanOrEqualTo(String value) {
            addCriterion("Antenna <=", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaLike(String value) {
            addCriterion("Antenna like", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaNotLike(String value) {
            addCriterion("Antenna not like", value, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaIn(List<String> values) {
            addCriterion("Antenna in", values, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaNotIn(List<String> values) {
            addCriterion("Antenna not in", values, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaBetween(String value1, String value2) {
            addCriterion("Antenna between", value1, value2, "antenna");
            return (Criteria) this;
        }

        public Criteria andAntennaNotBetween(String value1, String value2) {
            addCriterion("Antenna not between", value1, value2, "antenna");
            return (Criteria) this;
        }

        public Criteria andInventorystateIsNull() {
            addCriterion("InventoryState is null");
            return (Criteria) this;
        }

        public Criteria andInventorystateIsNotNull() {
            addCriterion("InventoryState is not null");
            return (Criteria) this;
        }

        public Criteria andInventorystateEqualTo(Byte value) {
            addCriterion("InventoryState =", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotEqualTo(Byte value) {
            addCriterion("InventoryState <>", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateGreaterThan(Byte value) {
            addCriterion("InventoryState >", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateGreaterThanOrEqualTo(Byte value) {
            addCriterion("InventoryState >=", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateLessThan(Byte value) {
            addCriterion("InventoryState <", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateLessThanOrEqualTo(Byte value) {
            addCriterion("InventoryState <=", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateIn(List<Byte> values) {
            addCriterion("InventoryState in", values, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotIn(List<Byte> values) {
            addCriterion("InventoryState not in", values, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateBetween(Byte value1, Byte value2) {
            addCriterion("InventoryState between", value1, value2, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotBetween(Byte value1, Byte value2) {
            addCriterion("InventoryState not between", value1, value2, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andItembarcodeIsNull() {
            addCriterion("ItemBarcode is null");
            return (Criteria) this;
        }

        public Criteria andItembarcodeIsNotNull() {
            addCriterion("ItemBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andItembarcodeEqualTo(String value) {
            addCriterion("ItemBarcode =", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeNotEqualTo(String value) {
            addCriterion("ItemBarcode <>", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeGreaterThan(String value) {
            addCriterion("ItemBarcode >", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ItemBarcode >=", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeLessThan(String value) {
            addCriterion("ItemBarcode <", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeLessThanOrEqualTo(String value) {
            addCriterion("ItemBarcode <=", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeLike(String value) {
            addCriterion("ItemBarcode like", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeNotLike(String value) {
            addCriterion("ItemBarcode not like", value, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeIn(List<String> values) {
            addCriterion("ItemBarcode in", values, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeNotIn(List<String> values) {
            addCriterion("ItemBarcode not in", values, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeBetween(String value1, String value2) {
            addCriterion("ItemBarcode between", value1, value2, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andItembarcodeNotBetween(String value1, String value2) {
            addCriterion("ItemBarcode not between", value1, value2, "itembarcode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TenantId is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TenantId is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Integer value) {
            addCriterion("TenantId =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Integer value) {
            addCriterion("TenantId <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Integer value) {
            addCriterion("TenantId >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenantId >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Integer value) {
            addCriterion("TenantId <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Integer value) {
            addCriterion("TenantId <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Integer> values) {
            addCriterion("TenantId in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Integer> values) {
            addCriterion("TenantId not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Integer value1, Integer value2) {
            addCriterion("TenantId between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenantId not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andLayercodeIsNull() {
            addCriterion("LayerCode is null");
            return (Criteria) this;
        }

        public Criteria andLayercodeIsNotNull() {
            addCriterion("LayerCode is not null");
            return (Criteria) this;
        }

        public Criteria andLayercodeEqualTo(String value) {
            addCriterion("LayerCode =", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeNotEqualTo(String value) {
            addCriterion("LayerCode <>", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeGreaterThan(String value) {
            addCriterion("LayerCode >", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("LayerCode >=", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeLessThan(String value) {
            addCriterion("LayerCode <", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeLessThanOrEqualTo(String value) {
            addCriterion("LayerCode <=", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeLike(String value) {
            addCriterion("LayerCode like", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeNotLike(String value) {
            addCriterion("LayerCode not like", value, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeIn(List<String> values) {
            addCriterion("LayerCode in", values, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeNotIn(List<String> values) {
            addCriterion("LayerCode not in", values, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeBetween(String value1, String value2) {
            addCriterion("LayerCode between", value1, value2, "layercode");
            return (Criteria) this;
        }

        public Criteria andLayercodeNotBetween(String value1, String value2) {
            addCriterion("LayerCode not between", value1, value2, "layercode");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgIsNull() {
            addCriterion("ExceptionMsg is null");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgIsNotNull() {
            addCriterion("ExceptionMsg is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgEqualTo(String value) {
            addCriterion("ExceptionMsg =", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgNotEqualTo(String value) {
            addCriterion("ExceptionMsg <>", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgGreaterThan(String value) {
            addCriterion("ExceptionMsg >", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgGreaterThanOrEqualTo(String value) {
            addCriterion("ExceptionMsg >=", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgLessThan(String value) {
            addCriterion("ExceptionMsg <", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgLessThanOrEqualTo(String value) {
            addCriterion("ExceptionMsg <=", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgLike(String value) {
            addCriterion("ExceptionMsg like", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgNotLike(String value) {
            addCriterion("ExceptionMsg not like", value, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgIn(List<String> values) {
            addCriterion("ExceptionMsg in", values, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgNotIn(List<String> values) {
            addCriterion("ExceptionMsg not in", values, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgBetween(String value1, String value2) {
            addCriterion("ExceptionMsg between", value1, value2, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andExceptionmsgNotBetween(String value1, String value2) {
            addCriterion("ExceptionMsg not between", value1, value2, "exceptionmsg");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorIsNull() {
            addCriterion("OCRItemAuthor is null");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorIsNotNull() {
            addCriterion("OCRItemAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorEqualTo(String value) {
            addCriterion("OCRItemAuthor =", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorNotEqualTo(String value) {
            addCriterion("OCRItemAuthor <>", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorGreaterThan(String value) {
            addCriterion("OCRItemAuthor >", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorGreaterThanOrEqualTo(String value) {
            addCriterion("OCRItemAuthor >=", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorLessThan(String value) {
            addCriterion("OCRItemAuthor <", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorLessThanOrEqualTo(String value) {
            addCriterion("OCRItemAuthor <=", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorLike(String value) {
            addCriterion("OCRItemAuthor like", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorNotLike(String value) {
            addCriterion("OCRItemAuthor not like", value, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorIn(List<String> values) {
            addCriterion("OCRItemAuthor in", values, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorNotIn(List<String> values) {
            addCriterion("OCRItemAuthor not in", values, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorBetween(String value1, String value2) {
            addCriterion("OCRItemAuthor between", value1, value2, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemauthorNotBetween(String value1, String value2) {
            addCriterion("OCRItemAuthor not between", value1, value2, "ocritemauthor");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoIsNull() {
            addCriterion("OCRItemCallNo is null");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoIsNotNull() {
            addCriterion("OCRItemCallNo is not null");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoEqualTo(String value) {
            addCriterion("OCRItemCallNo =", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoNotEqualTo(String value) {
            addCriterion("OCRItemCallNo <>", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoGreaterThan(String value) {
            addCriterion("OCRItemCallNo >", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoGreaterThanOrEqualTo(String value) {
            addCriterion("OCRItemCallNo >=", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoLessThan(String value) {
            addCriterion("OCRItemCallNo <", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoLessThanOrEqualTo(String value) {
            addCriterion("OCRItemCallNo <=", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoLike(String value) {
            addCriterion("OCRItemCallNo like", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoNotLike(String value) {
            addCriterion("OCRItemCallNo not like", value, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoIn(List<String> values) {
            addCriterion("OCRItemCallNo in", values, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoNotIn(List<String> values) {
            addCriterion("OCRItemCallNo not in", values, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoBetween(String value1, String value2) {
            addCriterion("OCRItemCallNo between", value1, value2, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemcallnoNotBetween(String value1, String value2) {
            addCriterion("OCRItemCallNo not between", value1, value2, "ocritemcallno");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnIsNull() {
            addCriterion("OCRItemISBN is null");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnIsNotNull() {
            addCriterion("OCRItemISBN is not null");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnEqualTo(String value) {
            addCriterion("OCRItemISBN =", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnNotEqualTo(String value) {
            addCriterion("OCRItemISBN <>", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnGreaterThan(String value) {
            addCriterion("OCRItemISBN >", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnGreaterThanOrEqualTo(String value) {
            addCriterion("OCRItemISBN >=", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnLessThan(String value) {
            addCriterion("OCRItemISBN <", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnLessThanOrEqualTo(String value) {
            addCriterion("OCRItemISBN <=", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnLike(String value) {
            addCriterion("OCRItemISBN like", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnNotLike(String value) {
            addCriterion("OCRItemISBN not like", value, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnIn(List<String> values) {
            addCriterion("OCRItemISBN in", values, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnNotIn(List<String> values) {
            addCriterion("OCRItemISBN not in", values, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnBetween(String value1, String value2) {
            addCriterion("OCRItemISBN between", value1, value2, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritemisbnNotBetween(String value1, String value2) {
            addCriterion("OCRItemISBN not between", value1, value2, "ocritemisbn");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherIsNull() {
            addCriterion("OCRItemPublisher is null");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherIsNotNull() {
            addCriterion("OCRItemPublisher is not null");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherEqualTo(String value) {
            addCriterion("OCRItemPublisher =", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherNotEqualTo(String value) {
            addCriterion("OCRItemPublisher <>", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherGreaterThan(String value) {
            addCriterion("OCRItemPublisher >", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherGreaterThanOrEqualTo(String value) {
            addCriterion("OCRItemPublisher >=", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherLessThan(String value) {
            addCriterion("OCRItemPublisher <", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherLessThanOrEqualTo(String value) {
            addCriterion("OCRItemPublisher <=", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherLike(String value) {
            addCriterion("OCRItemPublisher like", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherNotLike(String value) {
            addCriterion("OCRItemPublisher not like", value, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherIn(List<String> values) {
            addCriterion("OCRItemPublisher in", values, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherNotIn(List<String> values) {
            addCriterion("OCRItemPublisher not in", values, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherBetween(String value1, String value2) {
            addCriterion("OCRItemPublisher between", value1, value2, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritempublisherNotBetween(String value1, String value2) {
            addCriterion("OCRItemPublisher not between", value1, value2, "ocritempublisher");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleIsNull() {
            addCriterion("OCRItemTitle is null");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleIsNotNull() {
            addCriterion("OCRItemTitle is not null");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleEqualTo(String value) {
            addCriterion("OCRItemTitle =", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleNotEqualTo(String value) {
            addCriterion("OCRItemTitle <>", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleGreaterThan(String value) {
            addCriterion("OCRItemTitle >", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleGreaterThanOrEqualTo(String value) {
            addCriterion("OCRItemTitle >=", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleLessThan(String value) {
            addCriterion("OCRItemTitle <", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleLessThanOrEqualTo(String value) {
            addCriterion("OCRItemTitle <=", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleLike(String value) {
            addCriterion("OCRItemTitle like", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleNotLike(String value) {
            addCriterion("OCRItemTitle not like", value, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleIn(List<String> values) {
            addCriterion("OCRItemTitle in", values, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleNotIn(List<String> values) {
            addCriterion("OCRItemTitle not in", values, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleBetween(String value1, String value2) {
            addCriterion("OCRItemTitle between", value1, value2, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOcritemtitleNotBetween(String value1, String value2) {
            addCriterion("OCRItemTitle not between", value1, value2, "ocritemtitle");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIsNull() {
            addCriterion("OriginType is null");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIsNotNull() {
            addCriterion("OriginType is not null");
            return (Criteria) this;
        }

        public Criteria andOrigintypeEqualTo(Byte value) {
            addCriterion("OriginType =", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotEqualTo(Byte value) {
            addCriterion("OriginType <>", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeGreaterThan(Byte value) {
            addCriterion("OriginType >", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OriginType >=", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeLessThan(Byte value) {
            addCriterion("OriginType <", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeLessThanOrEqualTo(Byte value) {
            addCriterion("OriginType <=", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIn(List<Byte> values) {
            addCriterion("OriginType in", values, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotIn(List<Byte> values) {
            addCriterion("OriginType not in", values, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeBetween(Byte value1, Byte value2) {
            addCriterion("OriginType between", value1, value2, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotBetween(Byte value1, Byte value2) {
            addCriterion("OriginType not between", value1, value2, "origintype");
            return (Criteria) this;
        }

        public Criteria andLayernameIsNull() {
            addCriterion("LayerName is null");
            return (Criteria) this;
        }

        public Criteria andLayernameIsNotNull() {
            addCriterion("LayerName is not null");
            return (Criteria) this;
        }

        public Criteria andLayernameEqualTo(String value) {
            addCriterion("LayerName =", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotEqualTo(String value) {
            addCriterion("LayerName <>", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThan(String value) {
            addCriterion("LayerName >", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThanOrEqualTo(String value) {
            addCriterion("LayerName >=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThan(String value) {
            addCriterion("LayerName <", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThanOrEqualTo(String value) {
            addCriterion("LayerName <=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLike(String value) {
            addCriterion("LayerName like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotLike(String value) {
            addCriterion("LayerName not like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameIn(List<String> values) {
            addCriterion("LayerName in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotIn(List<String> values) {
            addCriterion("LayerName not in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameBetween(String value1, String value2) {
            addCriterion("LayerName between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotBetween(String value1, String value2) {
            addCriterion("LayerName not between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeIsNull() {
            addCriterion("LocLayerCode is null");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeIsNotNull() {
            addCriterion("LocLayerCode is not null");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeEqualTo(String value) {
            addCriterion("LocLayerCode =", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeNotEqualTo(String value) {
            addCriterion("LocLayerCode <>", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeGreaterThan(String value) {
            addCriterion("LocLayerCode >", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeGreaterThanOrEqualTo(String value) {
            addCriterion("LocLayerCode >=", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeLessThan(String value) {
            addCriterion("LocLayerCode <", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeLessThanOrEqualTo(String value) {
            addCriterion("LocLayerCode <=", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeLike(String value) {
            addCriterion("LocLayerCode like", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeNotLike(String value) {
            addCriterion("LocLayerCode not like", value, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeIn(List<String> values) {
            addCriterion("LocLayerCode in", values, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeNotIn(List<String> values) {
            addCriterion("LocLayerCode not in", values, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeBetween(String value1, String value2) {
            addCriterion("LocLayerCode between", value1, value2, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayercodeNotBetween(String value1, String value2) {
            addCriterion("LocLayerCode not between", value1, value2, "loclayercode");
            return (Criteria) this;
        }

        public Criteria andLoclayeridIsNull() {
            addCriterion("LocLayerId is null");
            return (Criteria) this;
        }

        public Criteria andLoclayeridIsNotNull() {
            addCriterion("LocLayerId is not null");
            return (Criteria) this;
        }

        public Criteria andLoclayeridEqualTo(String value) {
            addCriterion("LocLayerId =", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridNotEqualTo(String value) {
            addCriterion("LocLayerId <>", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridGreaterThan(String value) {
            addCriterion("LocLayerId >", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridGreaterThanOrEqualTo(String value) {
            addCriterion("LocLayerId >=", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridLessThan(String value) {
            addCriterion("LocLayerId <", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridLessThanOrEqualTo(String value) {
            addCriterion("LocLayerId <=", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridLike(String value) {
            addCriterion("LocLayerId like", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridNotLike(String value) {
            addCriterion("LocLayerId not like", value, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridIn(List<String> values) {
            addCriterion("LocLayerId in", values, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridNotIn(List<String> values) {
            addCriterion("LocLayerId not in", values, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridBetween(String value1, String value2) {
            addCriterion("LocLayerId between", value1, value2, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayeridNotBetween(String value1, String value2) {
            addCriterion("LocLayerId not between", value1, value2, "loclayerid");
            return (Criteria) this;
        }

        public Criteria andLoclayernameIsNull() {
            addCriterion("LocLayerName is null");
            return (Criteria) this;
        }

        public Criteria andLoclayernameIsNotNull() {
            addCriterion("LocLayerName is not null");
            return (Criteria) this;
        }

        public Criteria andLoclayernameEqualTo(String value) {
            addCriterion("LocLayerName =", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameNotEqualTo(String value) {
            addCriterion("LocLayerName <>", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameGreaterThan(String value) {
            addCriterion("LocLayerName >", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameGreaterThanOrEqualTo(String value) {
            addCriterion("LocLayerName >=", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameLessThan(String value) {
            addCriterion("LocLayerName <", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameLessThanOrEqualTo(String value) {
            addCriterion("LocLayerName <=", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameLike(String value) {
            addCriterion("LocLayerName like", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameNotLike(String value) {
            addCriterion("LocLayerName not like", value, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameIn(List<String> values) {
            addCriterion("LocLayerName in", values, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameNotIn(List<String> values) {
            addCriterion("LocLayerName not in", values, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameBetween(String value1, String value2) {
            addCriterion("LocLayerName between", value1, value2, "loclayername");
            return (Criteria) this;
        }

        public Criteria andLoclayernameNotBetween(String value1, String value2) {
            addCriterion("LocLayerName not between", value1, value2, "loclayername");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeIsNull() {
            addCriterion("OffShelfTime is null");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeIsNotNull() {
            addCriterion("OffShelfTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeEqualTo(Date value) {
            addCriterion("OffShelfTime =", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeNotEqualTo(Date value) {
            addCriterion("OffShelfTime <>", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeGreaterThan(Date value) {
            addCriterion("OffShelfTime >", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OffShelfTime >=", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeLessThan(Date value) {
            addCriterion("OffShelfTime <", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeLessThanOrEqualTo(Date value) {
            addCriterion("OffShelfTime <=", value, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeIn(List<Date> values) {
            addCriterion("OffShelfTime in", values, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeNotIn(List<Date> values) {
            addCriterion("OffShelfTime not in", values, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeBetween(Date value1, Date value2) {
            addCriterion("OffShelfTime between", value1, value2, "offshelftime");
            return (Criteria) this;
        }

        public Criteria andOffshelftimeNotBetween(Date value1, Date value2) {
            addCriterion("OffShelfTime not between", value1, value2, "offshelftime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}