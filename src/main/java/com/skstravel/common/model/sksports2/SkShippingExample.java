package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkShippingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkShippingExample() {
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

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Byte value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Byte value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Byte value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Byte value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Byte> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Byte> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingDescIsNull() {
            addCriterion("shipping_desc is null");
            return (Criteria) this;
        }

        public Criteria andShippingDescIsNotNull() {
            addCriterion("shipping_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShippingDescEqualTo(String value) {
            addCriterion("shipping_desc =", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescNotEqualTo(String value) {
            addCriterion("shipping_desc <>", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescGreaterThan(String value) {
            addCriterion("shipping_desc >", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_desc >=", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescLessThan(String value) {
            addCriterion("shipping_desc <", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescLessThanOrEqualTo(String value) {
            addCriterion("shipping_desc <=", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescLike(String value) {
            addCriterion("shipping_desc like", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescNotLike(String value) {
            addCriterion("shipping_desc not like", value, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescIn(List<String> values) {
            addCriterion("shipping_desc in", values, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescNotIn(List<String> values) {
            addCriterion("shipping_desc not in", values, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescBetween(String value1, String value2) {
            addCriterion("shipping_desc between", value1, value2, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andShippingDescNotBetween(String value1, String value2) {
            addCriterion("shipping_desc not between", value1, value2, "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andInsureIsNull() {
            addCriterion("insure is null");
            return (Criteria) this;
        }

        public Criteria andInsureIsNotNull() {
            addCriterion("insure is not null");
            return (Criteria) this;
        }

        public Criteria andInsureEqualTo(String value) {
            addCriterion("insure =", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotEqualTo(String value) {
            addCriterion("insure <>", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureGreaterThan(String value) {
            addCriterion("insure >", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureGreaterThanOrEqualTo(String value) {
            addCriterion("insure >=", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLessThan(String value) {
            addCriterion("insure <", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLessThanOrEqualTo(String value) {
            addCriterion("insure <=", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLike(String value) {
            addCriterion("insure like", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotLike(String value) {
            addCriterion("insure not like", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureIn(List<String> values) {
            addCriterion("insure in", values, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotIn(List<String> values) {
            addCriterion("insure not in", values, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureBetween(String value1, String value2) {
            addCriterion("insure between", value1, value2, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotBetween(String value1, String value2) {
            addCriterion("insure not between", value1, value2, "insure");
            return (Criteria) this;
        }

        public Criteria andSupportCodIsNull() {
            addCriterion("support_cod is null");
            return (Criteria) this;
        }

        public Criteria andSupportCodIsNotNull() {
            addCriterion("support_cod is not null");
            return (Criteria) this;
        }

        public Criteria andSupportCodEqualTo(Boolean value) {
            addCriterion("support_cod =", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodNotEqualTo(Boolean value) {
            addCriterion("support_cod <>", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodGreaterThan(Boolean value) {
            addCriterion("support_cod >", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodGreaterThanOrEqualTo(Boolean value) {
            addCriterion("support_cod >=", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodLessThan(Boolean value) {
            addCriterion("support_cod <", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodLessThanOrEqualTo(Boolean value) {
            addCriterion("support_cod <=", value, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodIn(List<Boolean> values) {
            addCriterion("support_cod in", values, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodNotIn(List<Boolean> values) {
            addCriterion("support_cod not in", values, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodBetween(Boolean value1, Boolean value2) {
            addCriterion("support_cod between", value1, value2, "supportCod");
            return (Criteria) this;
        }

        public Criteria andSupportCodNotBetween(Boolean value1, Boolean value2) {
            addCriterion("support_cod not between", value1, value2, "supportCod");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andPrintBgIsNull() {
            addCriterion("print_bg is null");
            return (Criteria) this;
        }

        public Criteria andPrintBgIsNotNull() {
            addCriterion("print_bg is not null");
            return (Criteria) this;
        }

        public Criteria andPrintBgEqualTo(String value) {
            addCriterion("print_bg =", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgNotEqualTo(String value) {
            addCriterion("print_bg <>", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgGreaterThan(String value) {
            addCriterion("print_bg >", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgGreaterThanOrEqualTo(String value) {
            addCriterion("print_bg >=", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgLessThan(String value) {
            addCriterion("print_bg <", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgLessThanOrEqualTo(String value) {
            addCriterion("print_bg <=", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgLike(String value) {
            addCriterion("print_bg like", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgNotLike(String value) {
            addCriterion("print_bg not like", value, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgIn(List<String> values) {
            addCriterion("print_bg in", values, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgNotIn(List<String> values) {
            addCriterion("print_bg not in", values, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgBetween(String value1, String value2) {
            addCriterion("print_bg between", value1, value2, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintBgNotBetween(String value1, String value2) {
            addCriterion("print_bg not between", value1, value2, "printBg");
            return (Criteria) this;
        }

        public Criteria andPrintModelIsNull() {
            addCriterion("print_model is null");
            return (Criteria) this;
        }

        public Criteria andPrintModelIsNotNull() {
            addCriterion("print_model is not null");
            return (Criteria) this;
        }

        public Criteria andPrintModelEqualTo(Boolean value) {
            addCriterion("print_model =", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelNotEqualTo(Boolean value) {
            addCriterion("print_model <>", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelGreaterThan(Boolean value) {
            addCriterion("print_model >", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("print_model >=", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelLessThan(Boolean value) {
            addCriterion("print_model <", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelLessThanOrEqualTo(Boolean value) {
            addCriterion("print_model <=", value, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelIn(List<Boolean> values) {
            addCriterion("print_model in", values, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelNotIn(List<Boolean> values) {
            addCriterion("print_model not in", values, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelBetween(Boolean value1, Boolean value2) {
            addCriterion("print_model between", value1, value2, "printModel");
            return (Criteria) this;
        }

        public Criteria andPrintModelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("print_model not between", value1, value2, "printModel");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIsNull() {
            addCriterion("shipping_order is null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIsNotNull() {
            addCriterion("shipping_order is not null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderEqualTo(Byte value) {
            addCriterion("shipping_order =", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderNotEqualTo(Byte value) {
            addCriterion("shipping_order <>", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderGreaterThan(Byte value) {
            addCriterion("shipping_order >", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_order >=", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderLessThan(Byte value) {
            addCriterion("shipping_order <", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_order <=", value, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIn(List<Byte> values) {
            addCriterion("shipping_order in", values, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderNotIn(List<Byte> values) {
            addCriterion("shipping_order not in", values, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderBetween(Byte value1, Byte value2) {
            addCriterion("shipping_order between", value1, value2, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_order not between", value1, value2, "shippingOrder");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLikeInsensitive(String value) {
            addCriterion("upper(shipping_code) like", value.toUpperCase(), "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingNameLikeInsensitive(String value) {
            addCriterion("upper(shipping_name) like", value.toUpperCase(), "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingDescLikeInsensitive(String value) {
            addCriterion("upper(shipping_desc) like", value.toUpperCase(), "shippingDesc");
            return (Criteria) this;
        }

        public Criteria andInsureLikeInsensitive(String value) {
            addCriterion("upper(insure) like", value.toUpperCase(), "insure");
            return (Criteria) this;
        }

        public Criteria andPrintBgLikeInsensitive(String value) {
            addCriterion("upper(print_bg) like", value.toUpperCase(), "printBg");
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