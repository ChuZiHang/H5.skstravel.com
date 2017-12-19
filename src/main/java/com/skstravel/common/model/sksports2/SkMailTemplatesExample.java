package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkMailTemplatesExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkMailTemplatesExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Boolean value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Boolean value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Boolean value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Boolean value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Boolean value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Boolean> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Boolean> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Boolean value1, Boolean value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNull() {
            addCriterion("template_code is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNotNull() {
            addCriterion("template_code is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeEqualTo(String value) {
            addCriterion("template_code =", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotEqualTo(String value) {
            addCriterion("template_code <>", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThan(String value) {
            addCriterion("template_code >", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("template_code >=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThan(String value) {
            addCriterion("template_code <", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("template_code <=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLike(String value) {
            addCriterion("template_code like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotLike(String value) {
            addCriterion("template_code not like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIn(List<String> values) {
            addCriterion("template_code in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotIn(List<String> values) {
            addCriterion("template_code not in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeBetween(String value1, String value2) {
            addCriterion("template_code between", value1, value2, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("template_code not between", value1, value2, "templateCode");
            return (Criteria) this;
        }

        public Criteria andIsHtmlIsNull() {
            addCriterion("is_html is null");
            return (Criteria) this;
        }

        public Criteria andIsHtmlIsNotNull() {
            addCriterion("is_html is not null");
            return (Criteria) this;
        }

        public Criteria andIsHtmlEqualTo(Boolean value) {
            addCriterion("is_html =", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlNotEqualTo(Boolean value) {
            addCriterion("is_html <>", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlGreaterThan(Boolean value) {
            addCriterion("is_html >", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_html >=", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlLessThan(Boolean value) {
            addCriterion("is_html <", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlLessThanOrEqualTo(Boolean value) {
            addCriterion("is_html <=", value, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlIn(List<Boolean> values) {
            addCriterion("is_html in", values, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlNotIn(List<Boolean> values) {
            addCriterion("is_html not in", values, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlBetween(Boolean value1, Boolean value2) {
            addCriterion("is_html between", value1, value2, "isHtml");
            return (Criteria) this;
        }

        public Criteria andIsHtmlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_html not between", value1, value2, "isHtml");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectIsNull() {
            addCriterion("template_subject is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectIsNotNull() {
            addCriterion("template_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectEqualTo(String value) {
            addCriterion("template_subject =", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectNotEqualTo(String value) {
            addCriterion("template_subject <>", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectGreaterThan(String value) {
            addCriterion("template_subject >", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("template_subject >=", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectLessThan(String value) {
            addCriterion("template_subject <", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectLessThanOrEqualTo(String value) {
            addCriterion("template_subject <=", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectLike(String value) {
            addCriterion("template_subject like", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectNotLike(String value) {
            addCriterion("template_subject not like", value, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectIn(List<String> values) {
            addCriterion("template_subject in", values, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectNotIn(List<String> values) {
            addCriterion("template_subject not in", values, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectBetween(String value1, String value2) {
            addCriterion("template_subject between", value1, value2, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectNotBetween(String value1, String value2) {
            addCriterion("template_subject not between", value1, value2, "templateSubject");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyEqualTo(Integer value) {
            addCriterion("last_modify =", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotEqualTo(Integer value) {
            addCriterion("last_modify <>", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThan(Integer value) {
            addCriterion("last_modify >", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_modify >=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThan(Integer value) {
            addCriterion("last_modify <", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThanOrEqualTo(Integer value) {
            addCriterion("last_modify <=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyIn(List<Integer> values) {
            addCriterion("last_modify in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotIn(List<Integer> values) {
            addCriterion("last_modify not in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyBetween(Integer value1, Integer value2) {
            addCriterion("last_modify between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("last_modify not between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastSendIsNull() {
            addCriterion("last_send is null");
            return (Criteria) this;
        }

        public Criteria andLastSendIsNotNull() {
            addCriterion("last_send is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendEqualTo(Integer value) {
            addCriterion("last_send =", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendNotEqualTo(Integer value) {
            addCriterion("last_send <>", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendGreaterThan(Integer value) {
            addCriterion("last_send >", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_send >=", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendLessThan(Integer value) {
            addCriterion("last_send <", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendLessThanOrEqualTo(Integer value) {
            addCriterion("last_send <=", value, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendIn(List<Integer> values) {
            addCriterion("last_send in", values, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendNotIn(List<Integer> values) {
            addCriterion("last_send not in", values, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendBetween(Integer value1, Integer value2) {
            addCriterion("last_send between", value1, value2, "lastSend");
            return (Criteria) this;
        }

        public Criteria andLastSendNotBetween(Integer value1, Integer value2) {
            addCriterion("last_send not between", value1, value2, "lastSend");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLikeInsensitive(String value) {
            addCriterion("upper(template_code) like", value.toUpperCase(), "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateSubjectLikeInsensitive(String value) {
            addCriterion("upper(template_subject) like", value.toUpperCase(), "templateSubject");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
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