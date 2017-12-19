package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkBannerPlaceExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkBannerPlaceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNull() {
            addCriterion("place_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("place_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("place_name =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("place_name <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("place_name >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_name >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("place_name <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("place_name <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("place_name like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("place_name not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("place_name in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("place_name not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("place_name between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("place_name not between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIsNull() {
            addCriterion("place_code is null");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIsNotNull() {
            addCriterion("place_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeEqualTo(String value) {
            addCriterion("place_code =", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotEqualTo(String value) {
            addCriterion("place_code <>", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeGreaterThan(String value) {
            addCriterion("place_code >", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("place_code >=", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLessThan(String value) {
            addCriterion("place_code <", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLessThanOrEqualTo(String value) {
            addCriterion("place_code <=", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLike(String value) {
            addCriterion("place_code like", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotLike(String value) {
            addCriterion("place_code not like", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIn(List<String> values) {
            addCriterion("place_code in", values, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotIn(List<String> values) {
            addCriterion("place_code not in", values, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeBetween(String value1, String value2) {
            addCriterion("place_code between", value1, value2, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotBetween(String value1, String value2) {
            addCriterion("place_code not between", value1, value2, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusIsNull() {
            addCriterion("place_status is null");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusIsNotNull() {
            addCriterion("place_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusEqualTo(Boolean value) {
            addCriterion("place_status =", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotEqualTo(Boolean value) {
            addCriterion("place_status <>", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusGreaterThan(Boolean value) {
            addCriterion("place_status >", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("place_status >=", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusLessThan(Boolean value) {
            addCriterion("place_status <", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("place_status <=", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusIn(List<Boolean> values) {
            addCriterion("place_status in", values, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotIn(List<Boolean> values) {
            addCriterion("place_status not in", values, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("place_status between", value1, value2, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("place_status not between", value1, value2, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLikeInsensitive(String value) {
            addCriterion("upper(place_name) like", value.toUpperCase(), "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLikeInsensitive(String value) {
            addCriterion("upper(place_code) like", value.toUpperCase(), "placeCode");
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