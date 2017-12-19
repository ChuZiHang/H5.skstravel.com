package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkComboExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkComboExample() {
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

        public Criteria andComboIdIsNull() {
            addCriterion("combo_id is null");
            return (Criteria) this;
        }

        public Criteria andComboIdIsNotNull() {
            addCriterion("combo_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboIdEqualTo(Integer value) {
            addCriterion("combo_id =", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotEqualTo(Integer value) {
            addCriterion("combo_id <>", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThan(Integer value) {
            addCriterion("combo_id >", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_id >=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThan(Integer value) {
            addCriterion("combo_id <", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_id <=", value, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdIn(List<Integer> values) {
            addCriterion("combo_id in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotIn(List<Integer> values) {
            addCriterion("combo_id not in", values, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_id between", value1, value2, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_id not between", value1, value2, "comboId");
            return (Criteria) this;
        }

        public Criteria andComboNameIsNull() {
            addCriterion("combo_name is null");
            return (Criteria) this;
        }

        public Criteria andComboNameIsNotNull() {
            addCriterion("combo_name is not null");
            return (Criteria) this;
        }

        public Criteria andComboNameEqualTo(String value) {
            addCriterion("combo_name =", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameNotEqualTo(String value) {
            addCriterion("combo_name <>", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameGreaterThan(String value) {
            addCriterion("combo_name >", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameGreaterThanOrEqualTo(String value) {
            addCriterion("combo_name >=", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameLessThan(String value) {
            addCriterion("combo_name <", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameLessThanOrEqualTo(String value) {
            addCriterion("combo_name <=", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameLike(String value) {
            addCriterion("combo_name like", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameNotLike(String value) {
            addCriterion("combo_name not like", value, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameIn(List<String> values) {
            addCriterion("combo_name in", values, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameNotIn(List<String> values) {
            addCriterion("combo_name not in", values, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameBetween(String value1, String value2) {
            addCriterion("combo_name between", value1, value2, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboNameNotBetween(String value1, String value2) {
            addCriterion("combo_name not between", value1, value2, "comboName");
            return (Criteria) this;
        }

        public Criteria andComboTitleIsNull() {
            addCriterion("combo_title is null");
            return (Criteria) this;
        }

        public Criteria andComboTitleIsNotNull() {
            addCriterion("combo_title is not null");
            return (Criteria) this;
        }

        public Criteria andComboTitleEqualTo(String value) {
            addCriterion("combo_title =", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleNotEqualTo(String value) {
            addCriterion("combo_title <>", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleGreaterThan(String value) {
            addCriterion("combo_title >", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleGreaterThanOrEqualTo(String value) {
            addCriterion("combo_title >=", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleLessThan(String value) {
            addCriterion("combo_title <", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleLessThanOrEqualTo(String value) {
            addCriterion("combo_title <=", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleLike(String value) {
            addCriterion("combo_title like", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleNotLike(String value) {
            addCriterion("combo_title not like", value, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleIn(List<String> values) {
            addCriterion("combo_title in", values, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleNotIn(List<String> values) {
            addCriterion("combo_title not in", values, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleBetween(String value1, String value2) {
            addCriterion("combo_title between", value1, value2, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboTitleNotBetween(String value1, String value2) {
            addCriterion("combo_title not between", value1, value2, "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroIsNull() {
            addCriterion("combo_intro is null");
            return (Criteria) this;
        }

        public Criteria andComboIntroIsNotNull() {
            addCriterion("combo_intro is not null");
            return (Criteria) this;
        }

        public Criteria andComboIntroEqualTo(String value) {
            addCriterion("combo_intro =", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroNotEqualTo(String value) {
            addCriterion("combo_intro <>", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroGreaterThan(String value) {
            addCriterion("combo_intro >", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroGreaterThanOrEqualTo(String value) {
            addCriterion("combo_intro >=", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroLessThan(String value) {
            addCriterion("combo_intro <", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroLessThanOrEqualTo(String value) {
            addCriterion("combo_intro <=", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroLike(String value) {
            addCriterion("combo_intro like", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroNotLike(String value) {
            addCriterion("combo_intro not like", value, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroIn(List<String> values) {
            addCriterion("combo_intro in", values, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroNotIn(List<String> values) {
            addCriterion("combo_intro not in", values, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroBetween(String value1, String value2) {
            addCriterion("combo_intro between", value1, value2, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboIntroNotBetween(String value1, String value2) {
            addCriterion("combo_intro not between", value1, value2, "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboLogoIsNull() {
            addCriterion("combo_logo is null");
            return (Criteria) this;
        }

        public Criteria andComboLogoIsNotNull() {
            addCriterion("combo_logo is not null");
            return (Criteria) this;
        }

        public Criteria andComboLogoEqualTo(String value) {
            addCriterion("combo_logo =", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoNotEqualTo(String value) {
            addCriterion("combo_logo <>", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoGreaterThan(String value) {
            addCriterion("combo_logo >", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoGreaterThanOrEqualTo(String value) {
            addCriterion("combo_logo >=", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoLessThan(String value) {
            addCriterion("combo_logo <", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoLessThanOrEqualTo(String value) {
            addCriterion("combo_logo <=", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoLike(String value) {
            addCriterion("combo_logo like", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoNotLike(String value) {
            addCriterion("combo_logo not like", value, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoIn(List<String> values) {
            addCriterion("combo_logo in", values, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoNotIn(List<String> values) {
            addCriterion("combo_logo not in", values, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoBetween(String value1, String value2) {
            addCriterion("combo_logo between", value1, value2, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboLogoNotBetween(String value1, String value2) {
            addCriterion("combo_logo not between", value1, value2, "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboImgIsNull() {
            addCriterion("combo_img is null");
            return (Criteria) this;
        }

        public Criteria andComboImgIsNotNull() {
            addCriterion("combo_img is not null");
            return (Criteria) this;
        }

        public Criteria andComboImgEqualTo(String value) {
            addCriterion("combo_img =", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgNotEqualTo(String value) {
            addCriterion("combo_img <>", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgGreaterThan(String value) {
            addCriterion("combo_img >", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgGreaterThanOrEqualTo(String value) {
            addCriterion("combo_img >=", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgLessThan(String value) {
            addCriterion("combo_img <", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgLessThanOrEqualTo(String value) {
            addCriterion("combo_img <=", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgLike(String value) {
            addCriterion("combo_img like", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgNotLike(String value) {
            addCriterion("combo_img not like", value, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgIn(List<String> values) {
            addCriterion("combo_img in", values, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgNotIn(List<String> values) {
            addCriterion("combo_img not in", values, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgBetween(String value1, String value2) {
            addCriterion("combo_img between", value1, value2, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboImgNotBetween(String value1, String value2) {
            addCriterion("combo_img not between", value1, value2, "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboColorIsNull() {
            addCriterion("combo_color is null");
            return (Criteria) this;
        }

        public Criteria andComboColorIsNotNull() {
            addCriterion("combo_color is not null");
            return (Criteria) this;
        }

        public Criteria andComboColorEqualTo(String value) {
            addCriterion("combo_color =", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorNotEqualTo(String value) {
            addCriterion("combo_color <>", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorGreaterThan(String value) {
            addCriterion("combo_color >", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorGreaterThanOrEqualTo(String value) {
            addCriterion("combo_color >=", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorLessThan(String value) {
            addCriterion("combo_color <", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorLessThanOrEqualTo(String value) {
            addCriterion("combo_color <=", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorLike(String value) {
            addCriterion("combo_color like", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorNotLike(String value) {
            addCriterion("combo_color not like", value, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorIn(List<String> values) {
            addCriterion("combo_color in", values, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorNotIn(List<String> values) {
            addCriterion("combo_color not in", values, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorBetween(String value1, String value2) {
            addCriterion("combo_color between", value1, value2, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboColorNotBetween(String value1, String value2) {
            addCriterion("combo_color not between", value1, value2, "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboPitchsIsNull() {
            addCriterion("combo_pitchs is null");
            return (Criteria) this;
        }

        public Criteria andComboPitchsIsNotNull() {
            addCriterion("combo_pitchs is not null");
            return (Criteria) this;
        }

        public Criteria andComboPitchsEqualTo(String value) {
            addCriterion("combo_pitchs =", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsNotEqualTo(String value) {
            addCriterion("combo_pitchs <>", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsGreaterThan(String value) {
            addCriterion("combo_pitchs >", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsGreaterThanOrEqualTo(String value) {
            addCriterion("combo_pitchs >=", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsLessThan(String value) {
            addCriterion("combo_pitchs <", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsLessThanOrEqualTo(String value) {
            addCriterion("combo_pitchs <=", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsLike(String value) {
            addCriterion("combo_pitchs like", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsNotLike(String value) {
            addCriterion("combo_pitchs not like", value, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsIn(List<String> values) {
            addCriterion("combo_pitchs in", values, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsNotIn(List<String> values) {
            addCriterion("combo_pitchs not in", values, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsBetween(String value1, String value2) {
            addCriterion("combo_pitchs between", value1, value2, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboPitchsNotBetween(String value1, String value2) {
            addCriterion("combo_pitchs not between", value1, value2, "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboTravelsIsNull() {
            addCriterion("combo_travels is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelsIsNotNull() {
            addCriterion("combo_travels is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelsEqualTo(String value) {
            addCriterion("combo_travels =", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsNotEqualTo(String value) {
            addCriterion("combo_travels <>", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsGreaterThan(String value) {
            addCriterion("combo_travels >", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsGreaterThanOrEqualTo(String value) {
            addCriterion("combo_travels >=", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsLessThan(String value) {
            addCriterion("combo_travels <", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsLessThanOrEqualTo(String value) {
            addCriterion("combo_travels <=", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsLike(String value) {
            addCriterion("combo_travels like", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsNotLike(String value) {
            addCriterion("combo_travels not like", value, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsIn(List<String> values) {
            addCriterion("combo_travels in", values, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsNotIn(List<String> values) {
            addCriterion("combo_travels not in", values, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsBetween(String value1, String value2) {
            addCriterion("combo_travels between", value1, value2, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelsNotBetween(String value1, String value2) {
            addCriterion("combo_travels not between", value1, value2, "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIsNull() {
            addCriterion("combo_travel_type_id is null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIsNotNull() {
            addCriterion("combo_travel_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdEqualTo(Integer value) {
            addCriterion("combo_travel_type_id =", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotEqualTo(Integer value) {
            addCriterion("combo_travel_type_id <>", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdGreaterThan(Integer value) {
            addCriterion("combo_travel_type_id >", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_type_id >=", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdLessThan(Integer value) {
            addCriterion("combo_travel_type_id <", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("combo_travel_type_id <=", value, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdIn(List<Integer> values) {
            addCriterion("combo_travel_type_id in", values, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotIn(List<Integer> values) {
            addCriterion("combo_travel_type_id not in", values, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_type_id between", value1, value2, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboTravelTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("combo_travel_type_id not between", value1, value2, "comboTravelTypeId");
            return (Criteria) this;
        }

        public Criteria andComboHeadIsNull() {
            addCriterion("combo_head is null");
            return (Criteria) this;
        }

        public Criteria andComboHeadIsNotNull() {
            addCriterion("combo_head is not null");
            return (Criteria) this;
        }

        public Criteria andComboHeadEqualTo(String value) {
            addCriterion("combo_head =", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadNotEqualTo(String value) {
            addCriterion("combo_head <>", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadGreaterThan(String value) {
            addCriterion("combo_head >", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadGreaterThanOrEqualTo(String value) {
            addCriterion("combo_head >=", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadLessThan(String value) {
            addCriterion("combo_head <", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadLessThanOrEqualTo(String value) {
            addCriterion("combo_head <=", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadLike(String value) {
            addCriterion("combo_head like", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadNotLike(String value) {
            addCriterion("combo_head not like", value, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadIn(List<String> values) {
            addCriterion("combo_head in", values, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadNotIn(List<String> values) {
            addCriterion("combo_head not in", values, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadBetween(String value1, String value2) {
            addCriterion("combo_head between", value1, value2, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboHeadNotBetween(String value1, String value2) {
            addCriterion("combo_head not between", value1, value2, "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboFootIsNull() {
            addCriterion("combo_foot is null");
            return (Criteria) this;
        }

        public Criteria andComboFootIsNotNull() {
            addCriterion("combo_foot is not null");
            return (Criteria) this;
        }

        public Criteria andComboFootEqualTo(String value) {
            addCriterion("combo_foot =", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootNotEqualTo(String value) {
            addCriterion("combo_foot <>", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootGreaterThan(String value) {
            addCriterion("combo_foot >", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootGreaterThanOrEqualTo(String value) {
            addCriterion("combo_foot >=", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootLessThan(String value) {
            addCriterion("combo_foot <", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootLessThanOrEqualTo(String value) {
            addCriterion("combo_foot <=", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootLike(String value) {
            addCriterion("combo_foot like", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootNotLike(String value) {
            addCriterion("combo_foot not like", value, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootIn(List<String> values) {
            addCriterion("combo_foot in", values, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootNotIn(List<String> values) {
            addCriterion("combo_foot not in", values, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootBetween(String value1, String value2) {
            addCriterion("combo_foot between", value1, value2, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboFootNotBetween(String value1, String value2) {
            addCriterion("combo_foot not between", value1, value2, "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleIsNull() {
            addCriterion("combo_intro_title is null");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleIsNotNull() {
            addCriterion("combo_intro_title is not null");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleEqualTo(String value) {
            addCriterion("combo_intro_title =", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleNotEqualTo(String value) {
            addCriterion("combo_intro_title <>", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleGreaterThan(String value) {
            addCriterion("combo_intro_title >", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleGreaterThanOrEqualTo(String value) {
            addCriterion("combo_intro_title >=", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleLessThan(String value) {
            addCriterion("combo_intro_title <", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleLessThanOrEqualTo(String value) {
            addCriterion("combo_intro_title <=", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleLike(String value) {
            addCriterion("combo_intro_title like", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleNotLike(String value) {
            addCriterion("combo_intro_title not like", value, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleIn(List<String> values) {
            addCriterion("combo_intro_title in", values, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleNotIn(List<String> values) {
            addCriterion("combo_intro_title not in", values, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleBetween(String value1, String value2) {
            addCriterion("combo_intro_title between", value1, value2, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleNotBetween(String value1, String value2) {
            addCriterion("combo_intro_title not between", value1, value2, "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonIsNull() {
            addCriterion("combo_intro_button is null");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonIsNotNull() {
            addCriterion("combo_intro_button is not null");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonEqualTo(String value) {
            addCriterion("combo_intro_button =", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonNotEqualTo(String value) {
            addCriterion("combo_intro_button <>", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonGreaterThan(String value) {
            addCriterion("combo_intro_button >", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonGreaterThanOrEqualTo(String value) {
            addCriterion("combo_intro_button >=", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonLessThan(String value) {
            addCriterion("combo_intro_button <", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonLessThanOrEqualTo(String value) {
            addCriterion("combo_intro_button <=", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonLike(String value) {
            addCriterion("combo_intro_button like", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonNotLike(String value) {
            addCriterion("combo_intro_button not like", value, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonIn(List<String> values) {
            addCriterion("combo_intro_button in", values, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonNotIn(List<String> values) {
            addCriterion("combo_intro_button not in", values, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonBetween(String value1, String value2) {
            addCriterion("combo_intro_button between", value1, value2, "comboIntroButton");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonNotBetween(String value1, String value2) {
            addCriterion("combo_intro_button not between", value1, value2, "comboIntroButton");
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

        public Criteria andIsShowEqualTo(Byte value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Byte value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Byte value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Byte value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Byte value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Byte> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Byte> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Byte value1, Byte value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andComboPriceIsNull() {
            addCriterion("combo_price is null");
            return (Criteria) this;
        }

        public Criteria andComboPriceIsNotNull() {
            addCriterion("combo_price is not null");
            return (Criteria) this;
        }

        public Criteria andComboPriceEqualTo(BigDecimal value) {
            addCriterion("combo_price =", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceNotEqualTo(BigDecimal value) {
            addCriterion("combo_price <>", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceGreaterThan(BigDecimal value) {
            addCriterion("combo_price >", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("combo_price >=", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceLessThan(BigDecimal value) {
            addCriterion("combo_price <", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("combo_price <=", value, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceIn(List<BigDecimal> values) {
            addCriterion("combo_price in", values, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceNotIn(List<BigDecimal> values) {
            addCriterion("combo_price not in", values, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("combo_price between", value1, value2, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andComboPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("combo_price not between", value1, value2, "comboPrice");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Short value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Short value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Short value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Short value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Short value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Short> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Short> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Short value1, Short value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Short value1, Short value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andComboNameLikeInsensitive(String value) {
            addCriterion("upper(combo_name) like", value.toUpperCase(), "comboName");
            return (Criteria) this;
        }

        public Criteria andComboTitleLikeInsensitive(String value) {
            addCriterion("upper(combo_title) like", value.toUpperCase(), "comboTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroLikeInsensitive(String value) {
            addCriterion("upper(combo_intro) like", value.toUpperCase(), "comboIntro");
            return (Criteria) this;
        }

        public Criteria andComboLogoLikeInsensitive(String value) {
            addCriterion("upper(combo_logo) like", value.toUpperCase(), "comboLogo");
            return (Criteria) this;
        }

        public Criteria andComboImgLikeInsensitive(String value) {
            addCriterion("upper(combo_img) like", value.toUpperCase(), "comboImg");
            return (Criteria) this;
        }

        public Criteria andComboColorLikeInsensitive(String value) {
            addCriterion("upper(combo_color) like", value.toUpperCase(), "comboColor");
            return (Criteria) this;
        }

        public Criteria andComboPitchsLikeInsensitive(String value) {
            addCriterion("upper(combo_pitchs) like", value.toUpperCase(), "comboPitchs");
            return (Criteria) this;
        }

        public Criteria andComboTravelsLikeInsensitive(String value) {
            addCriterion("upper(combo_travels) like", value.toUpperCase(), "comboTravels");
            return (Criteria) this;
        }

        public Criteria andComboHeadLikeInsensitive(String value) {
            addCriterion("upper(combo_head) like", value.toUpperCase(), "comboHead");
            return (Criteria) this;
        }

        public Criteria andComboFootLikeInsensitive(String value) {
            addCriterion("upper(combo_foot) like", value.toUpperCase(), "comboFoot");
            return (Criteria) this;
        }

        public Criteria andComboIntroTitleLikeInsensitive(String value) {
            addCriterion("upper(combo_intro_title) like", value.toUpperCase(), "comboIntroTitle");
            return (Criteria) this;
        }

        public Criteria andComboIntroButtonLikeInsensitive(String value) {
            addCriterion("upper(combo_intro_button) like", value.toUpperCase(), "comboIntroButton");
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