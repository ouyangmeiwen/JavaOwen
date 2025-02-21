package com.library.owen.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibitemQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LibitemQuery() {
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

        public Criteria andInfoidIsNull() {
            addCriterion("InfoId is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("InfoId is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(String value) {
            addCriterion("InfoId =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(String value) {
            addCriterion("InfoId <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(String value) {
            addCriterion("InfoId >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(String value) {
            addCriterion("InfoId >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(String value) {
            addCriterion("InfoId <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(String value) {
            addCriterion("InfoId <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLike(String value) {
            addCriterion("InfoId like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotLike(String value) {
            addCriterion("InfoId not like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<String> values) {
            addCriterion("InfoId in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<String> values) {
            addCriterion("InfoId not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(String value1, String value2) {
            addCriterion("InfoId between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(String value1, String value2) {
            addCriterion("InfoId not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
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

        public Criteria andCallnoIsNull() {
            addCriterion("CallNo is null");
            return (Criteria) this;
        }

        public Criteria andCallnoIsNotNull() {
            addCriterion("CallNo is not null");
            return (Criteria) this;
        }

        public Criteria andCallnoEqualTo(String value) {
            addCriterion("CallNo =", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotEqualTo(String value) {
            addCriterion("CallNo <>", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThan(String value) {
            addCriterion("CallNo >", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThanOrEqualTo(String value) {
            addCriterion("CallNo >=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThan(String value) {
            addCriterion("CallNo <", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThanOrEqualTo(String value) {
            addCriterion("CallNo <=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLike(String value) {
            addCriterion("CallNo like", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotLike(String value) {
            addCriterion("CallNo not like", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoIn(List<String> values) {
            addCriterion("CallNo in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotIn(List<String> values) {
            addCriterion("CallNo not in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoBetween(String value1, String value2) {
            addCriterion("CallNo between", value1, value2, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotBetween(String value1, String value2) {
            addCriterion("CallNo not between", value1, value2, "callno");
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

        public Criteria andCatalogcodeIsNull() {
            addCriterion("CatalogCode is null");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeIsNotNull() {
            addCriterion("CatalogCode is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeEqualTo(String value) {
            addCriterion("CatalogCode =", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotEqualTo(String value) {
            addCriterion("CatalogCode <>", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeGreaterThan(String value) {
            addCriterion("CatalogCode >", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CatalogCode >=", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLessThan(String value) {
            addCriterion("CatalogCode <", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLessThanOrEqualTo(String value) {
            addCriterion("CatalogCode <=", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLike(String value) {
            addCriterion("CatalogCode like", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotLike(String value) {
            addCriterion("CatalogCode not like", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeIn(List<String> values) {
            addCriterion("CatalogCode in", values, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotIn(List<String> values) {
            addCriterion("CatalogCode not in", values, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeBetween(String value1, String value2) {
            addCriterion("CatalogCode between", value1, value2, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotBetween(String value1, String value2) {
            addCriterion("CatalogCode not between", value1, value2, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andItemstateIsNull() {
            addCriterion("ItemState is null");
            return (Criteria) this;
        }

        public Criteria andItemstateIsNotNull() {
            addCriterion("ItemState is not null");
            return (Criteria) this;
        }

        public Criteria andItemstateEqualTo(Byte value) {
            addCriterion("ItemState =", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotEqualTo(Byte value) {
            addCriterion("ItemState <>", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateGreaterThan(Byte value) {
            addCriterion("ItemState >", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("ItemState >=", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateLessThan(Byte value) {
            addCriterion("ItemState <", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateLessThanOrEqualTo(Byte value) {
            addCriterion("ItemState <=", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateIn(List<Byte> values) {
            addCriterion("ItemState in", values, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotIn(List<Byte> values) {
            addCriterion("ItemState not in", values, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateBetween(Byte value1, Byte value2) {
            addCriterion("ItemState between", value1, value2, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotBetween(Byte value1, Byte value2) {
            addCriterion("ItemState not between", value1, value2, "itemstate");
            return (Criteria) this;
        }

        public Criteria andPressmarkidIsNull() {
            addCriterion("PressmarkId is null");
            return (Criteria) this;
        }

        public Criteria andPressmarkidIsNotNull() {
            addCriterion("PressmarkId is not null");
            return (Criteria) this;
        }

        public Criteria andPressmarkidEqualTo(String value) {
            addCriterion("PressmarkId =", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidNotEqualTo(String value) {
            addCriterion("PressmarkId <>", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidGreaterThan(String value) {
            addCriterion("PressmarkId >", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidGreaterThanOrEqualTo(String value) {
            addCriterion("PressmarkId >=", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidLessThan(String value) {
            addCriterion("PressmarkId <", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidLessThanOrEqualTo(String value) {
            addCriterion("PressmarkId <=", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidLike(String value) {
            addCriterion("PressmarkId like", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidNotLike(String value) {
            addCriterion("PressmarkId not like", value, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidIn(List<String> values) {
            addCriterion("PressmarkId in", values, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidNotIn(List<String> values) {
            addCriterion("PressmarkId not in", values, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidBetween(String value1, String value2) {
            addCriterion("PressmarkId between", value1, value2, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarkidNotBetween(String value1, String value2) {
            addCriterion("PressmarkId not between", value1, value2, "pressmarkid");
            return (Criteria) this;
        }

        public Criteria andPressmarknameIsNull() {
            addCriterion("PressmarkName is null");
            return (Criteria) this;
        }

        public Criteria andPressmarknameIsNotNull() {
            addCriterion("PressmarkName is not null");
            return (Criteria) this;
        }

        public Criteria andPressmarknameEqualTo(String value) {
            addCriterion("PressmarkName =", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameNotEqualTo(String value) {
            addCriterion("PressmarkName <>", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameGreaterThan(String value) {
            addCriterion("PressmarkName >", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameGreaterThanOrEqualTo(String value) {
            addCriterion("PressmarkName >=", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameLessThan(String value) {
            addCriterion("PressmarkName <", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameLessThanOrEqualTo(String value) {
            addCriterion("PressmarkName <=", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameLike(String value) {
            addCriterion("PressmarkName like", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameNotLike(String value) {
            addCriterion("PressmarkName not like", value, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameIn(List<String> values) {
            addCriterion("PressmarkName in", values, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameNotIn(List<String> values) {
            addCriterion("PressmarkName not in", values, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameBetween(String value1, String value2) {
            addCriterion("PressmarkName between", value1, value2, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andPressmarknameNotBetween(String value1, String value2) {
            addCriterion("PressmarkName not between", value1, value2, "pressmarkname");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("LocationId is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("LocationId is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(String value) {
            addCriterion("LocationId =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(String value) {
            addCriterion("LocationId <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(String value) {
            addCriterion("LocationId >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(String value) {
            addCriterion("LocationId >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(String value) {
            addCriterion("LocationId <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(String value) {
            addCriterion("LocationId <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLike(String value) {
            addCriterion("LocationId like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotLike(String value) {
            addCriterion("LocationId not like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<String> values) {
            addCriterion("LocationId in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<String> values) {
            addCriterion("LocationId not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(String value1, String value2) {
            addCriterion("LocationId between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(String value1, String value2) {
            addCriterion("LocationId not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNull() {
            addCriterion("LocationName is null");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNotNull() {
            addCriterion("LocationName is not null");
            return (Criteria) this;
        }

        public Criteria andLocationnameEqualTo(String value) {
            addCriterion("LocationName =", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotEqualTo(String value) {
            addCriterion("LocationName <>", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThan(String value) {
            addCriterion("LocationName >", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationName >=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThan(String value) {
            addCriterion("LocationName <", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThanOrEqualTo(String value) {
            addCriterion("LocationName <=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLike(String value) {
            addCriterion("LocationName like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotLike(String value) {
            addCriterion("LocationName not like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameIn(List<String> values) {
            addCriterion("LocationName in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotIn(List<String> values) {
            addCriterion("LocationName not in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameBetween(String value1, String value2) {
            addCriterion("LocationName between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotBetween(String value1, String value2) {
            addCriterion("LocationName not between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeIsNull() {
            addCriterion("BookBarcode is null");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeIsNotNull() {
            addCriterion("BookBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeEqualTo(String value) {
            addCriterion("BookBarcode =", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeNotEqualTo(String value) {
            addCriterion("BookBarcode <>", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeGreaterThan(String value) {
            addCriterion("BookBarcode >", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BookBarcode >=", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeLessThan(String value) {
            addCriterion("BookBarcode <", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeLessThanOrEqualTo(String value) {
            addCriterion("BookBarcode <=", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeLike(String value) {
            addCriterion("BookBarcode like", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeNotLike(String value) {
            addCriterion("BookBarcode not like", value, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeIn(List<String> values) {
            addCriterion("BookBarcode in", values, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeNotIn(List<String> values) {
            addCriterion("BookBarcode not in", values, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeBetween(String value1, String value2) {
            addCriterion("BookBarcode between", value1, value2, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andBookbarcodeNotBetween(String value1, String value2) {
            addCriterion("BookBarcode not between", value1, value2, "bookbarcode");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andPubnoIsNull() {
            addCriterion("PubNo is null");
            return (Criteria) this;
        }

        public Criteria andPubnoIsNotNull() {
            addCriterion("PubNo is not null");
            return (Criteria) this;
        }

        public Criteria andPubnoEqualTo(Short value) {
            addCriterion("PubNo =", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoNotEqualTo(Short value) {
            addCriterion("PubNo <>", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoGreaterThan(Short value) {
            addCriterion("PubNo >", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoGreaterThanOrEqualTo(Short value) {
            addCriterion("PubNo >=", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoLessThan(Short value) {
            addCriterion("PubNo <", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoLessThanOrEqualTo(Short value) {
            addCriterion("PubNo <=", value, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoIn(List<Short> values) {
            addCriterion("PubNo in", values, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoNotIn(List<Short> values) {
            addCriterion("PubNo not in", values, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoBetween(Short value1, Short value2) {
            addCriterion("PubNo between", value1, value2, "pubno");
            return (Criteria) this;
        }

        public Criteria andPubnoNotBetween(Short value1, Short value2) {
            addCriterion("PubNo not between", value1, value2, "pubno");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("Publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("Publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("Publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("Publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("Publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("Publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("Publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("Publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("Publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("Publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("Publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("Publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("Publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("Publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNull() {
            addCriterion("PubDate is null");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNotNull() {
            addCriterion("PubDate is not null");
            return (Criteria) this;
        }

        public Criteria andPubdateEqualTo(String value) {
            addCriterion("PubDate =", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotEqualTo(String value) {
            addCriterion("PubDate <>", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThan(String value) {
            addCriterion("PubDate >", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThanOrEqualTo(String value) {
            addCriterion("PubDate >=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThan(String value) {
            addCriterion("PubDate <", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThanOrEqualTo(String value) {
            addCriterion("PubDate <=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLike(String value) {
            addCriterion("PubDate like", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotLike(String value) {
            addCriterion("PubDate not like", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateIn(List<String> values) {
            addCriterion("PubDate in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotIn(List<String> values) {
            addCriterion("PubDate not in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateBetween(String value1, String value2) {
            addCriterion("PubDate between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotBetween(String value1, String value2) {
            addCriterion("PubDate not between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("Price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("Price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("Pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("Pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(String value) {
            addCriterion("Pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(String value) {
            addCriterion("Pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(String value) {
            addCriterion("Pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(String value) {
            addCriterion("Pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(String value) {
            addCriterion("Pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(String value) {
            addCriterion("Pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLike(String value) {
            addCriterion("Pages like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotLike(String value) {
            addCriterion("Pages not like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<String> values) {
            addCriterion("Pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<String> values) {
            addCriterion("Pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(String value1, String value2) {
            addCriterion("Pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(String value1, String value2) {
            addCriterion("Pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNull() {
            addCriterion("ItemType is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNotNull() {
            addCriterion("ItemType is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeEqualTo(Byte value) {
            addCriterion("ItemType =", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotEqualTo(Byte value) {
            addCriterion("ItemType <>", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThan(Byte value) {
            addCriterion("ItemType >", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ItemType >=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThan(Byte value) {
            addCriterion("ItemType <", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThanOrEqualTo(Byte value) {
            addCriterion("ItemType <=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeIn(List<Byte> values) {
            addCriterion("ItemType in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotIn(List<Byte> values) {
            addCriterion("ItemType not in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeBetween(Byte value1, Byte value2) {
            addCriterion("ItemType between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ItemType not between", value1, value2, "itemtype");
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

        public Criteria andCreatetypeIsNull() {
            addCriterion("CreateType is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("CreateType is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(Byte value) {
            addCriterion("CreateType =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(Byte value) {
            addCriterion("CreateType <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(Byte value) {
            addCriterion("CreateType >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CreateType >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(Byte value) {
            addCriterion("CreateType <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(Byte value) {
            addCriterion("CreateType <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<Byte> values) {
            addCriterion("CreateType in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<Byte> values) {
            addCriterion("CreateType not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(Byte value1, Byte value2) {
            addCriterion("CreateType between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CreateType not between", value1, value2, "createtype");
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