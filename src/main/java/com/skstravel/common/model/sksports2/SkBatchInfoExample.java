package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkBatchInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkBatchInfoExample() {
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

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Integer value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Integer value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Integer value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Integer value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Integer> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Integer> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andScheIdIsNull() {
            addCriterion("sche_id is null");
            return (Criteria) this;
        }

        public Criteria andScheIdIsNotNull() {
            addCriterion("sche_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheIdEqualTo(Integer value) {
            addCriterion("sche_id =", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotEqualTo(Integer value) {
            addCriterion("sche_id <>", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdGreaterThan(Integer value) {
            addCriterion("sche_id >", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sche_id >=", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdLessThan(Integer value) {
            addCriterion("sche_id <", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdLessThanOrEqualTo(Integer value) {
            addCriterion("sche_id <=", value, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdIn(List<Integer> values) {
            addCriterion("sche_id in", values, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotIn(List<Integer> values) {
            addCriterion("sche_id not in", values, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdBetween(Integer value1, Integer value2) {
            addCriterion("sche_id between", value1, value2, "scheId");
            return (Criteria) this;
        }

        public Criteria andScheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sche_id not between", value1, value2, "scheId");
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Integer value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Integer value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Integer value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Integer value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Integer> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Integer> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andTicketCodeIsNull() {
            addCriterion("ticket_code is null");
            return (Criteria) this;
        }

        public Criteria andTicketCodeIsNotNull() {
            addCriterion("ticket_code is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCodeEqualTo(String value) {
            addCriterion("ticket_code =", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotEqualTo(String value) {
            addCriterion("ticket_code <>", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeGreaterThan(String value) {
            addCriterion("ticket_code >", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_code >=", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLessThan(String value) {
            addCriterion("ticket_code <", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLessThanOrEqualTo(String value) {
            addCriterion("ticket_code <=", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLike(String value) {
            addCriterion("ticket_code like", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotLike(String value) {
            addCriterion("ticket_code not like", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeIn(List<String> values) {
            addCriterion("ticket_code in", values, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotIn(List<String> values) {
            addCriterion("ticket_code not in", values, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeBetween(String value1, String value2) {
            addCriterion("ticket_code between", value1, value2, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotBetween(String value1, String value2) {
            addCriterion("ticket_code not between", value1, value2, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixIsNull() {
            addCriterion("ticket_prefix is null");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixIsNotNull() {
            addCriterion("ticket_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixEqualTo(String value) {
            addCriterion("ticket_prefix =", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixNotEqualTo(String value) {
            addCriterion("ticket_prefix <>", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixGreaterThan(String value) {
            addCriterion("ticket_prefix >", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_prefix >=", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixLessThan(String value) {
            addCriterion("ticket_prefix <", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixLessThanOrEqualTo(String value) {
            addCriterion("ticket_prefix <=", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixLike(String value) {
            addCriterion("ticket_prefix like", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixNotLike(String value) {
            addCriterion("ticket_prefix not like", value, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixIn(List<String> values) {
            addCriterion("ticket_prefix in", values, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixNotIn(List<String> values) {
            addCriterion("ticket_prefix not in", values, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixBetween(String value1, String value2) {
            addCriterion("ticket_prefix between", value1, value2, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixNotBetween(String value1, String value2) {
            addCriterion("ticket_prefix not between", value1, value2, "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixIsNull() {
            addCriterion("ticket_postfix is null");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixIsNotNull() {
            addCriterion("ticket_postfix is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixEqualTo(String value) {
            addCriterion("ticket_postfix =", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixNotEqualTo(String value) {
            addCriterion("ticket_postfix <>", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixGreaterThan(String value) {
            addCriterion("ticket_postfix >", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_postfix >=", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixLessThan(String value) {
            addCriterion("ticket_postfix <", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixLessThanOrEqualTo(String value) {
            addCriterion("ticket_postfix <=", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixLike(String value) {
            addCriterion("ticket_postfix like", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixNotLike(String value) {
            addCriterion("ticket_postfix not like", value, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixIn(List<String> values) {
            addCriterion("ticket_postfix in", values, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixNotIn(List<String> values) {
            addCriterion("ticket_postfix not in", values, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixBetween(String value1, String value2) {
            addCriterion("ticket_postfix between", value1, value2, "ticketPostfix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixNotBetween(String value1, String value2) {
            addCriterion("ticket_postfix not between", value1, value2, "ticketPostfix");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLikeInsensitive(String value) {
            addCriterion("upper(ticket_code) like", value.toUpperCase(), "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketPrefixLikeInsensitive(String value) {
            addCriterion("upper(ticket_prefix) like", value.toUpperCase(), "ticketPrefix");
            return (Criteria) this;
        }

        public Criteria andTicketPostfixLikeInsensitive(String value) {
            addCriterion("upper(ticket_postfix) like", value.toUpperCase(), "ticketPostfix");
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