package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkSetMealExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkSetMealExample() {
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

        public Criteria andSetMealIdIsNull() {
            addCriterion("set_meal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIsNotNull() {
            addCriterion("set_meal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdEqualTo(Integer value) {
            addCriterion("set_meal_id =", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotEqualTo(Integer value) {
            addCriterion("set_meal_id <>", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThan(Integer value) {
            addCriterion("set_meal_id >", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_meal_id >=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThan(Integer value) {
            addCriterion("set_meal_id <", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThanOrEqualTo(Integer value) {
            addCriterion("set_meal_id <=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIn(List<Integer> values) {
            addCriterion("set_meal_id in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotIn(List<Integer> values) {
            addCriterion("set_meal_id not in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_id between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("set_meal_id not between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealNameIsNull() {
            addCriterion("set_meal_name is null");
            return (Criteria) this;
        }

        public Criteria andSetMealNameIsNotNull() {
            addCriterion("set_meal_name is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealNameEqualTo(String value) {
            addCriterion("set_meal_name =", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameNotEqualTo(String value) {
            addCriterion("set_meal_name <>", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameGreaterThan(String value) {
            addCriterion("set_meal_name >", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_name >=", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameLessThan(String value) {
            addCriterion("set_meal_name <", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameLessThanOrEqualTo(String value) {
            addCriterion("set_meal_name <=", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameLike(String value) {
            addCriterion("set_meal_name like", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameNotLike(String value) {
            addCriterion("set_meal_name not like", value, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameIn(List<String> values) {
            addCriterion("set_meal_name in", values, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameNotIn(List<String> values) {
            addCriterion("set_meal_name not in", values, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameBetween(String value1, String value2) {
            addCriterion("set_meal_name between", value1, value2, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealNameNotBetween(String value1, String value2) {
            addCriterion("set_meal_name not between", value1, value2, "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoIsNull() {
            addCriterion("set_meal_logo is null");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoIsNotNull() {
            addCriterion("set_meal_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoEqualTo(String value) {
            addCriterion("set_meal_logo =", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoNotEqualTo(String value) {
            addCriterion("set_meal_logo <>", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoGreaterThan(String value) {
            addCriterion("set_meal_logo >", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_logo >=", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoLessThan(String value) {
            addCriterion("set_meal_logo <", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoLessThanOrEqualTo(String value) {
            addCriterion("set_meal_logo <=", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoLike(String value) {
            addCriterion("set_meal_logo like", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoNotLike(String value) {
            addCriterion("set_meal_logo not like", value, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoIn(List<String> values) {
            addCriterion("set_meal_logo in", values, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoNotIn(List<String> values) {
            addCriterion("set_meal_logo not in", values, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoBetween(String value1, String value2) {
            addCriterion("set_meal_logo between", value1, value2, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoNotBetween(String value1, String value2) {
            addCriterion("set_meal_logo not between", value1, value2, "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleIsNull() {
            addCriterion("set_meal_title is null");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleIsNotNull() {
            addCriterion("set_meal_title is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleEqualTo(String value) {
            addCriterion("set_meal_title =", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleNotEqualTo(String value) {
            addCriterion("set_meal_title <>", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleGreaterThan(String value) {
            addCriterion("set_meal_title >", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_title >=", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleLessThan(String value) {
            addCriterion("set_meal_title <", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleLessThanOrEqualTo(String value) {
            addCriterion("set_meal_title <=", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleLike(String value) {
            addCriterion("set_meal_title like", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleNotLike(String value) {
            addCriterion("set_meal_title not like", value, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleIn(List<String> values) {
            addCriterion("set_meal_title in", values, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleNotIn(List<String> values) {
            addCriterion("set_meal_title not in", values, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleBetween(String value1, String value2) {
            addCriterion("set_meal_title between", value1, value2, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleNotBetween(String value1, String value2) {
            addCriterion("set_meal_title not between", value1, value2, "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroIsNull() {
            addCriterion("set_meal_intro is null");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroIsNotNull() {
            addCriterion("set_meal_intro is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroEqualTo(String value) {
            addCriterion("set_meal_intro =", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroNotEqualTo(String value) {
            addCriterion("set_meal_intro <>", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroGreaterThan(String value) {
            addCriterion("set_meal_intro >", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_intro >=", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroLessThan(String value) {
            addCriterion("set_meal_intro <", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroLessThanOrEqualTo(String value) {
            addCriterion("set_meal_intro <=", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroLike(String value) {
            addCriterion("set_meal_intro like", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroNotLike(String value) {
            addCriterion("set_meal_intro not like", value, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroIn(List<String> values) {
            addCriterion("set_meal_intro in", values, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroNotIn(List<String> values) {
            addCriterion("set_meal_intro not in", values, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroBetween(String value1, String value2) {
            addCriterion("set_meal_intro between", value1, value2, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroNotBetween(String value1, String value2) {
            addCriterion("set_meal_intro not between", value1, value2, "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealColorIsNull() {
            addCriterion("set_meal_color is null");
            return (Criteria) this;
        }

        public Criteria andSetMealColorIsNotNull() {
            addCriterion("set_meal_color is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealColorEqualTo(String value) {
            addCriterion("set_meal_color =", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorNotEqualTo(String value) {
            addCriterion("set_meal_color <>", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorGreaterThan(String value) {
            addCriterion("set_meal_color >", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_color >=", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorLessThan(String value) {
            addCriterion("set_meal_color <", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorLessThanOrEqualTo(String value) {
            addCriterion("set_meal_color <=", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorLike(String value) {
            addCriterion("set_meal_color like", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorNotLike(String value) {
            addCriterion("set_meal_color not like", value, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorIn(List<String> values) {
            addCriterion("set_meal_color in", values, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorNotIn(List<String> values) {
            addCriterion("set_meal_color not in", values, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorBetween(String value1, String value2) {
            addCriterion("set_meal_color between", value1, value2, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealColorNotBetween(String value1, String value2) {
            addCriterion("set_meal_color not between", value1, value2, "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealImgIsNull() {
            addCriterion("set_meal_img is null");
            return (Criteria) this;
        }

        public Criteria andSetMealImgIsNotNull() {
            addCriterion("set_meal_img is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealImgEqualTo(String value) {
            addCriterion("set_meal_img =", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgNotEqualTo(String value) {
            addCriterion("set_meal_img <>", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgGreaterThan(String value) {
            addCriterion("set_meal_img >", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_img >=", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgLessThan(String value) {
            addCriterion("set_meal_img <", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgLessThanOrEqualTo(String value) {
            addCriterion("set_meal_img <=", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgLike(String value) {
            addCriterion("set_meal_img like", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgNotLike(String value) {
            addCriterion("set_meal_img not like", value, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgIn(List<String> values) {
            addCriterion("set_meal_img in", values, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgNotIn(List<String> values) {
            addCriterion("set_meal_img not in", values, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgBetween(String value1, String value2) {
            addCriterion("set_meal_img between", value1, value2, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealImgNotBetween(String value1, String value2) {
            addCriterion("set_meal_img not between", value1, value2, "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealDateIsNull() {
            addCriterion("set_meal_date is null");
            return (Criteria) this;
        }

        public Criteria andSetMealDateIsNotNull() {
            addCriterion("set_meal_date is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealDateEqualTo(String value) {
            addCriterion("set_meal_date =", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateNotEqualTo(String value) {
            addCriterion("set_meal_date <>", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateGreaterThan(String value) {
            addCriterion("set_meal_date >", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_date >=", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateLessThan(String value) {
            addCriterion("set_meal_date <", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateLessThanOrEqualTo(String value) {
            addCriterion("set_meal_date <=", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateLike(String value) {
            addCriterion("set_meal_date like", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateNotLike(String value) {
            addCriterion("set_meal_date not like", value, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateIn(List<String> values) {
            addCriterion("set_meal_date in", values, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateNotIn(List<String> values) {
            addCriterion("set_meal_date not in", values, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateBetween(String value1, String value2) {
            addCriterion("set_meal_date between", value1, value2, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealDateNotBetween(String value1, String value2) {
            addCriterion("set_meal_date not between", value1, value2, "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlIsNull() {
            addCriterion("set_meal_url is null");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlIsNotNull() {
            addCriterion("set_meal_url is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlEqualTo(String value) {
            addCriterion("set_meal_url =", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlNotEqualTo(String value) {
            addCriterion("set_meal_url <>", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlGreaterThan(String value) {
            addCriterion("set_meal_url >", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_url >=", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlLessThan(String value) {
            addCriterion("set_meal_url <", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlLessThanOrEqualTo(String value) {
            addCriterion("set_meal_url <=", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlLike(String value) {
            addCriterion("set_meal_url like", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlNotLike(String value) {
            addCriterion("set_meal_url not like", value, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlIn(List<String> values) {
            addCriterion("set_meal_url in", values, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlNotIn(List<String> values) {
            addCriterion("set_meal_url not in", values, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlBetween(String value1, String value2) {
            addCriterion("set_meal_url between", value1, value2, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlNotBetween(String value1, String value2) {
            addCriterion("set_meal_url not between", value1, value2, "setMealUrl");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andSetMealNameLikeInsensitive(String value) {
            addCriterion("upper(set_meal_name) like", value.toUpperCase(), "setMealName");
            return (Criteria) this;
        }

        public Criteria andSetMealLogoLikeInsensitive(String value) {
            addCriterion("upper(set_meal_logo) like", value.toUpperCase(), "setMealLogo");
            return (Criteria) this;
        }

        public Criteria andSetMealTitleLikeInsensitive(String value) {
            addCriterion("upper(set_meal_title) like", value.toUpperCase(), "setMealTitle");
            return (Criteria) this;
        }

        public Criteria andSetMealIntroLikeInsensitive(String value) {
            addCriterion("upper(set_meal_intro) like", value.toUpperCase(), "setMealIntro");
            return (Criteria) this;
        }

        public Criteria andSetMealColorLikeInsensitive(String value) {
            addCriterion("upper(set_meal_color) like", value.toUpperCase(), "setMealColor");
            return (Criteria) this;
        }

        public Criteria andSetMealImgLikeInsensitive(String value) {
            addCriterion("upper(set_meal_img) like", value.toUpperCase(), "setMealImg");
            return (Criteria) this;
        }

        public Criteria andSetMealDateLikeInsensitive(String value) {
            addCriterion("upper(set_meal_date) like", value.toUpperCase(), "setMealDate");
            return (Criteria) this;
        }

        public Criteria andSetMealUrlLikeInsensitive(String value) {
            addCriterion("upper(set_meal_url) like", value.toUpperCase(), "setMealUrl");
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