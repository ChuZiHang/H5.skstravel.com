package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkShippingAreaExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkShippingAreaExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    public void setDialect(String dialect) {
        this.dialect=dialect;
    }

    public String getDialect() {
        return dialect;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

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

        public Criteria andShippingAreaIdIsNull() {
            addCriterion("shipping_area_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIsNotNull() {
            addCriterion("shipping_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdEqualTo(Short value) {
            addCriterion("shipping_area_id =", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotEqualTo(Short value) {
            addCriterion("shipping_area_id <>", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThan(Short value) {
            addCriterion("shipping_area_id >", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThanOrEqualTo(Short value) {
            addCriterion("shipping_area_id >=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThan(Short value) {
            addCriterion("shipping_area_id <", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThanOrEqualTo(Short value) {
            addCriterion("shipping_area_id <=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIn(List<Short> values) {
            addCriterion("shipping_area_id in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotIn(List<Short> values) {
            addCriterion("shipping_area_id not in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdBetween(Short value1, Short value2) {
            addCriterion("shipping_area_id between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotBetween(Short value1, Short value2) {
            addCriterion("shipping_area_id not between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNull() {
            addCriterion("shipping_area_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNotNull() {
            addCriterion("shipping_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameEqualTo(String value) {
            addCriterion("shipping_area_name =", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotEqualTo(String value) {
            addCriterion("shipping_area_name <>", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThan(String value) {
            addCriterion("shipping_area_name >", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_area_name >=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThan(String value) {
            addCriterion("shipping_area_name <", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_area_name <=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLike(String value) {
            addCriterion("shipping_area_name like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotLike(String value) {
            addCriterion("shipping_area_name not like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIn(List<String> values) {
            addCriterion("shipping_area_name in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotIn(List<String> values) {
            addCriterion("shipping_area_name not in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameBetween(String value1, String value2) {
            addCriterion("shipping_area_name between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotBetween(String value1, String value2) {
            addCriterion("shipping_area_name not between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Byte value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Byte value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Byte value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Byte value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Byte> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Byte> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLikeInsensitive(String value) {
            addCriterion("upper(shipping_area_name) like", value.toUpperCase(), "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria customClauseSql(String value) {
            addCriterion("(" + value+ ")");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

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