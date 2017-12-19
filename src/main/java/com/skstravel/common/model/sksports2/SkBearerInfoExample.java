package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkBearerInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkBearerInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationIsNull() {
            addCriterion("gender_appellation is null");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationIsNotNull() {
            addCriterion("gender_appellation is not null");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationEqualTo(String value) {
            addCriterion("gender_appellation =", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationNotEqualTo(String value) {
            addCriterion("gender_appellation <>", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationGreaterThan(String value) {
            addCriterion("gender_appellation >", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("gender_appellation >=", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationLessThan(String value) {
            addCriterion("gender_appellation <", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationLessThanOrEqualTo(String value) {
            addCriterion("gender_appellation <=", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationLike(String value) {
            addCriterion("gender_appellation like", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationNotLike(String value) {
            addCriterion("gender_appellation not like", value, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationIn(List<String> values) {
            addCriterion("gender_appellation in", values, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationNotIn(List<String> values) {
            addCriterion("gender_appellation not in", values, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationBetween(String value1, String value2) {
            addCriterion("gender_appellation between", value1, value2, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationNotBetween(String value1, String value2) {
            addCriterion("gender_appellation not between", value1, value2, "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameIsNull() {
            addCriterion("us_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameIsNotNull() {
            addCriterion("us_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameEqualTo(String value) {
            addCriterion("us_customer_name =", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameNotEqualTo(String value) {
            addCriterion("us_customer_name <>", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameGreaterThan(String value) {
            addCriterion("us_customer_name >", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("us_customer_name >=", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameLessThan(String value) {
            addCriterion("us_customer_name <", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("us_customer_name <=", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameLike(String value) {
            addCriterion("us_customer_name like", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameNotLike(String value) {
            addCriterion("us_customer_name not like", value, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameIn(List<String> values) {
            addCriterion("us_customer_name in", values, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameNotIn(List<String> values) {
            addCriterion("us_customer_name not in", values, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameBetween(String value1, String value2) {
            addCriterion("us_customer_name between", value1, value2, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameNotBetween(String value1, String value2) {
            addCriterion("us_customer_name not between", value1, value2, "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameIsNull() {
            addCriterion("cn_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameIsNotNull() {
            addCriterion("cn_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameEqualTo(String value) {
            addCriterion("cn_customer_name =", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameNotEqualTo(String value) {
            addCriterion("cn_customer_name <>", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameGreaterThan(String value) {
            addCriterion("cn_customer_name >", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_customer_name >=", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameLessThan(String value) {
            addCriterion("cn_customer_name <", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("cn_customer_name <=", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameLike(String value) {
            addCriterion("cn_customer_name like", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameNotLike(String value) {
            addCriterion("cn_customer_name not like", value, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameIn(List<String> values) {
            addCriterion("cn_customer_name in", values, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameNotIn(List<String> values) {
            addCriterion("cn_customer_name not in", values, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameBetween(String value1, String value2) {
            addCriterion("cn_customer_name between", value1, value2, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameNotBetween(String value1, String value2) {
            addCriterion("cn_customer_name not between", value1, value2, "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIsNull() {
            addCriterion("passport_number is null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIsNotNull() {
            addCriterion("passport_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberEqualTo(String value) {
            addCriterion("passport_number =", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotEqualTo(String value) {
            addCriterion("passport_number <>", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThan(String value) {
            addCriterion("passport_number >", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("passport_number >=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThan(String value) {
            addCriterion("passport_number <", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThanOrEqualTo(String value) {
            addCriterion("passport_number <=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLike(String value) {
            addCriterion("passport_number like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotLike(String value) {
            addCriterion("passport_number not like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIn(List<String> values) {
            addCriterion("passport_number in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotIn(List<String> values) {
            addCriterion("passport_number not in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberBetween(String value1, String value2) {
            addCriterion("passport_number between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotBetween(String value1, String value2) {
            addCriterion("passport_number not between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andDateBirthIsNull() {
            addCriterion("date_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateBirthIsNotNull() {
            addCriterion("date_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateBirthEqualTo(String value) {
            addCriterion("date_birth =", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotEqualTo(String value) {
            addCriterion("date_birth <>", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthGreaterThan(String value) {
            addCriterion("date_birth >", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthGreaterThanOrEqualTo(String value) {
            addCriterion("date_birth >=", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthLessThan(String value) {
            addCriterion("date_birth <", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthLessThanOrEqualTo(String value) {
            addCriterion("date_birth <=", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthLike(String value) {
            addCriterion("date_birth like", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotLike(String value) {
            addCriterion("date_birth not like", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthIn(List<String> values) {
            addCriterion("date_birth in", values, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotIn(List<String> values) {
            addCriterion("date_birth not in", values, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthBetween(String value1, String value2) {
            addCriterion("date_birth between", value1, value2, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotBetween(String value1, String value2) {
            addCriterion("date_birth not between", value1, value2, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issue_date is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(String value) {
            addCriterion("issue_date =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(String value) {
            addCriterion("issue_date <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(String value) {
            addCriterion("issue_date >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(String value) {
            addCriterion("issue_date >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(String value) {
            addCriterion("issue_date <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(String value) {
            addCriterion("issue_date <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLike(String value) {
            addCriterion("issue_date like", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotLike(String value) {
            addCriterion("issue_date not like", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<String> values) {
            addCriterion("issue_date in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<String> values) {
            addCriterion("issue_date not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(String value1, String value2) {
            addCriterion("issue_date between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(String value1, String value2) {
            addCriterion("issue_date not between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(String value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(String value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(String value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(String value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(String value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLike(String value) {
            addCriterion("expire_date like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotLike(String value) {
            addCriterion("expire_date not like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<String> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<String> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(String value1, String value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(String value1, String value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetIsNull() {
            addCriterion("us_name_street is null");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetIsNotNull() {
            addCriterion("us_name_street is not null");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetEqualTo(String value) {
            addCriterion("us_name_street =", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetNotEqualTo(String value) {
            addCriterion("us_name_street <>", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetGreaterThan(String value) {
            addCriterion("us_name_street >", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetGreaterThanOrEqualTo(String value) {
            addCriterion("us_name_street >=", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetLessThan(String value) {
            addCriterion("us_name_street <", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetLessThanOrEqualTo(String value) {
            addCriterion("us_name_street <=", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetLike(String value) {
            addCriterion("us_name_street like", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetNotLike(String value) {
            addCriterion("us_name_street not like", value, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetIn(List<String> values) {
            addCriterion("us_name_street in", values, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetNotIn(List<String> values) {
            addCriterion("us_name_street not in", values, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetBetween(String value1, String value2) {
            addCriterion("us_name_street between", value1, value2, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetNotBetween(String value1, String value2) {
            addCriterion("us_name_street not between", value1, value2, "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetIsNull() {
            addCriterion("cn_name_street is null");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetIsNotNull() {
            addCriterion("cn_name_street is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetEqualTo(String value) {
            addCriterion("cn_name_street =", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetNotEqualTo(String value) {
            addCriterion("cn_name_street <>", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetGreaterThan(String value) {
            addCriterion("cn_name_street >", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetGreaterThanOrEqualTo(String value) {
            addCriterion("cn_name_street >=", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetLessThan(String value) {
            addCriterion("cn_name_street <", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetLessThanOrEqualTo(String value) {
            addCriterion("cn_name_street <=", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetLike(String value) {
            addCriterion("cn_name_street like", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetNotLike(String value) {
            addCriterion("cn_name_street not like", value, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetIn(List<String> values) {
            addCriterion("cn_name_street in", values, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetNotIn(List<String> values) {
            addCriterion("cn_name_street not in", values, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetBetween(String value1, String value2) {
            addCriterion("cn_name_street between", value1, value2, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetNotBetween(String value1, String value2) {
            addCriterion("cn_name_street not between", value1, value2, "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNationalityIsNull() {
            addCriterion("cn_nationality is null");
            return (Criteria) this;
        }

        public Criteria andCnNationalityIsNotNull() {
            addCriterion("cn_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andCnNationalityEqualTo(String value) {
            addCriterion("cn_nationality =", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityNotEqualTo(String value) {
            addCriterion("cn_nationality <>", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityGreaterThan(String value) {
            addCriterion("cn_nationality >", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("cn_nationality >=", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityLessThan(String value) {
            addCriterion("cn_nationality <", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityLessThanOrEqualTo(String value) {
            addCriterion("cn_nationality <=", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityLike(String value) {
            addCriterion("cn_nationality like", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityNotLike(String value) {
            addCriterion("cn_nationality not like", value, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityIn(List<String> values) {
            addCriterion("cn_nationality in", values, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityNotIn(List<String> values) {
            addCriterion("cn_nationality not in", values, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityBetween(String value1, String value2) {
            addCriterion("cn_nationality between", value1, value2, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andCnNationalityNotBetween(String value1, String value2) {
            addCriterion("cn_nationality not between", value1, value2, "cnNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityIsNull() {
            addCriterion("us_nationality is null");
            return (Criteria) this;
        }

        public Criteria andUsNationalityIsNotNull() {
            addCriterion("us_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andUsNationalityEqualTo(String value) {
            addCriterion("us_nationality =", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityNotEqualTo(String value) {
            addCriterion("us_nationality <>", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityGreaterThan(String value) {
            addCriterion("us_nationality >", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("us_nationality >=", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityLessThan(String value) {
            addCriterion("us_nationality <", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityLessThanOrEqualTo(String value) {
            addCriterion("us_nationality <=", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityLike(String value) {
            addCriterion("us_nationality like", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityNotLike(String value) {
            addCriterion("us_nationality not like", value, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityIn(List<String> values) {
            addCriterion("us_nationality in", values, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityNotIn(List<String> values) {
            addCriterion("us_nationality not in", values, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityBetween(String value1, String value2) {
            addCriterion("us_nationality between", value1, value2, "usNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityNotBetween(String value1, String value2) {
            addCriterion("us_nationality not between", value1, value2, "usNationality");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andUsCityIsNull() {
            addCriterion("us_city is null");
            return (Criteria) this;
        }

        public Criteria andUsCityIsNotNull() {
            addCriterion("us_city is not null");
            return (Criteria) this;
        }

        public Criteria andUsCityEqualTo(String value) {
            addCriterion("us_city =", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityNotEqualTo(String value) {
            addCriterion("us_city <>", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityGreaterThan(String value) {
            addCriterion("us_city >", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityGreaterThanOrEqualTo(String value) {
            addCriterion("us_city >=", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityLessThan(String value) {
            addCriterion("us_city <", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityLessThanOrEqualTo(String value) {
            addCriterion("us_city <=", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityLike(String value) {
            addCriterion("us_city like", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityNotLike(String value) {
            addCriterion("us_city not like", value, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityIn(List<String> values) {
            addCriterion("us_city in", values, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityNotIn(List<String> values) {
            addCriterion("us_city not in", values, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityBetween(String value1, String value2) {
            addCriterion("us_city between", value1, value2, "usCity");
            return (Criteria) this;
        }

        public Criteria andUsCityNotBetween(String value1, String value2) {
            addCriterion("us_city not between", value1, value2, "usCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNull() {
            addCriterion("cn_city is null");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNotNull() {
            addCriterion("cn_city is not null");
            return (Criteria) this;
        }

        public Criteria andCnCityEqualTo(String value) {
            addCriterion("cn_city =", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotEqualTo(String value) {
            addCriterion("cn_city <>", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThan(String value) {
            addCriterion("cn_city >", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThanOrEqualTo(String value) {
            addCriterion("cn_city >=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThan(String value) {
            addCriterion("cn_city <", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThanOrEqualTo(String value) {
            addCriterion("cn_city <=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLike(String value) {
            addCriterion("cn_city like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotLike(String value) {
            addCriterion("cn_city not like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIn(List<String> values) {
            addCriterion("cn_city in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotIn(List<String> values) {
            addCriterion("cn_city not in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityBetween(String value1, String value2) {
            addCriterion("cn_city between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotBetween(String value1, String value2) {
            addCriterion("cn_city not between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andUsStateIsNull() {
            addCriterion("us_state is null");
            return (Criteria) this;
        }

        public Criteria andUsStateIsNotNull() {
            addCriterion("us_state is not null");
            return (Criteria) this;
        }

        public Criteria andUsStateEqualTo(String value) {
            addCriterion("us_state =", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateNotEqualTo(String value) {
            addCriterion("us_state <>", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateGreaterThan(String value) {
            addCriterion("us_state >", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateGreaterThanOrEqualTo(String value) {
            addCriterion("us_state >=", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateLessThan(String value) {
            addCriterion("us_state <", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateLessThanOrEqualTo(String value) {
            addCriterion("us_state <=", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateLike(String value) {
            addCriterion("us_state like", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateNotLike(String value) {
            addCriterion("us_state not like", value, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateIn(List<String> values) {
            addCriterion("us_state in", values, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateNotIn(List<String> values) {
            addCriterion("us_state not in", values, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateBetween(String value1, String value2) {
            addCriterion("us_state between", value1, value2, "usState");
            return (Criteria) this;
        }

        public Criteria andUsStateNotBetween(String value1, String value2) {
            addCriterion("us_state not between", value1, value2, "usState");
            return (Criteria) this;
        }

        public Criteria andCnStateIsNull() {
            addCriterion("cn_state is null");
            return (Criteria) this;
        }

        public Criteria andCnStateIsNotNull() {
            addCriterion("cn_state is not null");
            return (Criteria) this;
        }

        public Criteria andCnStateEqualTo(String value) {
            addCriterion("cn_state =", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateNotEqualTo(String value) {
            addCriterion("cn_state <>", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateGreaterThan(String value) {
            addCriterion("cn_state >", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateGreaterThanOrEqualTo(String value) {
            addCriterion("cn_state >=", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateLessThan(String value) {
            addCriterion("cn_state <", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateLessThanOrEqualTo(String value) {
            addCriterion("cn_state <=", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateLike(String value) {
            addCriterion("cn_state like", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateNotLike(String value) {
            addCriterion("cn_state not like", value, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateIn(List<String> values) {
            addCriterion("cn_state in", values, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateNotIn(List<String> values) {
            addCriterion("cn_state not in", values, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateBetween(String value1, String value2) {
            addCriterion("cn_state between", value1, value2, "cnState");
            return (Criteria) this;
        }

        public Criteria andCnStateNotBetween(String value1, String value2) {
            addCriterion("cn_state not between", value1, value2, "cnState");
            return (Criteria) this;
        }

        public Criteria andUsCountryIsNull() {
            addCriterion("us_country is null");
            return (Criteria) this;
        }

        public Criteria andUsCountryIsNotNull() {
            addCriterion("us_country is not null");
            return (Criteria) this;
        }

        public Criteria andUsCountryEqualTo(String value) {
            addCriterion("us_country =", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryNotEqualTo(String value) {
            addCriterion("us_country <>", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryGreaterThan(String value) {
            addCriterion("us_country >", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryGreaterThanOrEqualTo(String value) {
            addCriterion("us_country >=", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryLessThan(String value) {
            addCriterion("us_country <", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryLessThanOrEqualTo(String value) {
            addCriterion("us_country <=", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryLike(String value) {
            addCriterion("us_country like", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryNotLike(String value) {
            addCriterion("us_country not like", value, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryIn(List<String> values) {
            addCriterion("us_country in", values, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryNotIn(List<String> values) {
            addCriterion("us_country not in", values, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryBetween(String value1, String value2) {
            addCriterion("us_country between", value1, value2, "usCountry");
            return (Criteria) this;
        }

        public Criteria andUsCountryNotBetween(String value1, String value2) {
            addCriterion("us_country not between", value1, value2, "usCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryIsNull() {
            addCriterion("cn_country is null");
            return (Criteria) this;
        }

        public Criteria andCnCountryIsNotNull() {
            addCriterion("cn_country is not null");
            return (Criteria) this;
        }

        public Criteria andCnCountryEqualTo(String value) {
            addCriterion("cn_country =", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryNotEqualTo(String value) {
            addCriterion("cn_country <>", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryGreaterThan(String value) {
            addCriterion("cn_country >", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryGreaterThanOrEqualTo(String value) {
            addCriterion("cn_country >=", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryLessThan(String value) {
            addCriterion("cn_country <", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryLessThanOrEqualTo(String value) {
            addCriterion("cn_country <=", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryLike(String value) {
            addCriterion("cn_country like", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryNotLike(String value) {
            addCriterion("cn_country not like", value, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryIn(List<String> values) {
            addCriterion("cn_country in", values, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryNotIn(List<String> values) {
            addCriterion("cn_country not in", values, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryBetween(String value1, String value2) {
            addCriterion("cn_country between", value1, value2, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryNotBetween(String value1, String value2) {
            addCriterion("cn_country not between", value1, value2, "cnCountry");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIsNull() {
            addCriterion("ticket_category is null");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIsNotNull() {
            addCriterion("ticket_category is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryEqualTo(String value) {
            addCriterion("ticket_category =", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotEqualTo(String value) {
            addCriterion("ticket_category <>", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryGreaterThan(String value) {
            addCriterion("ticket_category >", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_category >=", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLessThan(String value) {
            addCriterion("ticket_category <", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLessThanOrEqualTo(String value) {
            addCriterion("ticket_category <=", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLike(String value) {
            addCriterion("ticket_category like", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotLike(String value) {
            addCriterion("ticket_category not like", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIn(List<String> values) {
            addCriterion("ticket_category in", values, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotIn(List<String> values) {
            addCriterion("ticket_category not in", values, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryBetween(String value1, String value2) {
            addCriterion("ticket_category between", value1, value2, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotBetween(String value1, String value2) {
            addCriterion("ticket_category not between", value1, value2, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesIsNull() {
            addCriterion("quantity_pakcges is null");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesIsNotNull() {
            addCriterion("quantity_pakcges is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesEqualTo(Integer value) {
            addCriterion("quantity_pakcges =", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesNotEqualTo(Integer value) {
            addCriterion("quantity_pakcges <>", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesGreaterThan(Integer value) {
            addCriterion("quantity_pakcges >", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_pakcges >=", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesLessThan(Integer value) {
            addCriterion("quantity_pakcges <", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_pakcges <=", value, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesIn(List<Integer> values) {
            addCriterion("quantity_pakcges in", values, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesNotIn(List<Integer> values) {
            addCriterion("quantity_pakcges not in", values, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesBetween(Integer value1, Integer value2) {
            addCriterion("quantity_pakcges between", value1, value2, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andQuantityPakcgesNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_pakcges not between", value1, value2, "quantityPakcges");
            return (Criteria) this;
        }

        public Criteria andContactsTelIsNull() {
            addCriterion("contacts_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactsTelIsNotNull() {
            addCriterion("contacts_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTelEqualTo(String value) {
            addCriterion("contacts_tel =", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotEqualTo(String value) {
            addCriterion("contacts_tel <>", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelGreaterThan(String value) {
            addCriterion("contacts_tel >", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_tel >=", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLessThan(String value) {
            addCriterion("contacts_tel <", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLessThanOrEqualTo(String value) {
            addCriterion("contacts_tel <=", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLike(String value) {
            addCriterion("contacts_tel like", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotLike(String value) {
            addCriterion("contacts_tel not like", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelIn(List<String> values) {
            addCriterion("contacts_tel in", values, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotIn(List<String> values) {
            addCriterion("contacts_tel not in", values, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelBetween(String value1, String value2) {
            addCriterion("contacts_tel between", value1, value2, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotBetween(String value1, String value2) {
            addCriterion("contacts_tel not between", value1, value2, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelIsNull() {
            addCriterion("emergency_contacts_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelIsNotNull() {
            addCriterion("emergency_contacts_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelEqualTo(String value) {
            addCriterion("emergency_contacts_tel =", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelNotEqualTo(String value) {
            addCriterion("emergency_contacts_tel <>", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelGreaterThan(String value) {
            addCriterion("emergency_contacts_tel >", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contacts_tel >=", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelLessThan(String value) {
            addCriterion("emergency_contacts_tel <", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelLessThanOrEqualTo(String value) {
            addCriterion("emergency_contacts_tel <=", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelLike(String value) {
            addCriterion("emergency_contacts_tel like", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelNotLike(String value) {
            addCriterion("emergency_contacts_tel not like", value, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelIn(List<String> values) {
            addCriterion("emergency_contacts_tel in", values, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelNotIn(List<String> values) {
            addCriterion("emergency_contacts_tel not in", values, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelBetween(String value1, String value2) {
            addCriterion("emergency_contacts_tel between", value1, value2, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelNotBetween(String value1, String value2) {
            addCriterion("emergency_contacts_tel not between", value1, value2, "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andUsRemarksIsNull() {
            addCriterion("us_remarks is null");
            return (Criteria) this;
        }

        public Criteria andUsRemarksIsNotNull() {
            addCriterion("us_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andUsRemarksEqualTo(String value) {
            addCriterion("us_remarks =", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksNotEqualTo(String value) {
            addCriterion("us_remarks <>", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksGreaterThan(String value) {
            addCriterion("us_remarks >", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("us_remarks >=", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksLessThan(String value) {
            addCriterion("us_remarks <", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksLessThanOrEqualTo(String value) {
            addCriterion("us_remarks <=", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksLike(String value) {
            addCriterion("us_remarks like", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksNotLike(String value) {
            addCriterion("us_remarks not like", value, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksIn(List<String> values) {
            addCriterion("us_remarks in", values, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksNotIn(List<String> values) {
            addCriterion("us_remarks not in", values, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksBetween(String value1, String value2) {
            addCriterion("us_remarks between", value1, value2, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andUsRemarksNotBetween(String value1, String value2) {
            addCriterion("us_remarks not between", value1, value2, "usRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksIsNull() {
            addCriterion("cn_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCnRemarksIsNotNull() {
            addCriterion("cn_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCnRemarksEqualTo(String value) {
            addCriterion("cn_remarks =", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksNotEqualTo(String value) {
            addCriterion("cn_remarks <>", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksGreaterThan(String value) {
            addCriterion("cn_remarks >", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("cn_remarks >=", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksLessThan(String value) {
            addCriterion("cn_remarks <", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksLessThanOrEqualTo(String value) {
            addCriterion("cn_remarks <=", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksLike(String value) {
            addCriterion("cn_remarks like", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksNotLike(String value) {
            addCriterion("cn_remarks not like", value, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksIn(List<String> values) {
            addCriterion("cn_remarks in", values, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksNotIn(List<String> values) {
            addCriterion("cn_remarks not in", values, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksBetween(String value1, String value2) {
            addCriterion("cn_remarks between", value1, value2, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksNotBetween(String value1, String value2) {
            addCriterion("cn_remarks not between", value1, value2, "cnRemarks");
            return (Criteria) this;
        }

        public Criteria andAuditBearerIsNull() {
            addCriterion("audit_bearer is null");
            return (Criteria) this;
        }

        public Criteria andAuditBearerIsNotNull() {
            addCriterion("audit_bearer is not null");
            return (Criteria) this;
        }

        public Criteria andAuditBearerEqualTo(Integer value) {
            addCriterion("audit_bearer =", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerNotEqualTo(Integer value) {
            addCriterion("audit_bearer <>", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerGreaterThan(Integer value) {
            addCriterion("audit_bearer >", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_bearer >=", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerLessThan(Integer value) {
            addCriterion("audit_bearer <", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerLessThanOrEqualTo(Integer value) {
            addCriterion("audit_bearer <=", value, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerIn(List<Integer> values) {
            addCriterion("audit_bearer in", values, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerNotIn(List<Integer> values) {
            addCriterion("audit_bearer not in", values, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerBetween(Integer value1, Integer value2) {
            addCriterion("audit_bearer between", value1, value2, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andAuditBearerNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_bearer not between", value1, value2, "auditBearer");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNull() {
            addCriterion("submit is null");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNotNull() {
            addCriterion("submit is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitEqualTo(Integer value) {
            addCriterion("submit =", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotEqualTo(Integer value) {
            addCriterion("submit <>", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThan(Integer value) {
            addCriterion("submit >", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit >=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThan(Integer value) {
            addCriterion("submit <", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThanOrEqualTo(Integer value) {
            addCriterion("submit <=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitIn(List<Integer> values) {
            addCriterion("submit in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotIn(List<Integer> values) {
            addCriterion("submit not in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitBetween(Integer value1, Integer value2) {
            addCriterion("submit between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("submit not between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNull() {
            addCriterion("sub_time is null");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNotNull() {
            addCriterion("sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubTimeEqualTo(Integer value) {
            addCriterion("sub_time =", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotEqualTo(Integer value) {
            addCriterion("sub_time <>", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThan(Integer value) {
            addCriterion("sub_time >", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_time >=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThan(Integer value) {
            addCriterion("sub_time <", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sub_time <=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeIn(List<Integer> values) {
            addCriterion("sub_time in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotIn(List<Integer> values) {
            addCriterion("sub_time not in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeBetween(Integer value1, Integer value2) {
            addCriterion("sub_time between", value1, value2, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_time not between", value1, value2, "subTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeIsNull() {
            addCriterion("add_bearer_time is null");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeIsNotNull() {
            addCriterion("add_bearer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeEqualTo(Integer value) {
            addCriterion("add_bearer_time =", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeNotEqualTo(Integer value) {
            addCriterion("add_bearer_time <>", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeGreaterThan(Integer value) {
            addCriterion("add_bearer_time >", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_bearer_time >=", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeLessThan(Integer value) {
            addCriterion("add_bearer_time <", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_bearer_time <=", value, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeIn(List<Integer> values) {
            addCriterion("add_bearer_time in", values, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeNotIn(List<Integer> values) {
            addCriterion("add_bearer_time not in", values, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_bearer_time between", value1, value2, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andAddBearerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_bearer_time not between", value1, value2, "addBearerTime");
            return (Criteria) this;
        }

        public Criteria andGenderAppellationLikeInsensitive(String value) {
            addCriterion("upper(gender_appellation) like", value.toUpperCase(), "genderAppellation");
            return (Criteria) this;
        }

        public Criteria andUsCustomerNameLikeInsensitive(String value) {
            addCriterion("upper(us_customer_name) like", value.toUpperCase(), "usCustomerName");
            return (Criteria) this;
        }

        public Criteria andCnCustomerNameLikeInsensitive(String value) {
            addCriterion("upper(cn_customer_name) like", value.toUpperCase(), "cnCustomerName");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLikeInsensitive(String value) {
            addCriterion("upper(passport_number) like", value.toUpperCase(), "passportNumber");
            return (Criteria) this;
        }

        public Criteria andDateBirthLikeInsensitive(String value) {
            addCriterion("upper(date_birth) like", value.toUpperCase(), "dateBirth");
            return (Criteria) this;
        }

        public Criteria andIssueDateLikeInsensitive(String value) {
            addCriterion("upper(issue_date) like", value.toUpperCase(), "issueDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLikeInsensitive(String value) {
            addCriterion("upper(expire_date) like", value.toUpperCase(), "expireDate");
            return (Criteria) this;
        }

        public Criteria andUsNameStreetLikeInsensitive(String value) {
            addCriterion("upper(us_name_street) like", value.toUpperCase(), "usNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNameStreetLikeInsensitive(String value) {
            addCriterion("upper(cn_name_street) like", value.toUpperCase(), "cnNameStreet");
            return (Criteria) this;
        }

        public Criteria andCnNationalityLikeInsensitive(String value) {
            addCriterion("upper(cn_nationality) like", value.toUpperCase(), "cnNationality");
            return (Criteria) this;
        }

        public Criteria andUsNationalityLikeInsensitive(String value) {
            addCriterion("upper(us_nationality) like", value.toUpperCase(), "usNationality");
            return (Criteria) this;
        }

        public Criteria andPostCodeLikeInsensitive(String value) {
            addCriterion("upper(post_code) like", value.toUpperCase(), "postCode");
            return (Criteria) this;
        }

        public Criteria andUsCityLikeInsensitive(String value) {
            addCriterion("upper(us_city) like", value.toUpperCase(), "usCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLikeInsensitive(String value) {
            addCriterion("upper(cn_city) like", value.toUpperCase(), "cnCity");
            return (Criteria) this;
        }

        public Criteria andUsStateLikeInsensitive(String value) {
            addCriterion("upper(us_state) like", value.toUpperCase(), "usState");
            return (Criteria) this;
        }

        public Criteria andCnStateLikeInsensitive(String value) {
            addCriterion("upper(cn_state) like", value.toUpperCase(), "cnState");
            return (Criteria) this;
        }

        public Criteria andUsCountryLikeInsensitive(String value) {
            addCriterion("upper(us_country) like", value.toUpperCase(), "usCountry");
            return (Criteria) this;
        }

        public Criteria andCnCountryLikeInsensitive(String value) {
            addCriterion("upper(cn_country) like", value.toUpperCase(), "cnCountry");
            return (Criteria) this;
        }

        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andMailLikeInsensitive(String value) {
            addCriterion("upper(mail) like", value.toUpperCase(), "mail");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLikeInsensitive(String value) {
            addCriterion("upper(ticket_category) like", value.toUpperCase(), "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andContactsTelLikeInsensitive(String value) {
            addCriterion("upper(contacts_tel) like", value.toUpperCase(), "contactsTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactsTelLikeInsensitive(String value) {
            addCriterion("upper(emergency_contacts_tel) like", value.toUpperCase(), "emergencyContactsTel");
            return (Criteria) this;
        }

        public Criteria andUsRemarksLikeInsensitive(String value) {
            addCriterion("upper(us_remarks) like", value.toUpperCase(), "usRemarks");
            return (Criteria) this;
        }

        public Criteria andCnRemarksLikeInsensitive(String value) {
            addCriterion("upper(cn_remarks) like", value.toUpperCase(), "cnRemarks");
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