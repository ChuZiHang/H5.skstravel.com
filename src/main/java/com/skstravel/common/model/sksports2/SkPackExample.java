package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkPackExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkPackExample() {
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

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Byte value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Byte value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Byte value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Byte value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Byte value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Byte> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Byte> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Byte value1, Byte value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNull() {
            addCriterion("pack_name is null");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNotNull() {
            addCriterion("pack_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackNameEqualTo(String value) {
            addCriterion("pack_name =", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotEqualTo(String value) {
            addCriterion("pack_name <>", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThan(String value) {
            addCriterion("pack_name >", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThanOrEqualTo(String value) {
            addCriterion("pack_name >=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThan(String value) {
            addCriterion("pack_name <", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThanOrEqualTo(String value) {
            addCriterion("pack_name <=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLike(String value) {
            addCriterion("pack_name like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotLike(String value) {
            addCriterion("pack_name not like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameIn(List<String> values) {
            addCriterion("pack_name in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotIn(List<String> values) {
            addCriterion("pack_name not in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameBetween(String value1, String value2) {
            addCriterion("pack_name between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotBetween(String value1, String value2) {
            addCriterion("pack_name not between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andPackImgIsNull() {
            addCriterion("pack_img is null");
            return (Criteria) this;
        }

        public Criteria andPackImgIsNotNull() {
            addCriterion("pack_img is not null");
            return (Criteria) this;
        }

        public Criteria andPackImgEqualTo(String value) {
            addCriterion("pack_img =", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgNotEqualTo(String value) {
            addCriterion("pack_img <>", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgGreaterThan(String value) {
            addCriterion("pack_img >", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgGreaterThanOrEqualTo(String value) {
            addCriterion("pack_img >=", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgLessThan(String value) {
            addCriterion("pack_img <", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgLessThanOrEqualTo(String value) {
            addCriterion("pack_img <=", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgLike(String value) {
            addCriterion("pack_img like", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgNotLike(String value) {
            addCriterion("pack_img not like", value, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgIn(List<String> values) {
            addCriterion("pack_img in", values, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgNotIn(List<String> values) {
            addCriterion("pack_img not in", values, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgBetween(String value1, String value2) {
            addCriterion("pack_img between", value1, value2, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackImgNotBetween(String value1, String value2) {
            addCriterion("pack_img not between", value1, value2, "packImg");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNull() {
            addCriterion("pack_fee is null");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNotNull() {
            addCriterion("pack_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPackFeeEqualTo(BigDecimal value) {
            addCriterion("pack_fee =", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotEqualTo(BigDecimal value) {
            addCriterion("pack_fee <>", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThan(BigDecimal value) {
            addCriterion("pack_fee >", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee >=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThan(BigDecimal value) {
            addCriterion("pack_fee <", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee <=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeIn(List<BigDecimal> values) {
            addCriterion("pack_fee in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotIn(List<BigDecimal> values) {
            addCriterion("pack_fee not in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee between", value1, value2, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee not between", value1, value2, "packFee");
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

        public Criteria andFreeMoneyEqualTo(Short value) {
            addCriterion("free_money =", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotEqualTo(Short value) {
            addCriterion("free_money <>", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyGreaterThan(Short value) {
            addCriterion("free_money >", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyGreaterThanOrEqualTo(Short value) {
            addCriterion("free_money >=", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyLessThan(Short value) {
            addCriterion("free_money <", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyLessThanOrEqualTo(Short value) {
            addCriterion("free_money <=", value, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyIn(List<Short> values) {
            addCriterion("free_money in", values, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotIn(List<Short> values) {
            addCriterion("free_money not in", values, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyBetween(Short value1, Short value2) {
            addCriterion("free_money between", value1, value2, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andFreeMoneyNotBetween(Short value1, Short value2) {
            addCriterion("free_money not between", value1, value2, "freeMoney");
            return (Criteria) this;
        }

        public Criteria andPackDescIsNull() {
            addCriterion("pack_desc is null");
            return (Criteria) this;
        }

        public Criteria andPackDescIsNotNull() {
            addCriterion("pack_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPackDescEqualTo(String value) {
            addCriterion("pack_desc =", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescNotEqualTo(String value) {
            addCriterion("pack_desc <>", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescGreaterThan(String value) {
            addCriterion("pack_desc >", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescGreaterThanOrEqualTo(String value) {
            addCriterion("pack_desc >=", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescLessThan(String value) {
            addCriterion("pack_desc <", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescLessThanOrEqualTo(String value) {
            addCriterion("pack_desc <=", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescLike(String value) {
            addCriterion("pack_desc like", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescNotLike(String value) {
            addCriterion("pack_desc not like", value, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescIn(List<String> values) {
            addCriterion("pack_desc in", values, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescNotIn(List<String> values) {
            addCriterion("pack_desc not in", values, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescBetween(String value1, String value2) {
            addCriterion("pack_desc between", value1, value2, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackDescNotBetween(String value1, String value2) {
            addCriterion("pack_desc not between", value1, value2, "packDesc");
            return (Criteria) this;
        }

        public Criteria andPackNameLikeInsensitive(String value) {
            addCriterion("upper(pack_name) like", value.toUpperCase(), "packName");
            return (Criteria) this;
        }

        public Criteria andPackImgLikeInsensitive(String value) {
            addCriterion("upper(pack_img) like", value.toUpperCase(), "packImg");
            return (Criteria) this;
        }

        public Criteria andPackDescLikeInsensitive(String value) {
            addCriterion("upper(pack_desc) like", value.toUpperCase(), "packDesc");
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