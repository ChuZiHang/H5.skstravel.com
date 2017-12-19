package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkRegFieldsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkRegFieldsExample() {
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

        public Criteria andIdEqualTo(Byte value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Byte value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Byte value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Byte value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Byte value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Byte> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Byte> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Byte value1, Byte value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Byte value1, Byte value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameIsNull() {
            addCriterion("reg_field_name is null");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameIsNotNull() {
            addCriterion("reg_field_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameEqualTo(String value) {
            addCriterion("reg_field_name =", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameNotEqualTo(String value) {
            addCriterion("reg_field_name <>", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameGreaterThan(String value) {
            addCriterion("reg_field_name >", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("reg_field_name >=", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameLessThan(String value) {
            addCriterion("reg_field_name <", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameLessThanOrEqualTo(String value) {
            addCriterion("reg_field_name <=", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameLike(String value) {
            addCriterion("reg_field_name like", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameNotLike(String value) {
            addCriterion("reg_field_name not like", value, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameIn(List<String> values) {
            addCriterion("reg_field_name in", values, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameNotIn(List<String> values) {
            addCriterion("reg_field_name not in", values, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameBetween(String value1, String value2) {
            addCriterion("reg_field_name between", value1, value2, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameNotBetween(String value1, String value2) {
            addCriterion("reg_field_name not between", value1, value2, "regFieldName");
            return (Criteria) this;
        }

        public Criteria andDisOrderIsNull() {
            addCriterion("dis_order is null");
            return (Criteria) this;
        }

        public Criteria andDisOrderIsNotNull() {
            addCriterion("dis_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisOrderEqualTo(Byte value) {
            addCriterion("dis_order =", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotEqualTo(Byte value) {
            addCriterion("dis_order <>", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderGreaterThan(Byte value) {
            addCriterion("dis_order >", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("dis_order >=", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderLessThan(Byte value) {
            addCriterion("dis_order <", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderLessThanOrEqualTo(Byte value) {
            addCriterion("dis_order <=", value, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderIn(List<Byte> values) {
            addCriterion("dis_order in", values, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotIn(List<Byte> values) {
            addCriterion("dis_order not in", values, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderBetween(Byte value1, Byte value2) {
            addCriterion("dis_order between", value1, value2, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("dis_order not between", value1, value2, "disOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Boolean value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Boolean value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Boolean value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Boolean value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Boolean value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Boolean> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Boolean> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Boolean value1, Boolean value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("display not between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsNeedIsNull() {
            addCriterion("is_need is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedIsNotNull() {
            addCriterion("is_need is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedEqualTo(Boolean value) {
            addCriterion("is_need =", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedNotEqualTo(Boolean value) {
            addCriterion("is_need <>", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedGreaterThan(Boolean value) {
            addCriterion("is_need >", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_need >=", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedLessThan(Boolean value) {
            addCriterion("is_need <", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_need <=", value, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedIn(List<Boolean> values) {
            addCriterion("is_need in", values, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedNotIn(List<Boolean> values) {
            addCriterion("is_need not in", values, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need between", value1, value2, "isNeed");
            return (Criteria) this;
        }

        public Criteria andIsNeedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need not between", value1, value2, "isNeed");
            return (Criteria) this;
        }

        public Criteria andRegFieldNameLikeInsensitive(String value) {
            addCriterion("upper(reg_field_name) like", value.toUpperCase(), "regFieldName");
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