package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkOrderComboInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkOrderComboInfoExample() {
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

        public Criteria andComboIdIsNull() {
            addCriterion("combo_id is null");
            return (Criteria) this;
        }

        public Criteria andComboIdIsNotNull() {
            addCriterion("combo_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboIdEqualTo(Integer value) {
            addCriterion("combo_id =", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotEqualTo(Integer value) {
            addCriterion("combo_id <>", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThan(Integer value) {
            addCriterion("combo_id >", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_id >=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThan(Integer value) {
            addCriterion("combo_id <", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_id <=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdIn(List<Integer> values) {
            addCriterion("combo_id in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotIn(List<Integer> values) {
            addCriterion("combo_id not in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_id between", value1, value2, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_id not between", value1, value2, "comboId");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberIsNull() {
            addCriterion("order_combo_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberIsNotNull() {
            addCriterion("order_combo_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberEqualTo(Integer value) {
            addCriterion("order_combo_number =", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberNotEqualTo(Integer value) {
            addCriterion("order_combo_number <>", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberGreaterThan(Integer value) {
            addCriterion("order_combo_number >", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_combo_number >=", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberLessThan(Integer value) {
            addCriterion("order_combo_number <", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_combo_number <=", value, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberIn(List<Integer> values) {
            addCriterion("order_combo_number in", values, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberNotIn(List<Integer> values) {
            addCriterion("order_combo_number not in", values, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_combo_number between", value1, value2, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_combo_number not between", value1, value2, "orderComboNumber");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceIsNull() {
            addCriterion("order_combo_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceIsNotNull() {
            addCriterion("order_combo_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceEqualTo(BigDecimal value) {
            addCriterion("order_combo_price =", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_combo_price <>", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceGreaterThan(BigDecimal value) {
            addCriterion("order_combo_price >", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_combo_price >=", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceLessThan(BigDecimal value) {
            addCriterion("order_combo_price <", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_combo_price <=", value, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceIn(List<BigDecimal> values) {
            addCriterion("order_combo_price in", values, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_combo_price not in", values, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_combo_price between", value1, value2, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_combo_price not between", value1, value2, "orderComboPrice");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyIsNull() {
            addCriterion("order_combo_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyIsNotNull() {
            addCriterion("order_combo_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyEqualTo(Long value) {
            addCriterion("order_combo_money =", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyNotEqualTo(Long value) {
            addCriterion("order_combo_money <>", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyGreaterThan(Long value) {
            addCriterion("order_combo_money >", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("order_combo_money >=", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyLessThan(Long value) {
            addCriterion("order_combo_money <", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyLessThanOrEqualTo(Long value) {
            addCriterion("order_combo_money <=", value, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyIn(List<Long> values) {
            addCriterion("order_combo_money in", values, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyNotIn(List<Long> values) {
            addCriterion("order_combo_money not in", values, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyBetween(Long value1, Long value2) {
            addCriterion("order_combo_money between", value1, value2, "orderComboMoney");
            return (Criteria) this;
        }

        public Criteria andOrderComboMoneyNotBetween(Long value1, Long value2) {
            addCriterion("order_combo_money not between", value1, value2, "orderComboMoney");
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