package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkSetMealOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkSetMealOrderExample() {
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

        public Criteria andSetMealOrderIdIsNull() {
            addCriterion("set_meal_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdIsNotNull() {
            addCriterion("set_meal_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdEqualTo(Integer value) {
            addCriterion("set_meal_order_id =", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdNotEqualTo(Integer value) {
            addCriterion("set_meal_order_id <>", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdGreaterThan(Integer value) {
            addCriterion("set_meal_order_id >", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_meal_order_id >=", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdLessThan(Integer value) {
            addCriterion("set_meal_order_id <", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("set_meal_order_id <=", value, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdIn(List<Integer> values) {
            addCriterion("set_meal_order_id in", values, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdNotIn(List<Integer> values) {
            addCriterion("set_meal_order_id not in", values, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_order_id between", value1, value2, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_order_id not between", value1, value2, "setMealOrderId");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameIsNull() {
            addCriterion("set_meal_order_name is null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameIsNotNull() {
            addCriterion("set_meal_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameEqualTo(String value) {
            addCriterion("set_meal_order_name =", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameNotEqualTo(String value) {
            addCriterion("set_meal_order_name <>", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameGreaterThan(String value) {
            addCriterion("set_meal_order_name >", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_order_name >=", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameLessThan(String value) {
            addCriterion("set_meal_order_name <", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameLessThanOrEqualTo(String value) {
            addCriterion("set_meal_order_name <=", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameLike(String value) {
            addCriterion("set_meal_order_name like", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameNotLike(String value) {
            addCriterion("set_meal_order_name not like", value, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameIn(List<String> values) {
            addCriterion("set_meal_order_name in", values, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameNotIn(List<String> values) {
            addCriterion("set_meal_order_name not in", values, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameBetween(String value1, String value2) {
            addCriterion("set_meal_order_name between", value1, value2, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameNotBetween(String value1, String value2) {
            addCriterion("set_meal_order_name not between", value1, value2, "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileIsNull() {
            addCriterion("set_meal_order_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileIsNotNull() {
            addCriterion("set_meal_order_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileEqualTo(String value) {
            addCriterion("set_meal_order_mobile =", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileNotEqualTo(String value) {
            addCriterion("set_meal_order_mobile <>", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileGreaterThan(String value) {
            addCriterion("set_meal_order_mobile >", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_order_mobile >=", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileLessThan(String value) {
            addCriterion("set_meal_order_mobile <", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileLessThanOrEqualTo(String value) {
            addCriterion("set_meal_order_mobile <=", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileLike(String value) {
            addCriterion("set_meal_order_mobile like", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileNotLike(String value) {
            addCriterion("set_meal_order_mobile not like", value, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileIn(List<String> values) {
            addCriterion("set_meal_order_mobile in", values, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileNotIn(List<String> values) {
            addCriterion("set_meal_order_mobile not in", values, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileBetween(String value1, String value2) {
            addCriterion("set_meal_order_mobile between", value1, value2, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileNotBetween(String value1, String value2) {
            addCriterion("set_meal_order_mobile not between", value1, value2, "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailIsNull() {
            addCriterion("set_meal_order_email is null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailIsNotNull() {
            addCriterion("set_meal_order_email is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailEqualTo(String value) {
            addCriterion("set_meal_order_email =", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailNotEqualTo(String value) {
            addCriterion("set_meal_order_email <>", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailGreaterThan(String value) {
            addCriterion("set_meal_order_email >", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_order_email >=", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailLessThan(String value) {
            addCriterion("set_meal_order_email <", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailLessThanOrEqualTo(String value) {
            addCriterion("set_meal_order_email <=", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailLike(String value) {
            addCriterion("set_meal_order_email like", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailNotLike(String value) {
            addCriterion("set_meal_order_email not like", value, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailIn(List<String> values) {
            addCriterion("set_meal_order_email in", values, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailNotIn(List<String> values) {
            addCriterion("set_meal_order_email not in", values, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailBetween(String value1, String value2) {
            addCriterion("set_meal_order_email between", value1, value2, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailNotBetween(String value1, String value2) {
            addCriterion("set_meal_order_email not between", value1, value2, "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardIsNull() {
            addCriterion("set_meal_order_card is null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardIsNotNull() {
            addCriterion("set_meal_order_card is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardEqualTo(String value) {
            addCriterion("set_meal_order_card =", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardNotEqualTo(String value) {
            addCriterion("set_meal_order_card <>", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardGreaterThan(String value) {
            addCriterion("set_meal_order_card >", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_order_card >=", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardLessThan(String value) {
            addCriterion("set_meal_order_card <", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardLessThanOrEqualTo(String value) {
            addCriterion("set_meal_order_card <=", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardLike(String value) {
            addCriterion("set_meal_order_card like", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardNotLike(String value) {
            addCriterion("set_meal_order_card not like", value, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardIn(List<String> values) {
            addCriterion("set_meal_order_card in", values, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardNotIn(List<String> values) {
            addCriterion("set_meal_order_card not in", values, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardBetween(String value1, String value2) {
            addCriterion("set_meal_order_card between", value1, value2, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardNotBetween(String value1, String value2) {
            addCriterion("set_meal_order_card not between", value1, value2, "setMealOrderCard");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIsNull() {
            addCriterion("set_meal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIsNotNull() {
            addCriterion("set_meal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdEqualTo(Integer value) {
            addCriterion("set_meal_id =", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotEqualTo(Integer value) {
            addCriterion("set_meal_id <>", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThan(Integer value) {
            addCriterion("set_meal_id >", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_meal_id >=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThan(Integer value) {
            addCriterion("set_meal_id <", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThanOrEqualTo(Integer value) {
            addCriterion("set_meal_id <=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIn(List<Integer> values) {
            addCriterion("set_meal_id in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotIn(List<Integer> values) {
            addCriterion("set_meal_id not in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_id between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_id not between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andIsManageIsNull() {
            addCriterion("is_manage is null");
            return (Criteria) this;
        }

        public Criteria andIsManageIsNotNull() {
            addCriterion("is_manage is not null");
            return (Criteria) this;
        }

        public Criteria andIsManageEqualTo(Integer value) {
            addCriterion("is_manage =", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageNotEqualTo(Integer value) {
            addCriterion("is_manage <>", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageGreaterThan(Integer value) {
            addCriterion("is_manage >", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_manage >=", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageLessThan(Integer value) {
            addCriterion("is_manage <", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageLessThanOrEqualTo(Integer value) {
            addCriterion("is_manage <=", value, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageIn(List<Integer> values) {
            addCriterion("is_manage in", values, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageNotIn(List<Integer> values) {
            addCriterion("is_manage not in", values, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageBetween(Integer value1, Integer value2) {
            addCriterion("is_manage between", value1, value2, "isManage");
            return (Criteria) this;
        }

        public Criteria andIsManageNotBetween(Integer value1, Integer value2) {
            addCriterion("is_manage not between", value1, value2, "isManage");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderNameLikeInsensitive(String value) {
            addCriterion("upper(set_meal_order_name) like", value.toUpperCase(), "setMealOrderName");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderMobileLikeInsensitive(String value) {
            addCriterion("upper(set_meal_order_mobile) like", value.toUpperCase(), "setMealOrderMobile");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderEmailLikeInsensitive(String value) {
            addCriterion("upper(set_meal_order_email) like", value.toUpperCase(), "setMealOrderEmail");
            return (Criteria) this;
        }

        public Criteria andSetMealOrderCardLikeInsensitive(String value) {
            addCriterion("upper(set_meal_order_card) like", value.toUpperCase(), "setMealOrderCard");
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