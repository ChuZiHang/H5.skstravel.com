package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkStatsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkStatsExample() {
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

        public Criteria andAccessTimeIsNull() {
            addCriterion("access_time is null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIsNotNull() {
            addCriterion("access_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeEqualTo(Integer value) {
            addCriterion("access_time =", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotEqualTo(Integer value) {
            addCriterion("access_time <>", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThan(Integer value) {
            addCriterion("access_time >", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_time >=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThan(Integer value) {
            addCriterion("access_time <", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThanOrEqualTo(Integer value) {
            addCriterion("access_time <=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIn(List<Integer> values) {
            addCriterion("access_time in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotIn(List<Integer> values) {
            addCriterion("access_time not in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeBetween(Integer value1, Integer value2) {
            addCriterion("access_time between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("access_time not between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIsNull() {
            addCriterion("visit_times is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIsNotNull() {
            addCriterion("visit_times is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimesEqualTo(Short value) {
            addCriterion("visit_times =", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotEqualTo(Short value) {
            addCriterion("visit_times <>", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesGreaterThan(Short value) {
            addCriterion("visit_times >", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("visit_times >=", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesLessThan(Short value) {
            addCriterion("visit_times <", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesLessThanOrEqualTo(Short value) {
            addCriterion("visit_times <=", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIn(List<Short> values) {
            addCriterion("visit_times in", values, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotIn(List<Short> values) {
            addCriterion("visit_times not in", values, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesBetween(Short value1, Short value2) {
            addCriterion("visit_times between", value1, value2, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotBetween(Short value1, Short value2) {
            addCriterion("visit_times not between", value1, value2, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("browser like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("browser not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRefererDomainIsNull() {
            addCriterion("referer_domain is null");
            return (Criteria) this;
        }

        public Criteria andRefererDomainIsNotNull() {
            addCriterion("referer_domain is not null");
            return (Criteria) this;
        }

        public Criteria andRefererDomainEqualTo(String value) {
            addCriterion("referer_domain =", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainNotEqualTo(String value) {
            addCriterion("referer_domain <>", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainGreaterThan(String value) {
            addCriterion("referer_domain >", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainGreaterThanOrEqualTo(String value) {
            addCriterion("referer_domain >=", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainLessThan(String value) {
            addCriterion("referer_domain <", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainLessThanOrEqualTo(String value) {
            addCriterion("referer_domain <=", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainLike(String value) {
            addCriterion("referer_domain like", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainNotLike(String value) {
            addCriterion("referer_domain not like", value, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainIn(List<String> values) {
            addCriterion("referer_domain in", values, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainNotIn(List<String> values) {
            addCriterion("referer_domain not in", values, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainBetween(String value1, String value2) {
            addCriterion("referer_domain between", value1, value2, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererDomainNotBetween(String value1, String value2) {
            addCriterion("referer_domain not between", value1, value2, "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererPathIsNull() {
            addCriterion("referer_path is null");
            return (Criteria) this;
        }

        public Criteria andRefererPathIsNotNull() {
            addCriterion("referer_path is not null");
            return (Criteria) this;
        }

        public Criteria andRefererPathEqualTo(String value) {
            addCriterion("referer_path =", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathNotEqualTo(String value) {
            addCriterion("referer_path <>", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathGreaterThan(String value) {
            addCriterion("referer_path >", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathGreaterThanOrEqualTo(String value) {
            addCriterion("referer_path >=", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathLessThan(String value) {
            addCriterion("referer_path <", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathLessThanOrEqualTo(String value) {
            addCriterion("referer_path <=", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathLike(String value) {
            addCriterion("referer_path like", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathNotLike(String value) {
            addCriterion("referer_path not like", value, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathIn(List<String> values) {
            addCriterion("referer_path in", values, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathNotIn(List<String> values) {
            addCriterion("referer_path not in", values, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathBetween(String value1, String value2) {
            addCriterion("referer_path between", value1, value2, "refererPath");
            return (Criteria) this;
        }

        public Criteria andRefererPathNotBetween(String value1, String value2) {
            addCriterion("referer_path not between", value1, value2, "refererPath");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNull() {
            addCriterion("access_url is null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNotNull() {
            addCriterion("access_url is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlEqualTo(String value) {
            addCriterion("access_url =", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotEqualTo(String value) {
            addCriterion("access_url <>", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThan(String value) {
            addCriterion("access_url >", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("access_url >=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThan(String value) {
            addCriterion("access_url <", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThanOrEqualTo(String value) {
            addCriterion("access_url <=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLike(String value) {
            addCriterion("access_url like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotLike(String value) {
            addCriterion("access_url not like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIn(List<String> values) {
            addCriterion("access_url in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotIn(List<String> values) {
            addCriterion("access_url not in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlBetween(String value1, String value2) {
            addCriterion("access_url between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotBetween(String value1, String value2) {
            addCriterion("access_url not between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andIpAddressLikeInsensitive(String value) {
            addCriterion("upper(ip_address) like", value.toUpperCase(), "ipAddress");
            return (Criteria) this;
        }

        public Criteria andBrowserLikeInsensitive(String value) {
            addCriterion("upper(browser) like", value.toUpperCase(), "browser");
            return (Criteria) this;
        }

        public Criteria andSystemLikeInsensitive(String value) {
            addCriterion("upper(system) like", value.toUpperCase(), "system");
            return (Criteria) this;
        }

        public Criteria andLanguageLikeInsensitive(String value) {
            addCriterion("upper(language) like", value.toUpperCase(), "language");
            return (Criteria) this;
        }

        public Criteria andAreaLikeInsensitive(String value) {
            addCriterion("upper(area) like", value.toUpperCase(), "area");
            return (Criteria) this;
        }

        public Criteria andRefererDomainLikeInsensitive(String value) {
            addCriterion("upper(referer_domain) like", value.toUpperCase(), "refererDomain");
            return (Criteria) this;
        }

        public Criteria andRefererPathLikeInsensitive(String value) {
            addCriterion("upper(referer_path) like", value.toUpperCase(), "refererPath");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLikeInsensitive(String value) {
            addCriterion("upper(access_url) like", value.toUpperCase(), "accessUrl");
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