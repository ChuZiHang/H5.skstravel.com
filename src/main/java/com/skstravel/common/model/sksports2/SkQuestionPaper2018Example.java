package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkQuestionPaper2018Example implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkQuestionPaper2018Example() {
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelIsNull() {
            addCriterion("ticket_type_level is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelIsNotNull() {
            addCriterion("ticket_type_level is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelEqualTo(Byte value) {
            addCriterion("ticket_type_level =", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelNotEqualTo(Byte value) {
            addCriterion("ticket_type_level <>", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelGreaterThan(Byte value) {
            addCriterion("ticket_type_level >", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ticket_type_level >=", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelLessThan(Byte value) {
            addCriterion("ticket_type_level <", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("ticket_type_level <=", value, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelIn(List<Byte> values) {
            addCriterion("ticket_type_level in", values, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelNotIn(List<Byte> values) {
            addCriterion("ticket_type_level not in", values, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelBetween(Byte value1, Byte value2) {
            addCriterion("ticket_type_level between", value1, value2, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("ticket_type_level not between", value1, value2, "ticketTypeLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextIsNull() {
            addCriterion("vip_level_text is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextIsNotNull() {
            addCriterion("vip_level_text is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextEqualTo(String value) {
            addCriterion("vip_level_text =", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextNotEqualTo(String value) {
            addCriterion("vip_level_text <>", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextGreaterThan(String value) {
            addCriterion("vip_level_text >", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextGreaterThanOrEqualTo(String value) {
            addCriterion("vip_level_text >=", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextLessThan(String value) {
            addCriterion("vip_level_text <", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextLessThanOrEqualTo(String value) {
            addCriterion("vip_level_text <=", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextLike(String value) {
            addCriterion("vip_level_text like", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextNotLike(String value) {
            addCriterion("vip_level_text not like", value, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextIn(List<String> values) {
            addCriterion("vip_level_text in", values, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextNotIn(List<String> values) {
            addCriterion("vip_level_text not in", values, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextBetween(String value1, String value2) {
            addCriterion("vip_level_text between", value1, value2, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextNotBetween(String value1, String value2) {
            addCriterion("vip_level_text not between", value1, value2, "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNull() {
            addCriterion("number_id is null");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNotNull() {
            addCriterion("number_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumberIdEqualTo(Integer value) {
            addCriterion("number_id =", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotEqualTo(Integer value) {
            addCriterion("number_id <>", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThan(Integer value) {
            addCriterion("number_id >", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_id >=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThan(Integer value) {
            addCriterion("number_id <", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("number_id <=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdIn(List<Integer> values) {
            addCriterion("number_id in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotIn(List<Integer> values) {
            addCriterion("number_id not in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdBetween(Integer value1, Integer value2) {
            addCriterion("number_id between", value1, value2, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("number_id not between", value1, value2, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberNameIsNull() {
            addCriterion("number_name is null");
            return (Criteria) this;
        }

        public Criteria andNumberNameIsNotNull() {
            addCriterion("number_name is not null");
            return (Criteria) this;
        }

        public Criteria andNumberNameEqualTo(String value) {
            addCriterion("number_name =", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameNotEqualTo(String value) {
            addCriterion("number_name <>", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameGreaterThan(String value) {
            addCriterion("number_name >", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameGreaterThanOrEqualTo(String value) {
            addCriterion("number_name >=", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameLessThan(String value) {
            addCriterion("number_name <", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameLessThanOrEqualTo(String value) {
            addCriterion("number_name <=", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameLike(String value) {
            addCriterion("number_name like", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameNotLike(String value) {
            addCriterion("number_name not like", value, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameIn(List<String> values) {
            addCriterion("number_name in", values, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameNotIn(List<String> values) {
            addCriterion("number_name not in", values, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameBetween(String value1, String value2) {
            addCriterion("number_name between", value1, value2, "numberName");
            return (Criteria) this;
        }

        public Criteria andNumberNameNotBetween(String value1, String value2) {
            addCriterion("number_name not between", value1, value2, "numberName");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andRealnameLikeInsensitive(String value) {
            addCriterion("upper(realname) like", value.toUpperCase(), "realname");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andVipLevelTextLikeInsensitive(String value) {
            addCriterion("upper(vip_level_text) like", value.toUpperCase(), "vipLevelText");
            return (Criteria) this;
        }

        public Criteria andNumberNameLikeInsensitive(String value) {
            addCriterion("upper(number_name) like", value.toUpperCase(), "numberName");
            return (Criteria) this;
        }

        public Criteria andNotesLikeInsensitive(String value) {
            addCriterion("upper(notes) like", value.toUpperCase(), "notes");
            return (Criteria) this;
        }

        public Criteria andIpLikeInsensitive(String value) {
            addCriterion("upper(ip) like", value.toUpperCase(), "ip");
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