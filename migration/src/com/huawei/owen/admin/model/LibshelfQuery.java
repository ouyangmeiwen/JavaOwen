package com.library.owen.admin.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibshelfQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LibshelfQuery() {
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

        public Criteria andShelfnoIsNull() {
            addCriterion("ShelfNo is null");
            return (Criteria) this;
        }

        public Criteria andShelfnoIsNotNull() {
            addCriterion("ShelfNo is not null");
            return (Criteria) this;
        }

        public Criteria andShelfnoEqualTo(Integer value) {
            addCriterion("ShelfNo =", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotEqualTo(Integer value) {
            addCriterion("ShelfNo <>", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoGreaterThan(Integer value) {
            addCriterion("ShelfNo >", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShelfNo >=", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoLessThan(Integer value) {
            addCriterion("ShelfNo <", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoLessThanOrEqualTo(Integer value) {
            addCriterion("ShelfNo <=", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoIn(List<Integer> values) {
            addCriterion("ShelfNo in", values, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotIn(List<Integer> values) {
            addCriterion("ShelfNo not in", values, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoBetween(Integer value1, Integer value2) {
            addCriterion("ShelfNo between", value1, value2, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ShelfNo not between", value1, value2, "shelfno");
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

        public Criteria andRowidentityIsNull() {
            addCriterion("RowIdentity is null");
            return (Criteria) this;
        }

        public Criteria andRowidentityIsNotNull() {
            addCriterion("RowIdentity is not null");
            return (Criteria) this;
        }

        public Criteria andRowidentityEqualTo(String value) {
            addCriterion("RowIdentity =", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityNotEqualTo(String value) {
            addCriterion("RowIdentity <>", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityGreaterThan(String value) {
            addCriterion("RowIdentity >", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityGreaterThanOrEqualTo(String value) {
            addCriterion("RowIdentity >=", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityLessThan(String value) {
            addCriterion("RowIdentity <", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityLessThanOrEqualTo(String value) {
            addCriterion("RowIdentity <=", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityLike(String value) {
            addCriterion("RowIdentity like", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityNotLike(String value) {
            addCriterion("RowIdentity not like", value, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityIn(List<String> values) {
            addCriterion("RowIdentity in", values, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityNotIn(List<String> values) {
            addCriterion("RowIdentity not in", values, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityBetween(String value1, String value2) {
            addCriterion("RowIdentity between", value1, value2, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRowidentityNotBetween(String value1, String value2) {
            addCriterion("RowIdentity not between", value1, value2, "rowidentity");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidIsNull() {
            addCriterion("RfidReaderId is null");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidIsNotNull() {
            addCriterion("RfidReaderId is not null");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidEqualTo(String value) {
            addCriterion("RfidReaderId =", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidNotEqualTo(String value) {
            addCriterion("RfidReaderId <>", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidGreaterThan(String value) {
            addCriterion("RfidReaderId >", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidGreaterThanOrEqualTo(String value) {
            addCriterion("RfidReaderId >=", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidLessThan(String value) {
            addCriterion("RfidReaderId <", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidLessThanOrEqualTo(String value) {
            addCriterion("RfidReaderId <=", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidLike(String value) {
            addCriterion("RfidReaderId like", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidNotLike(String value) {
            addCriterion("RfidReaderId not like", value, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidIn(List<String> values) {
            addCriterion("RfidReaderId in", values, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidNotIn(List<String> values) {
            addCriterion("RfidReaderId not in", values, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidBetween(String value1, String value2) {
            addCriterion("RfidReaderId between", value1, value2, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andRfidreaderidNotBetween(String value1, String value2) {
            addCriterion("RfidReaderId not between", value1, value2, "rfidreaderid");
            return (Criteria) this;
        }

        public Criteria andSerialportidIsNull() {
            addCriterion("SerialPortId is null");
            return (Criteria) this;
        }

        public Criteria andSerialportidIsNotNull() {
            addCriterion("SerialPortId is not null");
            return (Criteria) this;
        }

        public Criteria andSerialportidEqualTo(String value) {
            addCriterion("SerialPortId =", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidNotEqualTo(String value) {
            addCriterion("SerialPortId <>", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidGreaterThan(String value) {
            addCriterion("SerialPortId >", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidGreaterThanOrEqualTo(String value) {
            addCriterion("SerialPortId >=", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidLessThan(String value) {
            addCriterion("SerialPortId <", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidLessThanOrEqualTo(String value) {
            addCriterion("SerialPortId <=", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidLike(String value) {
            addCriterion("SerialPortId like", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidNotLike(String value) {
            addCriterion("SerialPortId not like", value, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidIn(List<String> values) {
            addCriterion("SerialPortId in", values, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidNotIn(List<String> values) {
            addCriterion("SerialPortId not in", values, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidBetween(String value1, String value2) {
            addCriterion("SerialPortId between", value1, value2, "serialportid");
            return (Criteria) this;
        }

        public Criteria andSerialportidNotBetween(String value1, String value2) {
            addCriterion("SerialPortId not between", value1, value2, "serialportid");
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

        public Criteria andX1IsNull() {
            addCriterion("X1 is null");
            return (Criteria) this;
        }

        public Criteria andX1IsNotNull() {
            addCriterion("X1 is not null");
            return (Criteria) this;
        }

        public Criteria andX1EqualTo(BigDecimal value) {
            addCriterion("X1 =", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotEqualTo(BigDecimal value) {
            addCriterion("X1 <>", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThan(BigDecimal value) {
            addCriterion("X1 >", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("X1 >=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThan(BigDecimal value) {
            addCriterion("X1 <", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("X1 <=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1In(List<BigDecimal> values) {
            addCriterion("X1 in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotIn(List<BigDecimal> values) {
            addCriterion("X1 not in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("X1 between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X1 not between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andY1IsNull() {
            addCriterion("Y1 is null");
            return (Criteria) this;
        }

        public Criteria andY1IsNotNull() {
            addCriterion("Y1 is not null");
            return (Criteria) this;
        }

        public Criteria andY1EqualTo(BigDecimal value) {
            addCriterion("Y1 =", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotEqualTo(BigDecimal value) {
            addCriterion("Y1 <>", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1GreaterThan(BigDecimal value) {
            addCriterion("Y1 >", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Y1 >=", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1LessThan(BigDecimal value) {
            addCriterion("Y1 <", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Y1 <=", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1In(List<BigDecimal> values) {
            addCriterion("Y1 in", values, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotIn(List<BigDecimal> values) {
            addCriterion("Y1 not in", values, "y1");
            return (Criteria) this;
        }

        public Criteria andY1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y1 between", value1, value2, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y1 not between", value1, value2, "y1");
            return (Criteria) this;
        }

        public Criteria andX2IsNull() {
            addCriterion("X2 is null");
            return (Criteria) this;
        }

        public Criteria andX2IsNotNull() {
            addCriterion("X2 is not null");
            return (Criteria) this;
        }

        public Criteria andX2EqualTo(BigDecimal value) {
            addCriterion("X2 =", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotEqualTo(BigDecimal value) {
            addCriterion("X2 <>", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThan(BigDecimal value) {
            addCriterion("X2 >", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("X2 >=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThan(BigDecimal value) {
            addCriterion("X2 <", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("X2 <=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2In(List<BigDecimal> values) {
            addCriterion("X2 in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotIn(List<BigDecimal> values) {
            addCriterion("X2 not in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("X2 between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X2 not between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andY2IsNull() {
            addCriterion("Y2 is null");
            return (Criteria) this;
        }

        public Criteria andY2IsNotNull() {
            addCriterion("Y2 is not null");
            return (Criteria) this;
        }

        public Criteria andY2EqualTo(BigDecimal value) {
            addCriterion("Y2 =", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotEqualTo(BigDecimal value) {
            addCriterion("Y2 <>", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2GreaterThan(BigDecimal value) {
            addCriterion("Y2 >", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Y2 >=", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2LessThan(BigDecimal value) {
            addCriterion("Y2 <", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Y2 <=", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2In(List<BigDecimal> values) {
            addCriterion("Y2 in", values, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotIn(List<BigDecimal> values) {
            addCriterion("Y2 not in", values, "y2");
            return (Criteria) this;
        }

        public Criteria andY2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y2 between", value1, value2, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y2 not between", value1, value2, "y2");
            return (Criteria) this;
        }

        public Criteria andAngelIsNull() {
            addCriterion("Angel is null");
            return (Criteria) this;
        }

        public Criteria andAngelIsNotNull() {
            addCriterion("Angel is not null");
            return (Criteria) this;
        }

        public Criteria andAngelEqualTo(BigDecimal value) {
            addCriterion("Angel =", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelNotEqualTo(BigDecimal value) {
            addCriterion("Angel <>", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelGreaterThan(BigDecimal value) {
            addCriterion("Angel >", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Angel >=", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelLessThan(BigDecimal value) {
            addCriterion("Angel <", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Angel <=", value, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelIn(List<BigDecimal> values) {
            addCriterion("Angel in", values, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelNotIn(List<BigDecimal> values) {
            addCriterion("Angel not in", values, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Angel between", value1, value2, "angel");
            return (Criteria) this;
        }

        public Criteria andAngelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Angel not between", value1, value2, "angel");
            return (Criteria) this;
        }

        public Criteria andStructidIsNull() {
            addCriterion("StructId is null");
            return (Criteria) this;
        }

        public Criteria andStructidIsNotNull() {
            addCriterion("StructId is not null");
            return (Criteria) this;
        }

        public Criteria andStructidEqualTo(String value) {
            addCriterion("StructId =", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidNotEqualTo(String value) {
            addCriterion("StructId <>", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidGreaterThan(String value) {
            addCriterion("StructId >", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidGreaterThanOrEqualTo(String value) {
            addCriterion("StructId >=", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidLessThan(String value) {
            addCriterion("StructId <", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidLessThanOrEqualTo(String value) {
            addCriterion("StructId <=", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidLike(String value) {
            addCriterion("StructId like", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidNotLike(String value) {
            addCriterion("StructId not like", value, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidIn(List<String> values) {
            addCriterion("StructId in", values, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidNotIn(List<String> values) {
            addCriterion("StructId not in", values, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidBetween(String value1, String value2) {
            addCriterion("StructId between", value1, value2, "structid");
            return (Criteria) this;
        }

        public Criteria andStructidNotBetween(String value1, String value2) {
            addCriterion("StructId not between", value1, value2, "structid");
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

        public Criteria andIsbosseyedIsNull() {
            addCriterion("IsBosseyed is null");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedIsNotNull() {
            addCriterion("IsBosseyed is not null");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedEqualTo(Boolean value) {
            addCriterion("IsBosseyed =", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedNotEqualTo(Boolean value) {
            addCriterion("IsBosseyed <>", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedGreaterThan(Boolean value) {
            addCriterion("IsBosseyed >", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsBosseyed >=", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedLessThan(Boolean value) {
            addCriterion("IsBosseyed <", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsBosseyed <=", value, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedIn(List<Boolean> values) {
            addCriterion("IsBosseyed in", values, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedNotIn(List<Boolean> values) {
            addCriterion("IsBosseyed not in", values, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBosseyed between", value1, value2, "isbosseyed");
            return (Criteria) this;
        }

        public Criteria andIsbosseyedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBosseyed not between", value1, value2, "isbosseyed");
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