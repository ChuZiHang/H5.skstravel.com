package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SkCartExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkCartExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
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

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
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

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Short value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Short value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Short value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Short value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Short value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Short> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Short> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Short value1, Short value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Short value1, Short value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNull() {
            addCriterion("is_real is null");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNotNull() {
            addCriterion("is_real is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealEqualTo(Boolean value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(Boolean value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(Boolean value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(Boolean value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(Boolean value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<Boolean> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<Boolean> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real not between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNull() {
            addCriterion("extension_code is null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNotNull() {
            addCriterion("extension_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeEqualTo(String value) {
            addCriterion("extension_code =", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotEqualTo(String value) {
            addCriterion("extension_code <>", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThan(String value) {
            addCriterion("extension_code >", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("extension_code >=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThan(String value) {
            addCriterion("extension_code <", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThanOrEqualTo(String value) {
            addCriterion("extension_code <=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLike(String value) {
            addCriterion("extension_code like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotLike(String value) {
            addCriterion("extension_code not like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIn(List<String> values) {
            addCriterion("extension_code in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotIn(List<String> values) {
            addCriterion("extension_code not in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeBetween(String value1, String value2) {
            addCriterion("extension_code between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotBetween(String value1, String value2) {
            addCriterion("extension_code not between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRecTypeIsNull() {
            addCriterion("rec_type is null");
            return (Criteria) this;
        }

        public Criteria andRecTypeIsNotNull() {
            addCriterion("rec_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecTypeEqualTo(Boolean value) {
            addCriterion("rec_type =", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotEqualTo(Boolean value) {
            addCriterion("rec_type <>", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThan(Boolean value) {
            addCriterion("rec_type >", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rec_type >=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThan(Boolean value) {
            addCriterion("rec_type <", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("rec_type <=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeIn(List<Boolean> values) {
            addCriterion("rec_type in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotIn(List<Boolean> values) {
            addCriterion("rec_type not in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("rec_type between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rec_type not between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Short value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Short value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Short value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Short value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Short value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Short value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Short> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Short> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Short value1, Short value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Short value1, Short value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsShippingIsNull() {
            addCriterion("is_shipping is null");
            return (Criteria) this;
        }

        public Criteria andIsShippingIsNotNull() {
            addCriterion("is_shipping is not null");
            return (Criteria) this;
        }

        public Criteria andIsShippingEqualTo(Boolean value) {
            addCriterion("is_shipping =", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotEqualTo(Boolean value) {
            addCriterion("is_shipping <>", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingGreaterThan(Boolean value) {
            addCriterion("is_shipping >", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shipping >=", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingLessThan(Boolean value) {
            addCriterion("is_shipping <", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shipping <=", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingIn(List<Boolean> values) {
            addCriterion("is_shipping in", values, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotIn(List<Boolean> values) {
            addCriterion("is_shipping not in", values, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shipping between", value1, value2, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shipping not between", value1, value2, "isShipping");
            return (Criteria) this;
        }

        public Criteria andCanHandselIsNull() {
            addCriterion("can_handsel is null");
            return (Criteria) this;
        }

        public Criteria andCanHandselIsNotNull() {
            addCriterion("can_handsel is not null");
            return (Criteria) this;
        }

        public Criteria andCanHandselEqualTo(Byte value) {
            addCriterion("can_handsel =", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselNotEqualTo(Byte value) {
            addCriterion("can_handsel <>", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselGreaterThan(Byte value) {
            addCriterion("can_handsel >", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselGreaterThanOrEqualTo(Byte value) {
            addCriterion("can_handsel >=", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselLessThan(Byte value) {
            addCriterion("can_handsel <", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselLessThanOrEqualTo(Byte value) {
            addCriterion("can_handsel <=", value, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselIn(List<Byte> values) {
            addCriterion("can_handsel in", values, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselNotIn(List<Byte> values) {
            addCriterion("can_handsel not in", values, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselBetween(Byte value1, Byte value2) {
            addCriterion("can_handsel between", value1, value2, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andCanHandselNotBetween(Byte value1, Byte value2) {
            addCriterion("can_handsel not between", value1, value2, "canHandsel");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdIsNull() {
            addCriterion("goods_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdIsNotNull() {
            addCriterion("goods_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdEqualTo(String value) {
            addCriterion("goods_attr_id =", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotEqualTo(String value) {
            addCriterion("goods_attr_id <>", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdGreaterThan(String value) {
            addCriterion("goods_attr_id >", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr_id >=", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLessThan(String value) {
            addCriterion("goods_attr_id <", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLessThanOrEqualTo(String value) {
            addCriterion("goods_attr_id <=", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLike(String value) {
            addCriterion("goods_attr_id like", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotLike(String value) {
            addCriterion("goods_attr_id not like", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdIn(List<String> values) {
            addCriterion("goods_attr_id in", values, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotIn(List<String> values) {
            addCriterion("goods_attr_id not in", values, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdBetween(String value1, String value2) {
            addCriterion("goods_attr_id between", value1, value2, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotBetween(String value1, String value2) {
            addCriterion("goods_attr_id not between", value1, value2, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
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

        public Criteria andDepartSubmitIsNull() {
            addCriterion("depart_submit is null");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitIsNotNull() {
            addCriterion("depart_submit is not null");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitEqualTo(String value) {
            addCriterion("depart_submit =", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitNotEqualTo(String value) {
            addCriterion("depart_submit <>", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitGreaterThan(String value) {
            addCriterion("depart_submit >", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitGreaterThanOrEqualTo(String value) {
            addCriterion("depart_submit >=", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitLessThan(String value) {
            addCriterion("depart_submit <", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitLessThanOrEqualTo(String value) {
            addCriterion("depart_submit <=", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitLike(String value) {
            addCriterion("depart_submit like", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitNotLike(String value) {
            addCriterion("depart_submit not like", value, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitIn(List<String> values) {
            addCriterion("depart_submit in", values, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitNotIn(List<String> values) {
            addCriterion("depart_submit not in", values, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitBetween(String value1, String value2) {
            addCriterion("depart_submit between", value1, value2, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitNotBetween(String value1, String value2) {
            addCriterion("depart_submit not between", value1, value2, "departSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitIsNull() {
            addCriterion("arrive_submit is null");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitIsNotNull() {
            addCriterion("arrive_submit is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitEqualTo(String value) {
            addCriterion("arrive_submit =", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitNotEqualTo(String value) {
            addCriterion("arrive_submit <>", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitGreaterThan(String value) {
            addCriterion("arrive_submit >", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_submit >=", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitLessThan(String value) {
            addCriterion("arrive_submit <", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitLessThanOrEqualTo(String value) {
            addCriterion("arrive_submit <=", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitLike(String value) {
            addCriterion("arrive_submit like", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitNotLike(String value) {
            addCriterion("arrive_submit not like", value, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitIn(List<String> values) {
            addCriterion("arrive_submit in", values, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitNotIn(List<String> values) {
            addCriterion("arrive_submit not in", values, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitBetween(String value1, String value2) {
            addCriterion("arrive_submit between", value1, value2, "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitNotBetween(String value1, String value2) {
            addCriterion("arrive_submit not between", value1, value2, "arriveSubmit");
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

        public Criteria andHotelStartDateIsNull() {
            addCriterion("hotel_start_date is null");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateIsNotNull() {
            addCriterion("hotel_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_start_date =", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_start_date <>", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("hotel_start_date >", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_start_date >=", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateLessThan(Date value) {
            addCriterionForJDBCDate("hotel_start_date <", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_start_date <=", value, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("hotel_start_date in", values, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hotel_start_date not in", values, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hotel_start_date between", value1, value2, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hotel_start_date not between", value1, value2, "hotelStartDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateIsNull() {
            addCriterion("hotel_end_date is null");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateIsNotNull() {
            addCriterion("hotel_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_end_date =", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_end_date <>", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("hotel_end_date >", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_end_date >=", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateLessThan(Date value) {
            addCriterionForJDBCDate("hotel_end_date <", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hotel_end_date <=", value, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("hotel_end_date in", values, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hotel_end_date not in", values, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hotel_end_date between", value1, value2, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andHotelEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hotel_end_date not between", value1, value2, "hotelEndDate");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("star_level is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("star_level is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("star_level =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("star_level <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("star_level >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("star_level >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("star_level <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("star_level <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("star_level like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("star_level not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("star_level in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("star_level not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("star_level between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("star_level not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyIsNull() {
            addCriterion("room_money is null");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyIsNotNull() {
            addCriterion("room_money is not null");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyEqualTo(Integer value) {
            addCriterion("room_money =", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyNotEqualTo(Integer value) {
            addCriterion("room_money <>", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyGreaterThan(Integer value) {
            addCriterion("room_money >", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_money >=", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyLessThan(Integer value) {
            addCriterion("room_money <", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("room_money <=", value, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyIn(List<Integer> values) {
            addCriterion("room_money in", values, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyNotIn(List<Integer> values) {
            addCriterion("room_money not in", values, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyBetween(Integer value1, Integer value2) {
            addCriterion("room_money between", value1, value2, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("room_money not between", value1, value2, "roomMoney");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
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

        public Criteria andAirLineTypeIsNull() {
            addCriterion("air_line_type is null");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeIsNotNull() {
            addCriterion("air_line_type is not null");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeEqualTo(Byte value) {
            addCriterion("air_line_type =", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeNotEqualTo(Byte value) {
            addCriterion("air_line_type <>", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeGreaterThan(Byte value) {
            addCriterion("air_line_type >", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("air_line_type >=", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeLessThan(Byte value) {
            addCriterion("air_line_type <", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeLessThanOrEqualTo(Byte value) {
            addCriterion("air_line_type <=", value, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeIn(List<Byte> values) {
            addCriterion("air_line_type in", values, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeNotIn(List<Byte> values) {
            addCriterion("air_line_type not in", values, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeBetween(Byte value1, Byte value2) {
            addCriterion("air_line_type between", value1, value2, "airLineType");
            return (Criteria) this;
        }

        public Criteria andAirLineTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("air_line_type not between", value1, value2, "airLineType");
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

        public Criteria andFlyDateEqualTo(String value) {
            addCriterion("fly_date =", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotEqualTo(String value) {
            addCriterion("fly_date <>", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateGreaterThan(String value) {
            addCriterion("fly_date >", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateGreaterThanOrEqualTo(String value) {
            addCriterion("fly_date >=", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateLessThan(String value) {
            addCriterion("fly_date <", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateLessThanOrEqualTo(String value) {
            addCriterion("fly_date <=", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateLike(String value) {
            addCriterion("fly_date like", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotLike(String value) {
            addCriterion("fly_date not like", value, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateIn(List<String> values) {
            addCriterion("fly_date in", values, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotIn(List<String> values) {
            addCriterion("fly_date not in", values, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateBetween(String value1, String value2) {
            addCriterion("fly_date between", value1, value2, "flyDate");
            return (Criteria) this;
        }

        public Criteria andFlyDateNotBetween(String value1, String value2) {
            addCriterion("fly_date not between", value1, value2, "flyDate");
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

        public Criteria andReturnFlyDateEqualTo(String value) {
            addCriterion("return_fly_date =", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotEqualTo(String value) {
            addCriterion("return_fly_date <>", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateGreaterThan(String value) {
            addCriterion("return_fly_date >", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateGreaterThanOrEqualTo(String value) {
            addCriterion("return_fly_date >=", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLessThan(String value) {
            addCriterion("return_fly_date <", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLessThanOrEqualTo(String value) {
            addCriterion("return_fly_date <=", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLike(String value) {
            addCriterion("return_fly_date like", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotLike(String value) {
            addCriterion("return_fly_date not like", value, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateIn(List<String> values) {
            addCriterion("return_fly_date in", values, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotIn(List<String> values) {
            addCriterion("return_fly_date not in", values, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateBetween(String value1, String value2) {
            addCriterion("return_fly_date between", value1, value2, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateNotBetween(String value1, String value2) {
            addCriterion("return_fly_date not between", value1, value2, "returnFlyDate");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
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

        public Criteria andSessionIdLikeInsensitive(String value) {
            addCriterion("upper(session_id) like", value.toUpperCase(), "sessionId");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLikeInsensitive(String value) {
            addCriterion("upper(goods_sn) like", value.toUpperCase(), "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLikeInsensitive(String value) {
            addCriterion("upper(goods_name) like", value.toUpperCase(), "goodsName");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLikeInsensitive(String value) {
            addCriterion("upper(extension_code) like", value.toUpperCase(), "extensionCode");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLikeInsensitive(String value) {
            addCriterion("upper(goods_attr_id) like", value.toUpperCase(), "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLikeInsensitive(String value) {
            addCriterion("upper(goods_type) like", value.toUpperCase(), "goodsType");
            return (Criteria) this;
        }

        public Criteria andDepartSubmitLikeInsensitive(String value) {
            addCriterion("upper(depart_submit) like", value.toUpperCase(), "departSubmit");
            return (Criteria) this;
        }

        public Criteria andArriveSubmitLikeInsensitive(String value) {
            addCriterion("upper(arrive_submit) like", value.toUpperCase(), "arriveSubmit");
            return (Criteria) this;
        }

        public Criteria andStarLevelLikeInsensitive(String value) {
            addCriterion("upper(star_level) like", value.toUpperCase(), "starLevel");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLikeInsensitive(String value) {
            addCriterion("upper(room_type) like", value.toUpperCase(), "roomType");
            return (Criteria) this;
        }

        public Criteria andFlyDateLikeInsensitive(String value) {
            addCriterion("upper(fly_date) like", value.toUpperCase(), "flyDate");
            return (Criteria) this;
        }

        public Criteria andReturnFlyDateLikeInsensitive(String value) {
            addCriterion("upper(return_fly_date) like", value.toUpperCase(), "returnFlyDate");
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