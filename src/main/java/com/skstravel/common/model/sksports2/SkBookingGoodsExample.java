package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkBookingGoodsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkBookingGoodsExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
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

        public Criteria andLinkManIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("link_man =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("link_man <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("link_man >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("link_man <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("link_man like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("link_man not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("link_man in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("link_man not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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

        public Criteria andGoodsDescIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("goods_desc =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("goods_desc <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("goods_desc like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("goods_desc not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("goods_desc in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Short value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Short value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Short value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Short value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Short value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Short> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Short> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Short value1, Short value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Short value1, Short value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNull() {
            addCriterion("booking_time is null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNotNull() {
            addCriterion("booking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeEqualTo(Integer value) {
            addCriterion("booking_time =", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotEqualTo(Integer value) {
            addCriterion("booking_time <>", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThan(Integer value) {
            addCriterion("booking_time >", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("booking_time >=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThan(Integer value) {
            addCriterion("booking_time <", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("booking_time <=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIn(List<Integer> values) {
            addCriterion("booking_time in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotIn(List<Integer> values) {
            addCriterion("booking_time not in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeBetween(Integer value1, Integer value2) {
            addCriterion("booking_time between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("booking_time not between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIsNull() {
            addCriterion("is_dispose is null");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIsNotNull() {
            addCriterion("is_dispose is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisposeEqualTo(Boolean value) {
            addCriterion("is_dispose =", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotEqualTo(Boolean value) {
            addCriterion("is_dispose <>", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeGreaterThan(Boolean value) {
            addCriterion("is_dispose >", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_dispose >=", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeLessThan(Boolean value) {
            addCriterion("is_dispose <", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_dispose <=", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIn(List<Boolean> values) {
            addCriterion("is_dispose in", values, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotIn(List<Boolean> values) {
            addCriterion("is_dispose not in", values, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispose between", value1, value2, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispose not between", value1, value2, "isDispose");
            return (Criteria) this;
        }

        public Criteria andDisposeUserIsNull() {
            addCriterion("dispose_user is null");
            return (Criteria) this;
        }

        public Criteria andDisposeUserIsNotNull() {
            addCriterion("dispose_user is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeUserEqualTo(String value) {
            addCriterion("dispose_user =", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserNotEqualTo(String value) {
            addCriterion("dispose_user <>", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserGreaterThan(String value) {
            addCriterion("dispose_user >", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_user >=", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserLessThan(String value) {
            addCriterion("dispose_user <", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserLessThanOrEqualTo(String value) {
            addCriterion("dispose_user <=", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserLike(String value) {
            addCriterion("dispose_user like", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserNotLike(String value) {
            addCriterion("dispose_user not like", value, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserIn(List<String> values) {
            addCriterion("dispose_user in", values, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserNotIn(List<String> values) {
            addCriterion("dispose_user not in", values, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserBetween(String value1, String value2) {
            addCriterion("dispose_user between", value1, value2, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeUserNotBetween(String value1, String value2) {
            addCriterion("dispose_user not between", value1, value2, "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeIsNull() {
            addCriterion("dispose_time is null");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeIsNotNull() {
            addCriterion("dispose_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeEqualTo(Integer value) {
            addCriterion("dispose_time =", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeNotEqualTo(Integer value) {
            addCriterion("dispose_time <>", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeGreaterThan(Integer value) {
            addCriterion("dispose_time >", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispose_time >=", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeLessThan(Integer value) {
            addCriterion("dispose_time <", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("dispose_time <=", value, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeIn(List<Integer> values) {
            addCriterion("dispose_time in", values, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeNotIn(List<Integer> values) {
            addCriterion("dispose_time not in", values, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeBetween(Integer value1, Integer value2) {
            addCriterion("dispose_time between", value1, value2, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dispose_time not between", value1, value2, "disposeTime");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteIsNull() {
            addCriterion("dispose_note is null");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteIsNotNull() {
            addCriterion("dispose_note is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteEqualTo(String value) {
            addCriterion("dispose_note =", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteNotEqualTo(String value) {
            addCriterion("dispose_note <>", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteGreaterThan(String value) {
            addCriterion("dispose_note >", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_note >=", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteLessThan(String value) {
            addCriterion("dispose_note <", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteLessThanOrEqualTo(String value) {
            addCriterion("dispose_note <=", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteLike(String value) {
            addCriterion("dispose_note like", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteNotLike(String value) {
            addCriterion("dispose_note not like", value, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteIn(List<String> values) {
            addCriterion("dispose_note in", values, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteNotIn(List<String> values) {
            addCriterion("dispose_note not in", values, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteBetween(String value1, String value2) {
            addCriterion("dispose_note between", value1, value2, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteNotBetween(String value1, String value2) {
            addCriterion("dispose_note not between", value1, value2, "disposeNote");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andLinkManLikeInsensitive(String value) {
            addCriterion("upper(link_man) like", value.toUpperCase(), "linkMan");
            return (Criteria) this;
        }

        public Criteria andTelLikeInsensitive(String value) {
            addCriterion("upper(tel) like", value.toUpperCase(), "tel");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLikeInsensitive(String value) {
            addCriterion("upper(goods_desc) like", value.toUpperCase(), "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andDisposeUserLikeInsensitive(String value) {
            addCriterion("upper(dispose_user) like", value.toUpperCase(), "disposeUser");
            return (Criteria) this;
        }

        public Criteria andDisposeNoteLikeInsensitive(String value) {
            addCriterion("upper(dispose_note) like", value.toUpperCase(), "disposeNote");
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