package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkComboPitchExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkComboPitchExample() {
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

        public Criteria andComboPitchIdIsNull() {
            addCriterion("combo_pitch_id is null");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdIsNotNull() {
            addCriterion("combo_pitch_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdEqualTo(Integer value) {
            addCriterion("combo_pitch_id =", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdNotEqualTo(Integer value) {
            addCriterion("combo_pitch_id <>", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdGreaterThan(Integer value) {
            addCriterion("combo_pitch_id >", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_pitch_id >=", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdLessThan(Integer value) {
            addCriterion("combo_pitch_id <", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_pitch_id <=", value, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdIn(List<Integer> values) {
            addCriterion("combo_pitch_id in", values, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdNotIn(List<Integer> values) {
            addCriterion("combo_pitch_id not in", values, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_pitch_id between", value1, value2, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_pitch_id not between", value1, value2, "comboPitchId");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameIsNull() {
            addCriterion("combo_pitch_name is null");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameIsNotNull() {
            addCriterion("combo_pitch_name is not null");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameEqualTo(String value) {
            addCriterion("combo_pitch_name =", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameNotEqualTo(String value) {
            addCriterion("combo_pitch_name <>", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameGreaterThan(String value) {
            addCriterion("combo_pitch_name >", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameGreaterThanOrEqualTo(String value) {
            addCriterion("combo_pitch_name >=", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameLessThan(String value) {
            addCriterion("combo_pitch_name <", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameLessThanOrEqualTo(String value) {
            addCriterion("combo_pitch_name <=", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameLike(String value) {
            addCriterion("combo_pitch_name like", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameNotLike(String value) {
            addCriterion("combo_pitch_name not like", value, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameIn(List<String> values) {
            addCriterion("combo_pitch_name in", values, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameNotIn(List<String> values) {
            addCriterion("combo_pitch_name not in", values, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameBetween(String value1, String value2) {
            addCriterion("combo_pitch_name between", value1, value2, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameNotBetween(String value1, String value2) {
            addCriterion("combo_pitch_name not between", value1, value2, "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainIsNull() {
            addCriterion("combo_pitch_contain is null");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainIsNotNull() {
            addCriterion("combo_pitch_contain is not null");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainEqualTo(String value) {
            addCriterion("combo_pitch_contain =", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainNotEqualTo(String value) {
            addCriterion("combo_pitch_contain <>", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainGreaterThan(String value) {
            addCriterion("combo_pitch_contain >", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainGreaterThanOrEqualTo(String value) {
            addCriterion("combo_pitch_contain >=", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainLessThan(String value) {
            addCriterion("combo_pitch_contain <", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainLessThanOrEqualTo(String value) {
            addCriterion("combo_pitch_contain <=", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainLike(String value) {
            addCriterion("combo_pitch_contain like", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainNotLike(String value) {
            addCriterion("combo_pitch_contain not like", value, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainIn(List<String> values) {
            addCriterion("combo_pitch_contain in", values, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainNotIn(List<String> values) {
            addCriterion("combo_pitch_contain not in", values, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainBetween(String value1, String value2) {
            addCriterion("combo_pitch_contain between", value1, value2, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainNotBetween(String value1, String value2) {
            addCriterion("combo_pitch_contain not between", value1, value2, "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgIsNull() {
            addCriterion("combo_pitch_img is null");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgIsNotNull() {
            addCriterion("combo_pitch_img is not null");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgEqualTo(String value) {
            addCriterion("combo_pitch_img =", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgNotEqualTo(String value) {
            addCriterion("combo_pitch_img <>", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgGreaterThan(String value) {
            addCriterion("combo_pitch_img >", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgGreaterThanOrEqualTo(String value) {
            addCriterion("combo_pitch_img >=", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgLessThan(String value) {
            addCriterion("combo_pitch_img <", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgLessThanOrEqualTo(String value) {
            addCriterion("combo_pitch_img <=", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgLike(String value) {
            addCriterion("combo_pitch_img like", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgNotLike(String value) {
            addCriterion("combo_pitch_img not like", value, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgIn(List<String> values) {
            addCriterion("combo_pitch_img in", values, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgNotIn(List<String> values) {
            addCriterion("combo_pitch_img not in", values, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgBetween(String value1, String value2) {
            addCriterion("combo_pitch_img between", value1, value2, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgNotBetween(String value1, String value2) {
            addCriterion("combo_pitch_img not between", value1, value2, "comboPitchImg");
            return (Criteria) this;
        }

        public Criteria andComboPitchNameLikeInsensitive(String value) {
            addCriterion("upper(combo_pitch_name) like", value.toUpperCase(), "comboPitchName");
            return (Criteria) this;
        }

        public Criteria andComboPitchContainLikeInsensitive(String value) {
            addCriterion("upper(combo_pitch_contain) like", value.toUpperCase(), "comboPitchContain");
            return (Criteria) this;
        }

        public Criteria andComboPitchImgLikeInsensitive(String value) {
            addCriterion("upper(combo_pitch_img) like", value.toUpperCase(), "comboPitchImg");
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