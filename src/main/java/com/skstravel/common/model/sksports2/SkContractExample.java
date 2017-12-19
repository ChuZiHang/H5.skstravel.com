package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkContractExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkContractExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(String value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(String value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(String value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(String value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(String value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLike(String value) {
            addCriterion("hotel_id like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotLike(String value) {
            addCriterion("hotel_id not like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<String> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<String> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(String value1, String value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(String value1, String value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdIsNull() {
            addCriterion("airticket_id is null");
            return (Criteria) this;
        }

        public Criteria andAirticketIdIsNotNull() {
            addCriterion("airticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketIdEqualTo(String value) {
            addCriterion("airticket_id =", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdNotEqualTo(String value) {
            addCriterion("airticket_id <>", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdGreaterThan(String value) {
            addCriterion("airticket_id >", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdGreaterThanOrEqualTo(String value) {
            addCriterion("airticket_id >=", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdLessThan(String value) {
            addCriterion("airticket_id <", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdLessThanOrEqualTo(String value) {
            addCriterion("airticket_id <=", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdLike(String value) {
            addCriterion("airticket_id like", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdNotLike(String value) {
            addCriterion("airticket_id not like", value, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdIn(List<String> values) {
            addCriterion("airticket_id in", values, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdNotIn(List<String> values) {
            addCriterion("airticket_id not in", values, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdBetween(String value1, String value2) {
            addCriterion("airticket_id between", value1, value2, "airticketId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdNotBetween(String value1, String value2) {
            addCriterion("airticket_id not between", value1, value2, "airticketId");
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

        public Criteria andContractFileIsNull() {
            addCriterion("contract_file is null");
            return (Criteria) this;
        }

        public Criteria andContractFileIsNotNull() {
            addCriterion("contract_file is not null");
            return (Criteria) this;
        }

        public Criteria andContractFileEqualTo(String value) {
            addCriterion("contract_file =", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotEqualTo(String value) {
            addCriterion("contract_file <>", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThan(String value) {
            addCriterion("contract_file >", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThanOrEqualTo(String value) {
            addCriterion("contract_file >=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThan(String value) {
            addCriterion("contract_file <", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThanOrEqualTo(String value) {
            addCriterion("contract_file <=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLike(String value) {
            addCriterion("contract_file like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotLike(String value) {
            addCriterion("contract_file not like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileIn(List<String> values) {
            addCriterion("contract_file in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotIn(List<String> values) {
            addCriterion("contract_file not in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileBetween(String value1, String value2) {
            addCriterion("contract_file between", value1, value2, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotBetween(String value1, String value2) {
            addCriterion("contract_file not between", value1, value2, "contractFile");
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

        public Criteria andComboIdEqualTo(String value) {
            addCriterion("combo_id =", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotEqualTo(String value) {
            addCriterion("combo_id <>", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThan(String value) {
            addCriterion("combo_id >", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThanOrEqualTo(String value) {
            addCriterion("combo_id >=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThan(String value) {
            addCriterion("combo_id <", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThanOrEqualTo(String value) {
            addCriterion("combo_id <=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLike(String value) {
            addCriterion("combo_id like", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotLike(String value) {
            addCriterion("combo_id not like", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdIn(List<String> values) {
            addCriterion("combo_id in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotIn(List<String> values) {
            addCriterion("combo_id not in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdBetween(String value1, String value2) {
            addCriterion("combo_id between", value1, value2, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotBetween(String value1, String value2) {
            addCriterion("combo_id not between", value1, value2, "comboId");
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

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Boolean value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Boolean value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Boolean value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Boolean value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Boolean> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Boolean> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andHotelsIsNull() {
            addCriterion("hotels is null");
            return (Criteria) this;
        }

        public Criteria andHotelsIsNotNull() {
            addCriterion("hotels is not null");
            return (Criteria) this;
        }

        public Criteria andHotelsEqualTo(String value) {
            addCriterion("hotels =", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsNotEqualTo(String value) {
            addCriterion("hotels <>", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsGreaterThan(String value) {
            addCriterion("hotels >", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsGreaterThanOrEqualTo(String value) {
            addCriterion("hotels >=", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsLessThan(String value) {
            addCriterion("hotels <", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsLessThanOrEqualTo(String value) {
            addCriterion("hotels <=", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsLike(String value) {
            addCriterion("hotels like", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsNotLike(String value) {
            addCriterion("hotels not like", value, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsIn(List<String> values) {
            addCriterion("hotels in", values, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsNotIn(List<String> values) {
            addCriterion("hotels not in", values, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsBetween(String value1, String value2) {
            addCriterion("hotels between", value1, value2, "hotels");
            return (Criteria) this;
        }

        public Criteria andHotelsNotBetween(String value1, String value2) {
            addCriterion("hotels not between", value1, value2, "hotels");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andCombosIsNull() {
            addCriterion("combos is null");
            return (Criteria) this;
        }

        public Criteria andCombosIsNotNull() {
            addCriterion("combos is not null");
            return (Criteria) this;
        }

        public Criteria andCombosEqualTo(String value) {
            addCriterion("combos =", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosNotEqualTo(String value) {
            addCriterion("combos <>", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosGreaterThan(String value) {
            addCriterion("combos >", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosGreaterThanOrEqualTo(String value) {
            addCriterion("combos >=", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosLessThan(String value) {
            addCriterion("combos <", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosLessThanOrEqualTo(String value) {
            addCriterion("combos <=", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosLike(String value) {
            addCriterion("combos like", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosNotLike(String value) {
            addCriterion("combos not like", value, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosIn(List<String> values) {
            addCriterion("combos in", values, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosNotIn(List<String> values) {
            addCriterion("combos not in", values, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosBetween(String value1, String value2) {
            addCriterion("combos between", value1, value2, "combos");
            return (Criteria) this;
        }

        public Criteria andCombosNotBetween(String value1, String value2) {
            addCriterion("combos not between", value1, value2, "combos");
            return (Criteria) this;
        }

        public Criteria andAirticketsIsNull() {
            addCriterion("airtickets is null");
            return (Criteria) this;
        }

        public Criteria andAirticketsIsNotNull() {
            addCriterion("airtickets is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketsEqualTo(String value) {
            addCriterion("airtickets =", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsNotEqualTo(String value) {
            addCriterion("airtickets <>", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsGreaterThan(String value) {
            addCriterion("airtickets >", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsGreaterThanOrEqualTo(String value) {
            addCriterion("airtickets >=", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsLessThan(String value) {
            addCriterion("airtickets <", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsLessThanOrEqualTo(String value) {
            addCriterion("airtickets <=", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsLike(String value) {
            addCriterion("airtickets like", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsNotLike(String value) {
            addCriterion("airtickets not like", value, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsIn(List<String> values) {
            addCriterion("airtickets in", values, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsNotIn(List<String> values) {
            addCriterion("airtickets not in", values, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsBetween(String value1, String value2) {
            addCriterion("airtickets between", value1, value2, "airtickets");
            return (Criteria) this;
        }

        public Criteria andAirticketsNotBetween(String value1, String value2) {
            addCriterion("airtickets not between", value1, value2, "airtickets");
            return (Criteria) this;
        }

        public Criteria andContractNameLikeInsensitive(String value) {
            addCriterion("upper(contract_name) like", value.toUpperCase(), "contractName");
            return (Criteria) this;
        }

        public Criteria andHotelIdLikeInsensitive(String value) {
            addCriterion("upper(hotel_id) like", value.toUpperCase(), "hotelId");
            return (Criteria) this;
        }

        public Criteria andAirticketIdLikeInsensitive(String value) {
            addCriterion("upper(airticket_id) like", value.toUpperCase(), "airticketId");
            return (Criteria) this;
        }

        public Criteria andContractFileLikeInsensitive(String value) {
            addCriterion("upper(contract_file) like", value.toUpperCase(), "contractFile");
            return (Criteria) this;
        }

        public Criteria andComboIdLikeInsensitive(String value) {
            addCriterion("upper(combo_id) like", value.toUpperCase(), "comboId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLikeInsensitive(String value) {
            addCriterion("upper(goods_id) like", value.toUpperCase(), "goodsId");
            return (Criteria) this;
        }

        public Criteria andContractNoLikeInsensitive(String value) {
            addCriterion("upper(contract_no) like", value.toUpperCase(), "contractNo");
            return (Criteria) this;
        }

        public Criteria andOrderSnLikeInsensitive(String value) {
            addCriterion("upper(order_sn) like", value.toUpperCase(), "orderSn");
            return (Criteria) this;
        }

        public Criteria andHotelsLikeInsensitive(String value) {
            addCriterion("upper(hotels) like", value.toUpperCase(), "hotels");
            return (Criteria) this;
        }

        public Criteria andGoodsLikeInsensitive(String value) {
            addCriterion("upper(goods) like", value.toUpperCase(), "goods");
            return (Criteria) this;
        }

        public Criteria andCombosLikeInsensitive(String value) {
            addCriterion("upper(combos) like", value.toUpperCase(), "combos");
            return (Criteria) this;
        }

        public Criteria andAirticketsLikeInsensitive(String value) {
            addCriterion("upper(airtickets) like", value.toUpperCase(), "airtickets");
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