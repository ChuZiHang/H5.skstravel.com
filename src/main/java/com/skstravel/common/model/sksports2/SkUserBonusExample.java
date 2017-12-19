package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkUserBonusExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkUserBonusExample() {
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

        public Criteria andBonusIdIsNull() {
            addCriterion("bonus_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNotNull() {
            addCriterion("bonus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusIdEqualTo(Integer value) {
            addCriterion("bonus_id =", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotEqualTo(Integer value) {
            addCriterion("bonus_id <>", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThan(Integer value) {
            addCriterion("bonus_id >", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_id >=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThan(Integer value) {
            addCriterion("bonus_id <", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_id <=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIn(List<Integer> values) {
            addCriterion("bonus_id in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotIn(List<Integer> values) {
            addCriterion("bonus_id not in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id not between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdIsNull() {
            addCriterion("bonus_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdIsNotNull() {
            addCriterion("bonus_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdEqualTo(Byte value) {
            addCriterion("bonus_type_id =", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdNotEqualTo(Byte value) {
            addCriterion("bonus_type_id <>", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdGreaterThan(Byte value) {
            addCriterion("bonus_type_id >", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("bonus_type_id >=", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdLessThan(Byte value) {
            addCriterion("bonus_type_id <", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("bonus_type_id <=", value, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdIn(List<Byte> values) {
            addCriterion("bonus_type_id in", values, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdNotIn(List<Byte> values) {
            addCriterion("bonus_type_id not in", values, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("bonus_type_id between", value1, value2, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("bonus_type_id not between", value1, value2, "bonusTypeId");
            return (Criteria) this;
        }

        public Criteria andBonusSnIsNull() {
            addCriterion("bonus_sn is null");
            return (Criteria) this;
        }

        public Criteria andBonusSnIsNotNull() {
            addCriterion("bonus_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBonusSnEqualTo(Long value) {
            addCriterion("bonus_sn =", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnNotEqualTo(Long value) {
            addCriterion("bonus_sn <>", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnGreaterThan(Long value) {
            addCriterion("bonus_sn >", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnGreaterThanOrEqualTo(Long value) {
            addCriterion("bonus_sn >=", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnLessThan(Long value) {
            addCriterion("bonus_sn <", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnLessThanOrEqualTo(Long value) {
            addCriterion("bonus_sn <=", value, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnIn(List<Long> values) {
            addCriterion("bonus_sn in", values, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnNotIn(List<Long> values) {
            addCriterion("bonus_sn not in", values, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnBetween(Long value1, Long value2) {
            addCriterion("bonus_sn between", value1, value2, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andBonusSnNotBetween(Long value1, Long value2) {
            addCriterion("bonus_sn not between", value1, value2, "bonusSn");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNull() {
            addCriterion("used_time is null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNotNull() {
            addCriterion("used_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeEqualTo(Integer value) {
            addCriterion("used_time =", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotEqualTo(Integer value) {
            addCriterion("used_time <>", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThan(Integer value) {
            addCriterion("used_time >", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_time >=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThan(Integer value) {
            addCriterion("used_time <", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("used_time <=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIn(List<Integer> values) {
            addCriterion("used_time in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotIn(List<Integer> values) {
            addCriterion("used_time not in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeBetween(Integer value1, Integer value2) {
            addCriterion("used_time between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("used_time not between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andEmailedIsNull() {
            addCriterion("emailed is null");
            return (Criteria) this;
        }

        public Criteria andEmailedIsNotNull() {
            addCriterion("emailed is not null");
            return (Criteria) this;
        }

        public Criteria andEmailedEqualTo(Byte value) {
            addCriterion("emailed =", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedNotEqualTo(Byte value) {
            addCriterion("emailed <>", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedGreaterThan(Byte value) {
            addCriterion("emailed >", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedGreaterThanOrEqualTo(Byte value) {
            addCriterion("emailed >=", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedLessThan(Byte value) {
            addCriterion("emailed <", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedLessThanOrEqualTo(Byte value) {
            addCriterion("emailed <=", value, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedIn(List<Byte> values) {
            addCriterion("emailed in", values, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedNotIn(List<Byte> values) {
            addCriterion("emailed not in", values, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedBetween(Byte value1, Byte value2) {
            addCriterion("emailed between", value1, value2, "emailed");
            return (Criteria) this;
        }

        public Criteria andEmailedNotBetween(Byte value1, Byte value2) {
            addCriterion("emailed not between", value1, value2, "emailed");
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