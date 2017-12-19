package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SkOrderPlaneExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkOrderPlaneExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFromCityIsNull() {
            addCriterion("from_city is null");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNotNull() {
            addCriterion("from_city is not null");
            return (Criteria) this;
        }

        public Criteria andFromCityEqualTo(Integer value) {
            addCriterion("from_city =", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotEqualTo(Integer value) {
            addCriterion("from_city <>", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThan(Integer value) {
            addCriterion("from_city >", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_city >=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThan(Integer value) {
            addCriterion("from_city <", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThanOrEqualTo(Integer value) {
            addCriterion("from_city <=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityIn(List<Integer> values) {
            addCriterion("from_city in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotIn(List<Integer> values) {
            addCriterion("from_city not in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityBetween(Integer value1, Integer value2) {
            addCriterion("from_city between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotBetween(Integer value1, Integer value2) {
            addCriterion("from_city not between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andToCityIsNull() {
            addCriterion("to_city is null");
            return (Criteria) this;
        }

        public Criteria andToCityIsNotNull() {
            addCriterion("to_city is not null");
            return (Criteria) this;
        }

        public Criteria andToCityEqualTo(Integer value) {
            addCriterion("to_city =", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotEqualTo(Integer value) {
            addCriterion("to_city <>", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThan(Integer value) {
            addCriterion("to_city >", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_city >=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThan(Integer value) {
            addCriterion("to_city <", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThanOrEqualTo(Integer value) {
            addCriterion("to_city <=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityIn(List<Integer> values) {
            addCriterion("to_city in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotIn(List<Integer> values) {
            addCriterion("to_city not in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityBetween(Integer value1, Integer value2) {
            addCriterion("to_city between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotBetween(Integer value1, Integer value2) {
            addCriterion("to_city not between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andFlyDateIsNull() {
            addCriterion("fly_date is null");
            return (Criteria) this;
        }

        public Criteria andFlyDateIsNotNull() {
            addCriterion("fly_date is not null");
            return (Criteria) this;
        }

        public Criteria andFlyDateEqualTo(Date value) {
            addCriterionForJDBCDate("fly_date =", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fly_date <>", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fly_date >", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fly_date >=", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateLessThan(Date value) {
            addCriterionForJDBCDate("fly_date <", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fly_date <=", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateIn(List<Date> values) {
            addCriterionForJDBCDate("fly_date in", values, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fly_date not in", values, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fly_date between", value1, value2, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fly_date not between", value1, value2, "flyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateIsNull() {
            addCriterion("return_fly_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateIsNotNull() {
            addCriterion("return_fly_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateEqualTo(Date value) {
            addCriterionForJDBCDate("return_fly_date =", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_fly_date <>", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_fly_date >", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_fly_date >=", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLessThan(Date value) {
            addCriterionForJDBCDate("return_fly_date <", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_fly_date <=", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateIn(List<Date> values) {
            addCriterionForJDBCDate("return_fly_date in", values, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_fly_date not in", values, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_fly_date between", value1, value2, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_fly_date not between", value1, value2, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andAirIdIsNull() {
            addCriterion("air_id is null");
            return (Criteria) this;
        }

        public Criteria andAirIdIsNotNull() {
            addCriterion("air_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirIdEqualTo(Integer value) {
            addCriterion("air_id =", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotEqualTo(Integer value) {
            addCriterion("air_id <>", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThan(Integer value) {
            addCriterion("air_id >", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_id >=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThan(Integer value) {
            addCriterion("air_id <", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThanOrEqualTo(Integer value) {
            addCriterion("air_id <=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdIn(List<Integer> values) {
            addCriterion("air_id in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotIn(List<Integer> values) {
            addCriterion("air_id not in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdBetween(Integer value1, Integer value2) {
            addCriterion("air_id between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotBetween(Integer value1, Integer value2) {
            addCriterion("air_id not between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdIsNull() {
            addCriterion("space_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaceIdIsNotNull() {
            addCriterion("space_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceIdEqualTo(Integer value) {
            addCriterion("space_id =", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotEqualTo(Integer value) {
            addCriterion("space_id <>", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdGreaterThan(Integer value) {
            addCriterion("space_id >", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("space_id >=", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdLessThan(Integer value) {
            addCriterion("space_id <", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("space_id <=", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdIn(List<Integer> values) {
            addCriterion("space_id in", values, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotIn(List<Integer> values) {
            addCriterion("space_id not in", values, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdBetween(Integer value1, Integer value2) {
            addCriterion("space_id between", value1, value2, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("space_id not between", value1, value2, "spaceId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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