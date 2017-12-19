package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkUserRankExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkUserRankExample() {
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

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Byte value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Byte value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Byte value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Byte value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Byte value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Byte> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Byte> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Byte value1, Byte value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Byte value1, Byte value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNull() {
            addCriterion("rank_name is null");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNotNull() {
            addCriterion("rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRankNameEqualTo(String value) {
            addCriterion("rank_name =", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotEqualTo(String value) {
            addCriterion("rank_name <>", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThan(String value) {
            addCriterion("rank_name >", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThanOrEqualTo(String value) {
            addCriterion("rank_name >=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThan(String value) {
            addCriterion("rank_name <", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThanOrEqualTo(String value) {
            addCriterion("rank_name <=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLike(String value) {
            addCriterion("rank_name like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotLike(String value) {
            addCriterion("rank_name not like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameIn(List<String> values) {
            addCriterion("rank_name in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotIn(List<String> values) {
            addCriterion("rank_name not in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameBetween(String value1, String value2) {
            addCriterion("rank_name between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotBetween(String value1, String value2) {
            addCriterion("rank_name not between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andMinPointsIsNull() {
            addCriterion("min_points is null");
            return (Criteria) this;
        }

        public Criteria andMinPointsIsNotNull() {
            addCriterion("min_points is not null");
            return (Criteria) this;
        }

        public Criteria andMinPointsEqualTo(Integer value) {
            addCriterion("min_points =", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsNotEqualTo(Integer value) {
            addCriterion("min_points <>", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsGreaterThan(Integer value) {
            addCriterion("min_points >", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_points >=", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsLessThan(Integer value) {
            addCriterion("min_points <", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsLessThanOrEqualTo(Integer value) {
            addCriterion("min_points <=", value, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsIn(List<Integer> values) {
            addCriterion("min_points in", values, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsNotIn(List<Integer> values) {
            addCriterion("min_points not in", values, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsBetween(Integer value1, Integer value2) {
            addCriterion("min_points between", value1, value2, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMinPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("min_points not between", value1, value2, "minPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsIsNull() {
            addCriterion("max_points is null");
            return (Criteria) this;
        }

        public Criteria andMaxPointsIsNotNull() {
            addCriterion("max_points is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPointsEqualTo(Integer value) {
            addCriterion("max_points =", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsNotEqualTo(Integer value) {
            addCriterion("max_points <>", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsGreaterThan(Integer value) {
            addCriterion("max_points >", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_points >=", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsLessThan(Integer value) {
            addCriterion("max_points <", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsLessThanOrEqualTo(Integer value) {
            addCriterion("max_points <=", value, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsIn(List<Integer> values) {
            addCriterion("max_points in", values, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsNotIn(List<Integer> values) {
            addCriterion("max_points not in", values, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsBetween(Integer value1, Integer value2) {
            addCriterion("max_points between", value1, value2, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andMaxPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_points not between", value1, value2, "maxPoints");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Byte value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Byte value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Byte value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Byte value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Byte value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Byte value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Byte> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Byte> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Byte value1, Byte value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Byte value1, Byte value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andShowPriceIsNull() {
            addCriterion("show_price is null");
            return (Criteria) this;
        }

        public Criteria andShowPriceIsNotNull() {
            addCriterion("show_price is not null");
            return (Criteria) this;
        }

        public Criteria andShowPriceEqualTo(Boolean value) {
            addCriterion("show_price =", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotEqualTo(Boolean value) {
            addCriterion("show_price <>", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceGreaterThan(Boolean value) {
            addCriterion("show_price >", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_price >=", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceLessThan(Boolean value) {
            addCriterion("show_price <", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("show_price <=", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceIn(List<Boolean> values) {
            addCriterion("show_price in", values, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotIn(List<Boolean> values) {
            addCriterion("show_price not in", values, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("show_price between", value1, value2, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_price not between", value1, value2, "showPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialRankIsNull() {
            addCriterion("special_rank is null");
            return (Criteria) this;
        }

        public Criteria andSpecialRankIsNotNull() {
            addCriterion("special_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialRankEqualTo(Boolean value) {
            addCriterion("special_rank =", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankNotEqualTo(Boolean value) {
            addCriterion("special_rank <>", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankGreaterThan(Boolean value) {
            addCriterion("special_rank >", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankGreaterThanOrEqualTo(Boolean value) {
            addCriterion("special_rank >=", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankLessThan(Boolean value) {
            addCriterion("special_rank <", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankLessThanOrEqualTo(Boolean value) {
            addCriterion("special_rank <=", value, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankIn(List<Boolean> values) {
            addCriterion("special_rank in", values, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankNotIn(List<Boolean> values) {
            addCriterion("special_rank not in", values, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankBetween(Boolean value1, Boolean value2) {
            addCriterion("special_rank between", value1, value2, "specialRank");
            return (Criteria) this;
        }

        public Criteria andSpecialRankNotBetween(Boolean value1, Boolean value2) {
            addCriterion("special_rank not between", value1, value2, "specialRank");
            return (Criteria) this;
        }

        public Criteria andRankNameLikeInsensitive(String value) {
            addCriterion("upper(rank_name) like", value.toUpperCase(), "rankName");
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