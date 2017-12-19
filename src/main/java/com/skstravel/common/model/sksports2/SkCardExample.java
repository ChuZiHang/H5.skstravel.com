package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkCardExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkCardExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Byte value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Byte value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Byte value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Byte value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Byte value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Byte> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Byte> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Byte value1, Byte value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Byte value1, Byte value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardImgIsNull() {
            addCriterion("card_img is null");
            return (Criteria) this;
        }

        public Criteria andCardImgIsNotNull() {
            addCriterion("card_img is not null");
            return (Criteria) this;
        }

        public Criteria andCardImgEqualTo(String value) {
            addCriterion("card_img =", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotEqualTo(String value) {
            addCriterion("card_img <>", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgGreaterThan(String value) {
            addCriterion("card_img >", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgGreaterThanOrEqualTo(String value) {
            addCriterion("card_img >=", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLessThan(String value) {
            addCriterion("card_img <", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLessThanOrEqualTo(String value) {
            addCriterion("card_img <=", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLike(String value) {
            addCriterion("card_img like", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotLike(String value) {
            addCriterion("card_img not like", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgIn(List<String> values) {
            addCriterion("card_img in", values, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotIn(List<String> values) {
            addCriterion("card_img not in", values, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgBetween(String value1, String value2) {
            addCriterion("card_img between", value1, value2, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotBetween(String value1, String value2) {
            addCriterion("card_img not between", value1, value2, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNull() {
            addCriterion("card_fee is null");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNotNull() {
            addCriterion("card_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCardFeeEqualTo(BigDecimal value) {
            addCriterion("card_fee =", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotEqualTo(BigDecimal value) {
            addCriterion("card_fee <>", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThan(BigDecimal value) {
            addCriterion("card_fee >", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee >=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThan(BigDecimal value) {
            addCriterion("card_fee <", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee <=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeIn(List<BigDecimal> values) {
            addCriterion("card_fee in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotIn(List<BigDecimal> values) {
            addCriterion("card_fee not in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee not between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyIsNull() {
            addCriterion("free_money is null");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyIsNotNull() {
            addCriterion("free_money is not null");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyEqualTo(BigDecimal value) {
            addCriterion("free_money =", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("free_money <>", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyGreaterThan(BigDecimal value) {
            addCriterion("free_money >", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_money >=", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyLessThan(BigDecimal value) {
            addCriterion("free_money <", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_money <=", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyIn(List<BigDecimal> values) {
            addCriterion("free_money in", values, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("free_money not in", values, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_money between", value1, value2, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_money not between", value1, value2, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andCardDescIsNull() {
            addCriterion("card_desc is null");
            return (Criteria) this;
        }

        public Criteria andCardDescIsNotNull() {
            addCriterion("card_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCardDescEqualTo(String value) {
            addCriterion("card_desc =", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescNotEqualTo(String value) {
            addCriterion("card_desc <>", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescGreaterThan(String value) {
            addCriterion("card_desc >", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescGreaterThanOrEqualTo(String value) {
            addCriterion("card_desc >=", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescLessThan(String value) {
            addCriterion("card_desc <", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescLessThanOrEqualTo(String value) {
            addCriterion("card_desc <=", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescLike(String value) {
            addCriterion("card_desc like", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescNotLike(String value) {
            addCriterion("card_desc not like", value, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescIn(List<String> values) {
            addCriterion("card_desc in", values, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescNotIn(List<String> values) {
            addCriterion("card_desc not in", values, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescBetween(String value1, String value2) {
            addCriterion("card_desc between", value1, value2, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardDescNotBetween(String value1, String value2) {
            addCriterion("card_desc not between", value1, value2, "cardDesc");
            return (Criteria) this;
        }

        public Criteria andCardNameLikeInsensitive(String value) {
            addCriterion("upper(card_name) like", value.toUpperCase(), "cardName");
            return (Criteria) this;
        }

        public Criteria andCardImgLikeInsensitive(String value) {
            addCriterion("upper(card_img) like", value.toUpperCase(), "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardDescLikeInsensitive(String value) {
            addCriterion("upper(card_desc) like", value.toUpperCase(), "cardDesc");
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