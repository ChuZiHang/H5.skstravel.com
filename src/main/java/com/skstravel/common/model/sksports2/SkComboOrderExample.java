package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkComboOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkComboOrderExample() {
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

        public Criteria andComboOrderIdIsNull() {
            addCriterion("combo_order_id is null");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdIsNotNull() {
            addCriterion("combo_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdEqualTo(Integer value) {
            addCriterion("combo_order_id =", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdNotEqualTo(Integer value) {
            addCriterion("combo_order_id <>", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdGreaterThan(Integer value) {
            addCriterion("combo_order_id >", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_order_id >=", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdLessThan(Integer value) {
            addCriterion("combo_order_id <", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_order_id <=", value, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdIn(List<Integer> values) {
            addCriterion("combo_order_id in", values, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdNotIn(List<Integer> values) {
            addCriterion("combo_order_id not in", values, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_order_id between", value1, value2, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_order_id not between", value1, value2, "comboOrderId");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameIsNull() {
            addCriterion("combo_order_name is null");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameIsNotNull() {
            addCriterion("combo_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameEqualTo(String value) {
            addCriterion("combo_order_name =", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameNotEqualTo(String value) {
            addCriterion("combo_order_name <>", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameGreaterThan(String value) {
            addCriterion("combo_order_name >", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("combo_order_name >=", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameLessThan(String value) {
            addCriterion("combo_order_name <", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameLessThanOrEqualTo(String value) {
            addCriterion("combo_order_name <=", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameLike(String value) {
            addCriterion("combo_order_name like", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameNotLike(String value) {
            addCriterion("combo_order_name not like", value, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameIn(List<String> values) {
            addCriterion("combo_order_name in", values, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameNotIn(List<String> values) {
            addCriterion("combo_order_name not in", values, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameBetween(String value1, String value2) {
            addCriterion("combo_order_name between", value1, value2, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderNameNotBetween(String value1, String value2) {
            addCriterion("combo_order_name not between", value1, value2, "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileIsNull() {
            addCriterion("combo_order_mobile is null");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileIsNotNull() {
            addCriterion("combo_order_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileEqualTo(String value) {
            addCriterion("combo_order_mobile =", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileNotEqualTo(String value) {
            addCriterion("combo_order_mobile <>", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileGreaterThan(String value) {
            addCriterion("combo_order_mobile >", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("combo_order_mobile >=", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileLessThan(String value) {
            addCriterion("combo_order_mobile <", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileLessThanOrEqualTo(String value) {
            addCriterion("combo_order_mobile <=", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileLike(String value) {
            addCriterion("combo_order_mobile like", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileNotLike(String value) {
            addCriterion("combo_order_mobile not like", value, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileIn(List<String> values) {
            addCriterion("combo_order_mobile in", values, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileNotIn(List<String> values) {
            addCriterion("combo_order_mobile not in", values, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileBetween(String value1, String value2) {
            addCriterion("combo_order_mobile between", value1, value2, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileNotBetween(String value1, String value2) {
            addCriterion("combo_order_mobile not between", value1, value2, "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailIsNull() {
            addCriterion("combo_order_email is null");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailIsNotNull() {
            addCriterion("combo_order_email is not null");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailEqualTo(String value) {
            addCriterion("combo_order_email =", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailNotEqualTo(String value) {
            addCriterion("combo_order_email <>", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailGreaterThan(String value) {
            addCriterion("combo_order_email >", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailGreaterThanOrEqualTo(String value) {
            addCriterion("combo_order_email >=", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailLessThan(String value) {
            addCriterion("combo_order_email <", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailLessThanOrEqualTo(String value) {
            addCriterion("combo_order_email <=", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailLike(String value) {
            addCriterion("combo_order_email like", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailNotLike(String value) {
            addCriterion("combo_order_email not like", value, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailIn(List<String> values) {
            addCriterion("combo_order_email in", values, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailNotIn(List<String> values) {
            addCriterion("combo_order_email not in", values, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailBetween(String value1, String value2) {
            addCriterion("combo_order_email between", value1, value2, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailNotBetween(String value1, String value2) {
            addCriterion("combo_order_email not between", value1, value2, "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardIsNull() {
            addCriterion("combo_order_card is null");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardIsNotNull() {
            addCriterion("combo_order_card is not null");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardEqualTo(String value) {
            addCriterion("combo_order_card =", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardNotEqualTo(String value) {
            addCriterion("combo_order_card <>", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardGreaterThan(String value) {
            addCriterion("combo_order_card >", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardGreaterThanOrEqualTo(String value) {
            addCriterion("combo_order_card >=", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardLessThan(String value) {
            addCriterion("combo_order_card <", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardLessThanOrEqualTo(String value) {
            addCriterion("combo_order_card <=", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardLike(String value) {
            addCriterion("combo_order_card like", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardNotLike(String value) {
            addCriterion("combo_order_card not like", value, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardIn(List<String> values) {
            addCriterion("combo_order_card in", values, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardNotIn(List<String> values) {
            addCriterion("combo_order_card not in", values, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardBetween(String value1, String value2) {
            addCriterion("combo_order_card between", value1, value2, "comboOrderCard");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardNotBetween(String value1, String value2) {
            addCriterion("combo_order_card not between", value1, value2, "comboOrderCard");
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

        public Criteria andComboOrderNameLikeInsensitive(String value) {
            addCriterion("upper(combo_order_name) like", value.toUpperCase(), "comboOrderName");
            return (Criteria) this;
        }

        public Criteria andComboOrderMobileLikeInsensitive(String value) {
            addCriterion("upper(combo_order_mobile) like", value.toUpperCase(), "comboOrderMobile");
            return (Criteria) this;
        }

        public Criteria andComboOrderEmailLikeInsensitive(String value) {
            addCriterion("upper(combo_order_email) like", value.toUpperCase(), "comboOrderEmail");
            return (Criteria) this;
        }

        public Criteria andComboOrderCardLikeInsensitive(String value) {
            addCriterion("upper(combo_order_card) like", value.toUpperCase(), "comboOrderCard");
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