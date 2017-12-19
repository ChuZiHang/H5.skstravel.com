package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkGoodsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkGoodsExample() {
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

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Short value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Short value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Short value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Short value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Short value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Short> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Short> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Short value1, Short value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Short value1, Short value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
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

        public Criteria andGoodsNameStyleIsNull() {
            addCriterion("goods_name_style is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleIsNotNull() {
            addCriterion("goods_name_style is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleEqualTo(String value) {
            addCriterion("goods_name_style =", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotEqualTo(String value) {
            addCriterion("goods_name_style <>", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleGreaterThan(String value) {
            addCriterion("goods_name_style >", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name_style >=", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLessThan(String value) {
            addCriterion("goods_name_style <", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLessThanOrEqualTo(String value) {
            addCriterion("goods_name_style <=", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleLike(String value) {
            addCriterion("goods_name_style like", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotLike(String value) {
            addCriterion("goods_name_style not like", value, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleIn(List<String> values) {
            addCriterion("goods_name_style in", values, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotIn(List<String> values) {
            addCriterion("goods_name_style not in", values, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleBetween(String value1, String value2) {
            addCriterion("goods_name_style between", value1, value2, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsNameStyleNotBetween(String value1, String value2) {
            addCriterion("goods_name_style not between", value1, value2, "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Short value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Short value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Short value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Short value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Short value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Short value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Short> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Short> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Short value1, Short value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Short value1, Short value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("provider_name is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("provider_name is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("provider_name =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("provider_name <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("provider_name >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("provider_name >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("provider_name <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("provider_name <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("provider_name like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("provider_name not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("provider_name in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("provider_name not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("provider_name between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("provider_name not between", value1, value2, "providerName");
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

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(BigDecimal value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(BigDecimal value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(BigDecimal value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(BigDecimal value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<BigDecimal> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<BigDecimal> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
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

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(BigDecimal value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(BigDecimal value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(BigDecimal value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(BigDecimal value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<BigDecimal> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<BigDecimal> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNull() {
            addCriterion("promote_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNotNull() {
            addCriterion("promote_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceEqualTo(BigDecimal value) {
            addCriterion("promote_price =", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotEqualTo(BigDecimal value) {
            addCriterion("promote_price <>", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThan(BigDecimal value) {
            addCriterion("promote_price >", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promote_price >=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThan(BigDecimal value) {
            addCriterion("promote_price <", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promote_price <=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIn(List<BigDecimal> values) {
            addCriterion("promote_price in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotIn(List<BigDecimal> values) {
            addCriterion("promote_price not in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promote_price between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promote_price not between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIsNull() {
            addCriterion("promote_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIsNotNull() {
            addCriterion("promote_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateEqualTo(Integer value) {
            addCriterion("promote_start_date =", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotEqualTo(Integer value) {
            addCriterion("promote_start_date <>", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateGreaterThan(Integer value) {
            addCriterion("promote_start_date >", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promote_start_date >=", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateLessThan(Integer value) {
            addCriterion("promote_start_date <", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("promote_start_date <=", value, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateIn(List<Integer> values) {
            addCriterion("promote_start_date in", values, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotIn(List<Integer> values) {
            addCriterion("promote_start_date not in", values, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateBetween(Integer value1, Integer value2) {
            addCriterion("promote_start_date between", value1, value2, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("promote_start_date not between", value1, value2, "promoteStartDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIsNull() {
            addCriterion("promote_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIsNotNull() {
            addCriterion("promote_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateEqualTo(Integer value) {
            addCriterion("promote_end_date =", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotEqualTo(Integer value) {
            addCriterion("promote_end_date <>", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateGreaterThan(Integer value) {
            addCriterion("promote_end_date >", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promote_end_date >=", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateLessThan(Integer value) {
            addCriterion("promote_end_date <", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("promote_end_date <=", value, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateIn(List<Integer> values) {
            addCriterion("promote_end_date in", values, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotIn(List<Integer> values) {
            addCriterion("promote_end_date not in", values, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateBetween(Integer value1, Integer value2) {
            addCriterion("promote_end_date between", value1, value2, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andPromoteEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("promote_end_date not between", value1, value2, "promoteEndDate");
            return (Criteria) this;
        }

        public Criteria andWarnNumberIsNull() {
            addCriterion("warn_number is null");
            return (Criteria) this;
        }

        public Criteria andWarnNumberIsNotNull() {
            addCriterion("warn_number is not null");
            return (Criteria) this;
        }

        public Criteria andWarnNumberEqualTo(Byte value) {
            addCriterion("warn_number =", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberNotEqualTo(Byte value) {
            addCriterion("warn_number <>", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberGreaterThan(Byte value) {
            addCriterion("warn_number >", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("warn_number >=", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberLessThan(Byte value) {
            addCriterion("warn_number <", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberLessThanOrEqualTo(Byte value) {
            addCriterion("warn_number <=", value, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberIn(List<Byte> values) {
            addCriterion("warn_number in", values, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberNotIn(List<Byte> values) {
            addCriterion("warn_number not in", values, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberBetween(Byte value1, Byte value2) {
            addCriterion("warn_number between", value1, value2, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andWarnNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("warn_number not between", value1, value2, "warnNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIsNull() {
            addCriterion("goods_brief is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIsNotNull() {
            addCriterion("goods_brief is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefEqualTo(String value) {
            addCriterion("goods_brief =", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotEqualTo(String value) {
            addCriterion("goods_brief <>", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefGreaterThan(String value) {
            addCriterion("goods_brief >", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brief >=", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLessThan(String value) {
            addCriterion("goods_brief <", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLessThanOrEqualTo(String value) {
            addCriterion("goods_brief <=", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLike(String value) {
            addCriterion("goods_brief like", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotLike(String value) {
            addCriterion("goods_brief not like", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIn(List<String> values) {
            addCriterion("goods_brief in", values, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotIn(List<String> values) {
            addCriterion("goods_brief not in", values, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefBetween(String value1, String value2) {
            addCriterion("goods_brief between", value1, value2, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotBetween(String value1, String value2) {
            addCriterion("goods_brief not between", value1, value2, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIsNull() {
            addCriterion("goods_thumb is null");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIsNotNull() {
            addCriterion("goods_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbEqualTo(String value) {
            addCriterion("goods_thumb =", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotEqualTo(String value) {
            addCriterion("goods_thumb <>", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbGreaterThan(String value) {
            addCriterion("goods_thumb >", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbGreaterThanOrEqualTo(String value) {
            addCriterion("goods_thumb >=", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLessThan(String value) {
            addCriterion("goods_thumb <", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLessThanOrEqualTo(String value) {
            addCriterion("goods_thumb <=", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLike(String value) {
            addCriterion("goods_thumb like", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotLike(String value) {
            addCriterion("goods_thumb not like", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIn(List<String> values) {
            addCriterion("goods_thumb in", values, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotIn(List<String> values) {
            addCriterion("goods_thumb not in", values, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbBetween(String value1, String value2) {
            addCriterion("goods_thumb between", value1, value2, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotBetween(String value1, String value2) {
            addCriterion("goods_thumb not between", value1, value2, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIsNull() {
            addCriterion("original_img is null");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIsNotNull() {
            addCriterion("original_img is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalImgEqualTo(String value) {
            addCriterion("original_img =", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotEqualTo(String value) {
            addCriterion("original_img <>", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgGreaterThan(String value) {
            addCriterion("original_img >", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgGreaterThanOrEqualTo(String value) {
            addCriterion("original_img >=", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLessThan(String value) {
            addCriterion("original_img <", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLessThanOrEqualTo(String value) {
            addCriterion("original_img <=", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLike(String value) {
            addCriterion("original_img like", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotLike(String value) {
            addCriterion("original_img not like", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIn(List<String> values) {
            addCriterion("original_img in", values, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotIn(List<String> values) {
            addCriterion("original_img not in", values, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgBetween(String value1, String value2) {
            addCriterion("original_img between", value1, value2, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotBetween(String value1, String value2) {
            addCriterion("original_img not between", value1, value2, "originalImg");
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

        public Criteria andIsRealEqualTo(Byte value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(Byte value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(Byte value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(Byte value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(Byte value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<Byte> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<Byte> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(Byte value1, Byte value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(Byte value1, Byte value2) {
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

        public Criteria andIsOnSaleIsNull() {
            addCriterion("is_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("is_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(Boolean value) {
            addCriterion("is_on_sale =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(Boolean value) {
            addCriterion("is_on_sale <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(Boolean value) {
            addCriterion("is_on_sale >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(Boolean value) {
            addCriterion("is_on_sale <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<Boolean> values) {
            addCriterion("is_on_sale in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<Boolean> values) {
            addCriterion("is_on_sale not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale not between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleIsNull() {
            addCriterion("is_alone_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleIsNotNull() {
            addCriterion("is_alone_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleEqualTo(Boolean value) {
            addCriterion("is_alone_sale =", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleNotEqualTo(Boolean value) {
            addCriterion("is_alone_sale <>", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleGreaterThan(Boolean value) {
            addCriterion("is_alone_sale >", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_alone_sale >=", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleLessThan(Boolean value) {
            addCriterion("is_alone_sale <", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_alone_sale <=", value, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleIn(List<Boolean> values) {
            addCriterion("is_alone_sale in", values, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleNotIn(List<Boolean> values) {
            addCriterion("is_alone_sale not in", values, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_alone_sale between", value1, value2, "isAloneSale");
            return (Criteria) this;
        }

        public Criteria andIsAloneSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_alone_sale not between", value1, value2, "isAloneSale");
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

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Short value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Short value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Short value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Short value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Short value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Short> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Short> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Short value1, Short value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Short value1, Short value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Boolean value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Boolean value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Boolean value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Boolean value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Boolean value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Boolean> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Boolean> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNull() {
            addCriterion("is_promote is null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIsNotNull() {
            addCriterion("is_promote is not null");
            return (Criteria) this;
        }

        public Criteria andIsPromoteEqualTo(Boolean value) {
            addCriterion("is_promote =", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotEqualTo(Boolean value) {
            addCriterion("is_promote <>", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThan(Boolean value) {
            addCriterion("is_promote >", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_promote >=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThan(Boolean value) {
            addCriterion("is_promote <", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_promote <=", value, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteIn(List<Boolean> values) {
            addCriterion("is_promote in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotIn(List<Boolean> values) {
            addCriterion("is_promote not in", values, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_promote between", value1, value2, "isPromote");
            return (Criteria) this;
        }

        public Criteria andIsPromoteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_promote not between", value1, value2, "isPromote");
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

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Integer value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Integer value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Integer value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Integer value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Integer> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Integer> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Integer value1, Integer value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
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

        public Criteria andGoodsTypeEqualTo(Short value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Short value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Short value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Short value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Short value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Short> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Short> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Short value1, Short value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Short value1, Short value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIsNull() {
            addCriterion("seller_note is null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIsNotNull() {
            addCriterion("seller_note is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteEqualTo(String value) {
            addCriterion("seller_note =", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotEqualTo(String value) {
            addCriterion("seller_note <>", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteGreaterThan(String value) {
            addCriterion("seller_note >", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteGreaterThanOrEqualTo(String value) {
            addCriterion("seller_note >=", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLessThan(String value) {
            addCriterion("seller_note <", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLessThanOrEqualTo(String value) {
            addCriterion("seller_note <=", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLike(String value) {
            addCriterion("seller_note like", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotLike(String value) {
            addCriterion("seller_note not like", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIn(List<String> values) {
            addCriterion("seller_note in", values, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotIn(List<String> values) {
            addCriterion("seller_note not in", values, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteBetween(String value1, String value2) {
            addCriterion("seller_note between", value1, value2, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotBetween(String value1, String value2) {
            addCriterion("seller_note not between", value1, value2, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIsNull() {
            addCriterion("give_integral is null");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIsNotNull() {
            addCriterion("give_integral is not null");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralEqualTo(Integer value) {
            addCriterion("give_integral =", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotEqualTo(Integer value) {
            addCriterion("give_integral <>", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralGreaterThan(Integer value) {
            addCriterion("give_integral >", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_integral >=", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralLessThan(Integer value) {
            addCriterion("give_integral <", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("give_integral <=", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIn(List<Integer> values) {
            addCriterion("give_integral in", values, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotIn(List<Integer> values) {
            addCriterion("give_integral not in", values, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralBetween(Integer value1, Integer value2) {
            addCriterion("give_integral between", value1, value2, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("give_integral not between", value1, value2, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralIsNull() {
            addCriterion("rank_integral is null");
            return (Criteria) this;
        }

        public Criteria andRankIntegralIsNotNull() {
            addCriterion("rank_integral is not null");
            return (Criteria) this;
        }

        public Criteria andRankIntegralEqualTo(Integer value) {
            addCriterion("rank_integral =", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralNotEqualTo(Integer value) {
            addCriterion("rank_integral <>", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralGreaterThan(Integer value) {
            addCriterion("rank_integral >", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_integral >=", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralLessThan(Integer value) {
            addCriterion("rank_integral <", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("rank_integral <=", value, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralIn(List<Integer> values) {
            addCriterion("rank_integral in", values, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralNotIn(List<Integer> values) {
            addCriterion("rank_integral not in", values, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralBetween(Integer value1, Integer value2) {
            addCriterion("rank_integral between", value1, value2, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andRankIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_integral not between", value1, value2, "rankIntegral");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNull() {
            addCriterion("suppliers_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNotNull() {
            addCriterion("suppliers_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdEqualTo(Short value) {
            addCriterion("suppliers_id =", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotEqualTo(Short value) {
            addCriterion("suppliers_id <>", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThan(Short value) {
            addCriterion("suppliers_id >", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThanOrEqualTo(Short value) {
            addCriterion("suppliers_id >=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThan(Short value) {
            addCriterion("suppliers_id <", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThanOrEqualTo(Short value) {
            addCriterion("suppliers_id <=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIn(List<Short> values) {
            addCriterion("suppliers_id in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotIn(List<Short> values) {
            addCriterion("suppliers_id not in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdBetween(Short value1, Short value2) {
            addCriterion("suppliers_id between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotBetween(Short value1, Short value2) {
            addCriterion("suppliers_id not between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Boolean value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Boolean value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Boolean value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Boolean value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Boolean> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Boolean> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
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

        public Criteria andScheIdIsNull() {
            addCriterion("sche_id is null");
            return (Criteria) this;
        }

        public Criteria andScheIdIsNotNull() {
            addCriterion("sche_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheIdEqualTo(Integer value) {
            addCriterion("sche_id =", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotEqualTo(Integer value) {
            addCriterion("sche_id <>", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdGreaterThan(Integer value) {
            addCriterion("sche_id >", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sche_id >=", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdLessThan(Integer value) {
            addCriterion("sche_id <", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdLessThanOrEqualTo(Integer value) {
            addCriterion("sche_id <=", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdIn(List<Integer> values) {
            addCriterion("sche_id in", values, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotIn(List<Integer> values) {
            addCriterion("sche_id not in", values, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdBetween(Integer value1, Integer value2) {
            addCriterion("sche_id between", value1, value2, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sche_id not between", value1, value2, "scheId");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNull() {
            addCriterion("number_id is null");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNotNull() {
            addCriterion("number_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumberIdEqualTo(Integer value) {
            addCriterion("number_id =", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotEqualTo(Integer value) {
            addCriterion("number_id <>", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThan(Integer value) {
            addCriterion("number_id >", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_id >=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThan(Integer value) {
            addCriterion("number_id <", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("number_id <=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdIn(List<Integer> values) {
            addCriterion("number_id in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotIn(List<Integer> values) {
            addCriterion("number_id not in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdBetween(Integer value1, Integer value2) {
            addCriterion("number_id between", value1, value2, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("number_id not between", value1, value2, "numberId");
            return (Criteria) this;
        }

        public Criteria andPitchIdIsNull() {
            addCriterion("pitch_id is null");
            return (Criteria) this;
        }

        public Criteria andPitchIdIsNotNull() {
            addCriterion("pitch_id is not null");
            return (Criteria) this;
        }

        public Criteria andPitchIdEqualTo(Integer value) {
            addCriterion("pitch_id =", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotEqualTo(Integer value) {
            addCriterion("pitch_id <>", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdGreaterThan(Integer value) {
            addCriterion("pitch_id >", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pitch_id >=", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdLessThan(Integer value) {
            addCriterion("pitch_id <", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdLessThanOrEqualTo(Integer value) {
            addCriterion("pitch_id <=", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdIn(List<Integer> values) {
            addCriterion("pitch_id in", values, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotIn(List<Integer> values) {
            addCriterion("pitch_id not in", values, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdBetween(Integer value1, Integer value2) {
            addCriterion("pitch_id between", value1, value2, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pitch_id not between", value1, value2, "pitchId");
            return (Criteria) this;
        }

        public Criteria andIcIsNull() {
            addCriterion("ic is null");
            return (Criteria) this;
        }

        public Criteria andIcIsNotNull() {
            addCriterion("ic is not null");
            return (Criteria) this;
        }

        public Criteria andIcEqualTo(Integer value) {
            addCriterion("ic =", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotEqualTo(Integer value) {
            addCriterion("ic <>", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThan(Integer value) {
            addCriterion("ic >", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic >=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThan(Integer value) {
            addCriterion("ic <", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThanOrEqualTo(Integer value) {
            addCriterion("ic <=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcIn(List<Integer> values) {
            addCriterion("ic in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotIn(List<Integer> values) {
            addCriterion("ic not in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcBetween(Integer value1, Integer value2) {
            addCriterion("ic between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotBetween(Integer value1, Integer value2) {
            addCriterion("ic not between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("heat is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("heat is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(Integer value) {
            addCriterion("heat =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(Integer value) {
            addCriterion("heat <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(Integer value) {
            addCriterion("heat >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("heat >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(Integer value) {
            addCriterion("heat <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(Integer value) {
            addCriterion("heat <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<Integer> values) {
            addCriterion("heat in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<Integer> values) {
            addCriterion("heat not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(Integer value1, Integer value2) {
            addCriterion("heat between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(Integer value1, Integer value2) {
            addCriterion("heat not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andIsTicketIsNull() {
            addCriterion("is_ticket is null");
            return (Criteria) this;
        }

        public Criteria andIsTicketIsNotNull() {
            addCriterion("is_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andIsTicketEqualTo(Boolean value) {
            addCriterion("is_ticket =", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotEqualTo(Boolean value) {
            addCriterion("is_ticket <>", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketGreaterThan(Boolean value) {
            addCriterion("is_ticket >", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_ticket >=", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketLessThan(Boolean value) {
            addCriterion("is_ticket <", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketLessThanOrEqualTo(Boolean value) {
            addCriterion("is_ticket <=", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketIn(List<Boolean> values) {
            addCriterion("is_ticket in", values, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotIn(List<Boolean> values) {
            addCriterion("is_ticket not in", values, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketBetween(Boolean value1, Boolean value2) {
            addCriterion("is_ticket between", value1, value2, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_ticket not between", value1, value2, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsGoodsIsNull() {
            addCriterion("is_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsIsNotNull() {
            addCriterion("is_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsEqualTo(Boolean value) {
            addCriterion("is_goods =", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNotEqualTo(Boolean value) {
            addCriterion("is_goods <>", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsGreaterThan(Boolean value) {
            addCriterion("is_goods >", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_goods >=", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsLessThan(Boolean value) {
            addCriterion("is_goods <", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_goods <=", value, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsIn(List<Boolean> values) {
            addCriterion("is_goods in", values, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNotIn(List<Boolean> values) {
            addCriterion("is_goods not in", values, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_goods between", value1, value2, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_goods not between", value1, value2, "isGoods");
            return (Criteria) this;
        }

        public Criteria andIsHotelIsNull() {
            addCriterion("is_hotel is null");
            return (Criteria) this;
        }

        public Criteria andIsHotelIsNotNull() {
            addCriterion("is_hotel is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotelEqualTo(Boolean value) {
            addCriterion("is_hotel =", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelNotEqualTo(Boolean value) {
            addCriterion("is_hotel <>", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelGreaterThan(Boolean value) {
            addCriterion("is_hotel >", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hotel >=", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelLessThan(Boolean value) {
            addCriterion("is_hotel <", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hotel <=", value, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelIn(List<Boolean> values) {
            addCriterion("is_hotel in", values, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelNotIn(List<Boolean> values) {
            addCriterion("is_hotel not in", values, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hotel between", value1, value2, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsHotelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hotel not between", value1, value2, "isHotel");
            return (Criteria) this;
        }

        public Criteria andIsPlaneIsNull() {
            addCriterion("is_plane is null");
            return (Criteria) this;
        }

        public Criteria andIsPlaneIsNotNull() {
            addCriterion("is_plane is not null");
            return (Criteria) this;
        }

        public Criteria andIsPlaneEqualTo(Boolean value) {
            addCriterion("is_plane =", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneNotEqualTo(Boolean value) {
            addCriterion("is_plane <>", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneGreaterThan(Boolean value) {
            addCriterion("is_plane >", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_plane >=", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneLessThan(Boolean value) {
            addCriterion("is_plane <", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneLessThanOrEqualTo(Boolean value) {
            addCriterion("is_plane <=", value, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneIn(List<Boolean> values) {
            addCriterion("is_plane in", values, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneNotIn(List<Boolean> values) {
            addCriterion("is_plane not in", values, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneBetween(Boolean value1, Boolean value2) {
            addCriterion("is_plane between", value1, value2, "isPlane");
            return (Criteria) this;
        }

        public Criteria andIsPlaneNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_plane not between", value1, value2, "isPlane");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumIsNull() {
            addCriterion("award_credits_num is null");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumIsNotNull() {
            addCriterion("award_credits_num is not null");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumEqualTo(Integer value) {
            addCriterion("award_credits_num =", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumNotEqualTo(Integer value) {
            addCriterion("award_credits_num <>", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumGreaterThan(Integer value) {
            addCriterion("award_credits_num >", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_credits_num >=", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumLessThan(Integer value) {
            addCriterion("award_credits_num <", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumLessThanOrEqualTo(Integer value) {
            addCriterion("award_credits_num <=", value, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumIn(List<Integer> values) {
            addCriterion("award_credits_num in", values, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumNotIn(List<Integer> values) {
            addCriterion("award_credits_num not in", values, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumBetween(Integer value1, Integer value2) {
            addCriterion("award_credits_num between", value1, value2, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andAwardCreditsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("award_credits_num not between", value1, value2, "awardCreditsNum");
            return (Criteria) this;
        }

        public Criteria andSeatLogoIsNull() {
            addCriterion("seat_logo is null");
            return (Criteria) this;
        }

        public Criteria andSeatLogoIsNotNull() {
            addCriterion("seat_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLogoEqualTo(String value) {
            addCriterion("seat_logo =", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoNotEqualTo(String value) {
            addCriterion("seat_logo <>", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoGreaterThan(String value) {
            addCriterion("seat_logo >", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoGreaterThanOrEqualTo(String value) {
            addCriterion("seat_logo >=", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoLessThan(String value) {
            addCriterion("seat_logo <", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoLessThanOrEqualTo(String value) {
            addCriterion("seat_logo <=", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoLike(String value) {
            addCriterion("seat_logo like", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoNotLike(String value) {
            addCriterion("seat_logo not like", value, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoIn(List<String> values) {
            addCriterion("seat_logo in", values, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoNotIn(List<String> values) {
            addCriterion("seat_logo not in", values, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoBetween(String value1, String value2) {
            addCriterion("seat_logo between", value1, value2, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatLogoNotBetween(String value1, String value2) {
            addCriterion("seat_logo not between", value1, value2, "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatPictureIsNull() {
            addCriterion("seat_picture is null");
            return (Criteria) this;
        }

        public Criteria andSeatPictureIsNotNull() {
            addCriterion("seat_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSeatPictureEqualTo(String value) {
            addCriterion("seat_picture =", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureNotEqualTo(String value) {
            addCriterion("seat_picture <>", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureGreaterThan(String value) {
            addCriterion("seat_picture >", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureGreaterThanOrEqualTo(String value) {
            addCriterion("seat_picture >=", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureLessThan(String value) {
            addCriterion("seat_picture <", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureLessThanOrEqualTo(String value) {
            addCriterion("seat_picture <=", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureLike(String value) {
            addCriterion("seat_picture like", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureNotLike(String value) {
            addCriterion("seat_picture not like", value, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureIn(List<String> values) {
            addCriterion("seat_picture in", values, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureNotIn(List<String> values) {
            addCriterion("seat_picture not in", values, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureBetween(String value1, String value2) {
            addCriterion("seat_picture between", value1, value2, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatPictureNotBetween(String value1, String value2) {
            addCriterion("seat_picture not between", value1, value2, "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatColorIsNull() {
            addCriterion("seat_color is null");
            return (Criteria) this;
        }

        public Criteria andSeatColorIsNotNull() {
            addCriterion("seat_color is not null");
            return (Criteria) this;
        }

        public Criteria andSeatColorEqualTo(String value) {
            addCriterion("seat_color =", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorNotEqualTo(String value) {
            addCriterion("seat_color <>", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorGreaterThan(String value) {
            addCriterion("seat_color >", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorGreaterThanOrEqualTo(String value) {
            addCriterion("seat_color >=", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorLessThan(String value) {
            addCriterion("seat_color <", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorLessThanOrEqualTo(String value) {
            addCriterion("seat_color <=", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorLike(String value) {
            addCriterion("seat_color like", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorNotLike(String value) {
            addCriterion("seat_color not like", value, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorIn(List<String> values) {
            addCriterion("seat_color in", values, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorNotIn(List<String> values) {
            addCriterion("seat_color not in", values, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorBetween(String value1, String value2) {
            addCriterion("seat_color between", value1, value2, "seatColor");
            return (Criteria) this;
        }

        public Criteria andSeatColorNotBetween(String value1, String value2) {
            addCriterion("seat_color not between", value1, value2, "seatColor");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessIsNull() {
            addCriterion("ticket_business is null");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessIsNotNull() {
            addCriterion("ticket_business is not null");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessEqualTo(String value) {
            addCriterion("ticket_business =", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessNotEqualTo(String value) {
            addCriterion("ticket_business <>", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessGreaterThan(String value) {
            addCriterion("ticket_business >", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_business >=", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessLessThan(String value) {
            addCriterion("ticket_business <", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessLessThanOrEqualTo(String value) {
            addCriterion("ticket_business <=", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessLike(String value) {
            addCriterion("ticket_business like", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessNotLike(String value) {
            addCriterion("ticket_business not like", value, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessIn(List<String> values) {
            addCriterion("ticket_business in", values, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessNotIn(List<String> values) {
            addCriterion("ticket_business not in", values, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessBetween(String value1, String value2) {
            addCriterion("ticket_business between", value1, value2, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessNotBetween(String value1, String value2) {
            addCriterion("ticket_business not between", value1, value2, "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andSeatTextIsNull() {
            addCriterion("seat_text is null");
            return (Criteria) this;
        }

        public Criteria andSeatTextIsNotNull() {
            addCriterion("seat_text is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTextEqualTo(String value) {
            addCriterion("seat_text =", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextNotEqualTo(String value) {
            addCriterion("seat_text <>", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextGreaterThan(String value) {
            addCriterion("seat_text >", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextGreaterThanOrEqualTo(String value) {
            addCriterion("seat_text >=", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextLessThan(String value) {
            addCriterion("seat_text <", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextLessThanOrEqualTo(String value) {
            addCriterion("seat_text <=", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextLike(String value) {
            addCriterion("seat_text like", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextNotLike(String value) {
            addCriterion("seat_text not like", value, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextIn(List<String> values) {
            addCriterion("seat_text in", values, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextNotIn(List<String> values) {
            addCriterion("seat_text not in", values, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextBetween(String value1, String value2) {
            addCriterion("seat_text between", value1, value2, "seatText");
            return (Criteria) this;
        }

        public Criteria andSeatTextNotBetween(String value1, String value2) {
            addCriterion("seat_text not between", value1, value2, "seatText");
            return (Criteria) this;
        }

        public Criteria andSumNumberIsNull() {
            addCriterion("sum_number is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberIsNotNull() {
            addCriterion("sum_number is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberEqualTo(Integer value) {
            addCriterion("sum_number =", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotEqualTo(Integer value) {
            addCriterion("sum_number <>", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberGreaterThan(Integer value) {
            addCriterion("sum_number >", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_number >=", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberLessThan(Integer value) {
            addCriterion("sum_number <", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sum_number <=", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberIn(List<Integer> values) {
            addCriterion("sum_number in", values, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotIn(List<Integer> values) {
            addCriterion("sum_number not in", values, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberBetween(Integer value1, Integer value2) {
            addCriterion("sum_number between", value1, value2, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_number not between", value1, value2, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoIsNull() {
            addCriterion("banquet_logo is null");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoIsNotNull() {
            addCriterion("banquet_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoEqualTo(String value) {
            addCriterion("banquet_logo =", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoNotEqualTo(String value) {
            addCriterion("banquet_logo <>", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoGreaterThan(String value) {
            addCriterion("banquet_logo >", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoGreaterThanOrEqualTo(String value) {
            addCriterion("banquet_logo >=", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoLessThan(String value) {
            addCriterion("banquet_logo <", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoLessThanOrEqualTo(String value) {
            addCriterion("banquet_logo <=", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoLike(String value) {
            addCriterion("banquet_logo like", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoNotLike(String value) {
            addCriterion("banquet_logo not like", value, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoIn(List<String> values) {
            addCriterion("banquet_logo in", values, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoNotIn(List<String> values) {
            addCriterion("banquet_logo not in", values, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoBetween(String value1, String value2) {
            addCriterion("banquet_logo between", value1, value2, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoNotBetween(String value1, String value2) {
            addCriterion("banquet_logo not between", value1, value2, "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
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

        public Criteria andGoodsNameStyleLikeInsensitive(String value) {
            addCriterion("upper(goods_name_style) like", value.toUpperCase(), "goodsNameStyle");
            return (Criteria) this;
        }

        public Criteria andProviderNameLikeInsensitive(String value) {
            addCriterion("upper(provider_name) like", value.toUpperCase(), "providerName");
            return (Criteria) this;
        }

        public Criteria andKeywordsLikeInsensitive(String value) {
            addCriterion("upper(keywords) like", value.toUpperCase(), "keywords");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLikeInsensitive(String value) {
            addCriterion("upper(goods_brief) like", value.toUpperCase(), "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLikeInsensitive(String value) {
            addCriterion("upper(goods_thumb) like", value.toUpperCase(), "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLikeInsensitive(String value) {
            addCriterion("upper(goods_img) like", value.toUpperCase(), "goodsImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLikeInsensitive(String value) {
            addCriterion("upper(original_img) like", value.toUpperCase(), "originalImg");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLikeInsensitive(String value) {
            addCriterion("upper(extension_code) like", value.toUpperCase(), "extensionCode");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLikeInsensitive(String value) {
            addCriterion("upper(seller_note) like", value.toUpperCase(), "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSeatLogoLikeInsensitive(String value) {
            addCriterion("upper(seat_logo) like", value.toUpperCase(), "seatLogo");
            return (Criteria) this;
        }

        public Criteria andSeatPictureLikeInsensitive(String value) {
            addCriterion("upper(seat_picture) like", value.toUpperCase(), "seatPicture");
            return (Criteria) this;
        }

        public Criteria andSeatColorLikeInsensitive(String value) {
            addCriterion("upper(seat_color) like", value.toUpperCase(), "seatColor");
            return (Criteria) this;
        }

        public Criteria andTicketBusinessLikeInsensitive(String value) {
            addCriterion("upper(ticket_business) like", value.toUpperCase(), "ticketBusiness");
            return (Criteria) this;
        }

        public Criteria andSeatTextLikeInsensitive(String value) {
            addCriterion("upper(seat_text) like", value.toUpperCase(), "seatText");
            return (Criteria) this;
        }

        public Criteria andBanquetLogoLikeInsensitive(String value) {
            addCriterion("upper(banquet_logo) like", value.toUpperCase(), "banquetLogo");
            return (Criteria) this;
        }

        public Criteria andRankLikeInsensitive(String value) {
            addCriterion("upper(rank) like", value.toUpperCase(), "rank");
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