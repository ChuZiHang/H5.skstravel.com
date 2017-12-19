package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkComboTravelExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkComboTravelExample() {
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

        public Criteria andComboTravelIdIsNull() {
            addCriterion("combo_travel_id is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdIsNotNull() {
            addCriterion("combo_travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdEqualTo(Integer value) {
            addCriterion("combo_travel_id =", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdNotEqualTo(Integer value) {
            addCriterion("combo_travel_id <>", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdGreaterThan(Integer value) {
            addCriterion("combo_travel_id >", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_id >=", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdLessThan(Integer value) {
            addCriterion("combo_travel_id <", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_id <=", value, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdIn(List<Integer> values) {
            addCriterion("combo_travel_id in", values, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdNotIn(List<Integer> values) {
            addCriterion("combo_travel_id not in", values, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_id between", value1, value2, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_id not between", value1, value2, "comboTravelId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIsNull() {
            addCriterion("combo_travel_type_id is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIsNotNull() {
            addCriterion("combo_travel_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdEqualTo(Integer value) {
            addCriterion("combo_travel_type_id =", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotEqualTo(Integer value) {
            addCriterion("combo_travel_type_id <>", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdGreaterThan(Integer value) {
            addCriterion("combo_travel_type_id >", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_type_id >=", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdLessThan(Integer value) {
            addCriterion("combo_travel_type_id <", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_type_id <=", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIn(List<Integer> values) {
            addCriterion("combo_travel_type_id in", values, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotIn(List<Integer> values) {
            addCriterion("combo_travel_type_id not in", values, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_type_id between", value1, value2, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_type_id not between", value1, value2, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayIsNull() {
            addCriterion("combo_travel_day is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayIsNotNull() {
            addCriterion("combo_travel_day is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayEqualTo(Integer value) {
            addCriterion("combo_travel_day =", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayNotEqualTo(Integer value) {
            addCriterion("combo_travel_day <>", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayGreaterThan(Integer value) {
            addCriterion("combo_travel_day >", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_day >=", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayLessThan(Integer value) {
            addCriterion("combo_travel_day <", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayLessThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_day <=", value, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayIn(List<Integer> values) {
            addCriterion("combo_travel_day in", values, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayNotIn(List<Integer> values) {
            addCriterion("combo_travel_day not in", values, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_day between", value1, value2, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDayNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_day not between", value1, value2, "comboTravelDay");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateIsNull() {
            addCriterion("combo_travel_date is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateIsNotNull() {
            addCriterion("combo_travel_date is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateEqualTo(String value) {
            addCriterion("combo_travel_date =", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateNotEqualTo(String value) {
            addCriterion("combo_travel_date <>", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateGreaterThan(String value) {
            addCriterion("combo_travel_date >", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateGreaterThanOrEqualTo(String value) {
            addCriterion("combo_travel_date >=", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateLessThan(String value) {
            addCriterion("combo_travel_date <", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateLessThanOrEqualTo(String value) {
            addCriterion("combo_travel_date <=", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateLike(String value) {
            addCriterion("combo_travel_date like", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateNotLike(String value) {
            addCriterion("combo_travel_date not like", value, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateIn(List<String> values) {
            addCriterion("combo_travel_date in", values, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateNotIn(List<String> values) {
            addCriterion("combo_travel_date not in", values, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateBetween(String value1, String value2) {
            addCriterion("combo_travel_date between", value1, value2, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateNotBetween(String value1, String value2) {
            addCriterion("combo_travel_date not between", value1, value2, "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleIsNull() {
            addCriterion("combo_travel_title is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleIsNotNull() {
            addCriterion("combo_travel_title is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleEqualTo(String value) {
            addCriterion("combo_travel_title =", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleNotEqualTo(String value) {
            addCriterion("combo_travel_title <>", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleGreaterThan(String value) {
            addCriterion("combo_travel_title >", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleGreaterThanOrEqualTo(String value) {
            addCriterion("combo_travel_title >=", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleLessThan(String value) {
            addCriterion("combo_travel_title <", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleLessThanOrEqualTo(String value) {
            addCriterion("combo_travel_title <=", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleLike(String value) {
            addCriterion("combo_travel_title like", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleNotLike(String value) {
            addCriterion("combo_travel_title not like", value, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleIn(List<String> values) {
            addCriterion("combo_travel_title in", values, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleNotIn(List<String> values) {
            addCriterion("combo_travel_title not in", values, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleBetween(String value1, String value2) {
            addCriterion("combo_travel_title between", value1, value2, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleNotBetween(String value1, String value2) {
            addCriterion("combo_travel_title not between", value1, value2, "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgIsNull() {
            addCriterion("combo_travel_img is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgIsNotNull() {
            addCriterion("combo_travel_img is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgEqualTo(String value) {
            addCriterion("combo_travel_img =", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgNotEqualTo(String value) {
            addCriterion("combo_travel_img <>", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgGreaterThan(String value) {
            addCriterion("combo_travel_img >", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgGreaterThanOrEqualTo(String value) {
            addCriterion("combo_travel_img >=", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgLessThan(String value) {
            addCriterion("combo_travel_img <", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgLessThanOrEqualTo(String value) {
            addCriterion("combo_travel_img <=", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgLike(String value) {
            addCriterion("combo_travel_img like", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgNotLike(String value) {
            addCriterion("combo_travel_img not like", value, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgIn(List<String> values) {
            addCriterion("combo_travel_img in", values, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgNotIn(List<String> values) {
            addCriterion("combo_travel_img not in", values, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgBetween(String value1, String value2) {
            addCriterion("combo_travel_img between", value1, value2, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgNotBetween(String value1, String value2) {
            addCriterion("combo_travel_img not between", value1, value2, "comboTravelImg");
            return (Criteria) this;
        }

        public Criteria andComboTravelDateLikeInsensitive(String value) {
            addCriterion("upper(combo_travel_date) like", value.toUpperCase(), "comboTravelDate");
            return (Criteria) this;
        }

        public Criteria andComboTravelTitleLikeInsensitive(String value) {
            addCriterion("upper(combo_travel_title) like", value.toUpperCase(), "comboTravelTitle");
            return (Criteria) this;
        }

        public Criteria andComboTravelImgLikeInsensitive(String value) {
            addCriterion("upper(combo_travel_img) like", value.toUpperCase(), "comboTravelImg");
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