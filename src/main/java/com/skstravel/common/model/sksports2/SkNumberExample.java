package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkNumberExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkNumberExample() {
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

        public Criteria andNumNameIsNull() {
            addCriterion("num_name is null");
            return (Criteria) this;
        }

        public Criteria andNumNameIsNotNull() {
            addCriterion("num_name is not null");
            return (Criteria) this;
        }

        public Criteria andNumNameEqualTo(String value) {
            addCriterion("num_name =", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotEqualTo(String value) {
            addCriterion("num_name <>", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameGreaterThan(String value) {
            addCriterion("num_name >", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameGreaterThanOrEqualTo(String value) {
            addCriterion("num_name >=", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLessThan(String value) {
            addCriterion("num_name <", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLessThanOrEqualTo(String value) {
            addCriterion("num_name <=", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLike(String value) {
            addCriterion("num_name like", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotLike(String value) {
            addCriterion("num_name not like", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameIn(List<String> values) {
            addCriterion("num_name in", values, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotIn(List<String> values) {
            addCriterion("num_name not in", values, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameBetween(String value1, String value2) {
            addCriterion("num_name between", value1, value2, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotBetween(String value1, String value2) {
            addCriterion("num_name not between", value1, value2, "numName");
            return (Criteria) this;
        }

        public Criteria andNumImgIsNull() {
            addCriterion("num_img is null");
            return (Criteria) this;
        }

        public Criteria andNumImgIsNotNull() {
            addCriterion("num_img is not null");
            return (Criteria) this;
        }

        public Criteria andNumImgEqualTo(String value) {
            addCriterion("num_img =", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgNotEqualTo(String value) {
            addCriterion("num_img <>", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgGreaterThan(String value) {
            addCriterion("num_img >", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgGreaterThanOrEqualTo(String value) {
            addCriterion("num_img >=", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgLessThan(String value) {
            addCriterion("num_img <", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgLessThanOrEqualTo(String value) {
            addCriterion("num_img <=", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgLike(String value) {
            addCriterion("num_img like", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgNotLike(String value) {
            addCriterion("num_img not like", value, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgIn(List<String> values) {
            addCriterion("num_img in", values, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgNotIn(List<String> values) {
            addCriterion("num_img not in", values, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgBetween(String value1, String value2) {
            addCriterion("num_img between", value1, value2, "numImg");
            return (Criteria) this;
        }

        public Criteria andNumImgNotBetween(String value1, String value2) {
            addCriterion("num_img not between", value1, value2, "numImg");
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

        public Criteria andPitchIdIsNull() {
            addCriterion("pitch_id is null");
            return (Criteria) this;
        }

        public Criteria andPitchIdIsNotNull() {
            addCriterion("pitch_id is not null");
            return (Criteria) this;
        }

        public Criteria andPitchIdEqualTo(Integer value) {
            addCriterion("pitch_id =", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotEqualTo(Integer value) {
            addCriterion("pitch_id <>", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdGreaterThan(Integer value) {
            addCriterion("pitch_id >", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pitch_id >=", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdLessThan(Integer value) {
            addCriterion("pitch_id <", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdLessThanOrEqualTo(Integer value) {
            addCriterion("pitch_id <=", value, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdIn(List<Integer> values) {
            addCriterion("pitch_id in", values, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotIn(List<Integer> values) {
            addCriterion("pitch_id not in", values, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdBetween(Integer value1, Integer value2) {
            addCriterion("pitch_id between", value1, value2, "pitchId");
            return (Criteria) this;
        }

        public Criteria andPitchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pitch_id not between", value1, value2, "pitchId");
            return (Criteria) this;
        }

        public Criteria andNumStartIsNull() {
            addCriterion("num_start is null");
            return (Criteria) this;
        }

        public Criteria andNumStartIsNotNull() {
            addCriterion("num_start is not null");
            return (Criteria) this;
        }

        public Criteria andNumStartEqualTo(Date value) {
            addCriterion("num_start =", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotEqualTo(Date value) {
            addCriterion("num_start <>", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartGreaterThan(Date value) {
            addCriterion("num_start >", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartGreaterThanOrEqualTo(Date value) {
            addCriterion("num_start >=", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartLessThan(Date value) {
            addCriterion("num_start <", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartLessThanOrEqualTo(Date value) {
            addCriterion("num_start <=", value, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartIn(List<Date> values) {
            addCriterion("num_start in", values, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotIn(List<Date> values) {
            addCriterion("num_start not in", values, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartBetween(Date value1, Date value2) {
            addCriterion("num_start between", value1, value2, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumStartNotBetween(Date value1, Date value2) {
            addCriterion("num_start not between", value1, value2, "numStart");
            return (Criteria) this;
        }

        public Criteria andNumEndIsNull() {
            addCriterion("num_end is null");
            return (Criteria) this;
        }

        public Criteria andNumEndIsNotNull() {
            addCriterion("num_end is not null");
            return (Criteria) this;
        }

        public Criteria andNumEndEqualTo(Date value) {
            addCriterion("num_end =", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotEqualTo(Date value) {
            addCriterion("num_end <>", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndGreaterThan(Date value) {
            addCriterion("num_end >", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndGreaterThanOrEqualTo(Date value) {
            addCriterion("num_end >=", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndLessThan(Date value) {
            addCriterion("num_end <", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndLessThanOrEqualTo(Date value) {
            addCriterion("num_end <=", value, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndIn(List<Date> values) {
            addCriterion("num_end in", values, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotIn(List<Date> values) {
            addCriterion("num_end not in", values, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndBetween(Date value1, Date value2) {
            addCriterion("num_end between", value1, value2, "numEnd");
            return (Criteria) this;
        }

        public Criteria andNumEndNotBetween(Date value1, Date value2) {
            addCriterion("num_end not between", value1, value2, "numEnd");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(String value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(String value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(String value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(String value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(String value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(String value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLike(String value) {
            addCriterion("color_id like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotLike(String value) {
            addCriterion("color_id not like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<String> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<String> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(String value1, String value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(String value1, String value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(String value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(String value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(String value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(String value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(String value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLike(String value) {
            addCriterion("numbers like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotLike(String value) {
            addCriterion("numbers not like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<String> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<String> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(String value1, String value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(String value1, String value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andNumTitleIsNull() {
            addCriterion("num_title is null");
            return (Criteria) this;
        }

        public Criteria andNumTitleIsNotNull() {
            addCriterion("num_title is not null");
            return (Criteria) this;
        }

        public Criteria andNumTitleEqualTo(String value) {
            addCriterion("num_title =", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleNotEqualTo(String value) {
            addCriterion("num_title <>", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleGreaterThan(String value) {
            addCriterion("num_title >", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleGreaterThanOrEqualTo(String value) {
            addCriterion("num_title >=", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleLessThan(String value) {
            addCriterion("num_title <", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleLessThanOrEqualTo(String value) {
            addCriterion("num_title <=", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleLike(String value) {
            addCriterion("num_title like", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleNotLike(String value) {
            addCriterion("num_title not like", value, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleIn(List<String> values) {
            addCriterion("num_title in", values, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleNotIn(List<String> values) {
            addCriterion("num_title not in", values, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleBetween(String value1, String value2) {
            addCriterion("num_title between", value1, value2, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumTitleNotBetween(String value1, String value2) {
            addCriterion("num_title not between", value1, value2, "numTitle");
            return (Criteria) this;
        }

        public Criteria andNumNameLikeInsensitive(String value) {
            addCriterion("upper(num_name) like", value.toUpperCase(), "numName");
            return (Criteria) this;
        }

        public Criteria andNumImgLikeInsensitive(String value) {
            addCriterion("upper(num_img) like", value.toUpperCase(), "numImg");
            return (Criteria) this;
        }

        public Criteria andColorIdLikeInsensitive(String value) {
            addCriterion("upper(color_id) like", value.toUpperCase(), "colorId");
            return (Criteria) this;
        }

        public Criteria andNumbersLikeInsensitive(String value) {
            addCriterion("upper(numbers) like", value.toUpperCase(), "numbers");
            return (Criteria) this;
        }

        public Criteria andNumTitleLikeInsensitive(String value) {
            addCriterion("upper(num_title) like", value.toUpperCase(), "numTitle");
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