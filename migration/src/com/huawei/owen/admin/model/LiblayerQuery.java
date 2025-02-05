package com.huawei.owen.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiblayerQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LiblayerQuery() {
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

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIsNull() {
            addCriterion("DeleterUserId is null");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIsNotNull() {
            addCriterion("DeleterUserId is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridEqualTo(Long value) {
            addCriterion("DeleterUserId =", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotEqualTo(Long value) {
            addCriterion("DeleterUserId <>", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridGreaterThan(Long value) {
            addCriterion("DeleterUserId >", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("DeleterUserId >=", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridLessThan(Long value) {
            addCriterion("DeleterUserId <", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridLessThanOrEqualTo(Long value) {
            addCriterion("DeleterUserId <=", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIn(List<Long> values) {
            addCriterion("DeleterUserId in", values, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotIn(List<Long> values) {
            addCriterion("DeleterUserId not in", values, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridBetween(Long value1, Long value2) {
            addCriterion("DeleterUserId between", value1, value2, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotBetween(Long value1, Long value2) {
            addCriterion("DeleterUserId not between", value1, value2, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIsNull() {
            addCriterion("DeletionTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIsNotNull() {
            addCriterion("DeletionTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeEqualTo(Date value) {
            addCriterion("DeletionTime =", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotEqualTo(Date value) {
            addCriterion("DeletionTime <>", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeGreaterThan(Date value) {
            addCriterion("DeletionTime >", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeletionTime >=", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeLessThan(Date value) {
            addCriterion("DeletionTime <", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeLessThanOrEqualTo(Date value) {
            addCriterion("DeletionTime <=", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIn(List<Date> values) {
            addCriterion("DeletionTime in", values, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotIn(List<Date> values) {
            addCriterion("DeletionTime not in", values, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeBetween(Date value1, Date value2) {
            addCriterion("DeletionTime between", value1, value2, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotBetween(Date value1, Date value2) {
            addCriterion("DeletionTime not between", value1, value2, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andShelfidIsNull() {
            addCriterion("ShelfId is null");
            return (Criteria) this;
        }

        public Criteria andShelfidIsNotNull() {
            addCriterion("ShelfId is not null");
            return (Criteria) this;
        }

        public Criteria andShelfidEqualTo(String value) {
            addCriterion("ShelfId =", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidNotEqualTo(String value) {
            addCriterion("ShelfId <>", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidGreaterThan(String value) {
            addCriterion("ShelfId >", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidGreaterThanOrEqualTo(String value) {
            addCriterion("ShelfId >=", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidLessThan(String value) {
            addCriterion("ShelfId <", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidLessThanOrEqualTo(String value) {
            addCriterion("ShelfId <=", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidLike(String value) {
            addCriterion("ShelfId like", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidNotLike(String value) {
            addCriterion("ShelfId not like", value, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidIn(List<String> values) {
            addCriterion("ShelfId in", values, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidNotIn(List<String> values) {
            addCriterion("ShelfId not in", values, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidBetween(String value1, String value2) {
            addCriterion("ShelfId between", value1, value2, "shelfid");
            return (Criteria) this;
        }

        public Criteria andShelfidNotBetween(String value1, String value2) {
            addCriterion("ShelfId not between", value1, value2, "shelfid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("Tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("Tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("Tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("Tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("Tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("Tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("Tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("Tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("Tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("Tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("Tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("Tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("Tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("Tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andSideIsNull() {
            addCriterion("Side is null");
            return (Criteria) this;
        }

        public Criteria andSideIsNotNull() {
            addCriterion("Side is not null");
            return (Criteria) this;
        }

        public Criteria andSideEqualTo(String value) {
            addCriterion("Side =", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotEqualTo(String value) {
            addCriterion("Side <>", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThan(String value) {
            addCriterion("Side >", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThanOrEqualTo(String value) {
            addCriterion("Side >=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThan(String value) {
            addCriterion("Side <", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThanOrEqualTo(String value) {
            addCriterion("Side <=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLike(String value) {
            addCriterion("Side like", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotLike(String value) {
            addCriterion("Side not like", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideIn(List<String> values) {
            addCriterion("Side in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotIn(List<String> values) {
            addCriterion("Side not in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideBetween(String value1, String value2) {
            addCriterion("Side between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotBetween(String value1, String value2) {
            addCriterion("Side not between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andLayernoIsNull() {
            addCriterion("LayerNo is null");
            return (Criteria) this;
        }

        public Criteria andLayernoIsNotNull() {
            addCriterion("LayerNo is not null");
            return (Criteria) this;
        }

        public Criteria andLayernoEqualTo(Byte value) {
            addCriterion("LayerNo =", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoNotEqualTo(Byte value) {
            addCriterion("LayerNo <>", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoGreaterThan(Byte value) {
            addCriterion("LayerNo >", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoGreaterThanOrEqualTo(Byte value) {
            addCriterion("LayerNo >=", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoLessThan(Byte value) {
            addCriterion("LayerNo <", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoLessThanOrEqualTo(Byte value) {
            addCriterion("LayerNo <=", value, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoIn(List<Byte> values) {
            addCriterion("LayerNo in", values, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoNotIn(List<Byte> values) {
            addCriterion("LayerNo not in", values, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoBetween(Byte value1, Byte value2) {
            addCriterion("LayerNo between", value1, value2, "layerno");
            return (Criteria) this;
        }

        public Criteria andLayernoNotBetween(Byte value1, Byte value2) {
            addCriterion("LayerNo not between", value1, value2, "layerno");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("IsEnable is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("IsEnable is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(Boolean value) {
            addCriterion("IsEnable =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(Boolean value) {
            addCriterion("IsEnable <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(Boolean value) {
            addCriterion("IsEnable >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsEnable >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(Boolean value) {
            addCriterion("IsEnable <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(Boolean value) {
            addCriterion("IsEnable <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<Boolean> values) {
            addCriterion("IsEnable in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<Boolean> values) {
            addCriterion("IsEnable not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEnable between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEnable not between", value1, value2, "isenable");
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

        public Criteria andItemcallnoIsNull() {
            addCriterion("ItemCallNo is null");
            return (Criteria) this;
        }

        public Criteria andItemcallnoIsNotNull() {
            addCriterion("ItemCallNo is not null");
            return (Criteria) this;
        }

        public Criteria andItemcallnoEqualTo(String value) {
            addCriterion("ItemCallNo =", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoNotEqualTo(String value) {
            addCriterion("ItemCallNo <>", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoGreaterThan(String value) {
            addCriterion("ItemCallNo >", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoGreaterThanOrEqualTo(String value) {
            addCriterion("ItemCallNo >=", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoLessThan(String value) {
            addCriterion("ItemCallNo <", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoLessThanOrEqualTo(String value) {
            addCriterion("ItemCallNo <=", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoLike(String value) {
            addCriterion("ItemCallNo like", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoNotLike(String value) {
            addCriterion("ItemCallNo not like", value, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoIn(List<String> values) {
            addCriterion("ItemCallNo in", values, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoNotIn(List<String> values) {
            addCriterion("ItemCallNo not in", values, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoBetween(String value1, String value2) {
            addCriterion("ItemCallNo between", value1, value2, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andItemcallnoNotBetween(String value1, String value2) {
            addCriterion("ItemCallNo not between", value1, value2, "itemcallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoIsNull() {
            addCriterion("PreCallNo is null");
            return (Criteria) this;
        }

        public Criteria andPrecallnoIsNotNull() {
            addCriterion("PreCallNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrecallnoEqualTo(String value) {
            addCriterion("PreCallNo =", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoNotEqualTo(String value) {
            addCriterion("PreCallNo <>", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoGreaterThan(String value) {
            addCriterion("PreCallNo >", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoGreaterThanOrEqualTo(String value) {
            addCriterion("PreCallNo >=", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoLessThan(String value) {
            addCriterion("PreCallNo <", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoLessThanOrEqualTo(String value) {
            addCriterion("PreCallNo <=", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoLike(String value) {
            addCriterion("PreCallNo like", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoNotLike(String value) {
            addCriterion("PreCallNo not like", value, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoIn(List<String> values) {
            addCriterion("PreCallNo in", values, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoNotIn(List<String> values) {
            addCriterion("PreCallNo not in", values, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoBetween(String value1, String value2) {
            addCriterion("PreCallNo between", value1, value2, "precallno");
            return (Criteria) this;
        }

        public Criteria andPrecallnoNotBetween(String value1, String value2) {
            addCriterion("PreCallNo not between", value1, value2, "precallno");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("Barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("Barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("Barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("Barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("Barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("Barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("Barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("Barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("Barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("Barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("Barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("Barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("Barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("Barcode not between", value1, value2, "barcode");
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