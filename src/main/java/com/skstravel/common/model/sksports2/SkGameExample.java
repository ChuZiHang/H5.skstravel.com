package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkGameExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkGameExample() {
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

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Integer value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Integer value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Integer value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Integer value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Integer> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Integer> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andGameImgIsNull() {
            addCriterion("game_img is null");
            return (Criteria) this;
        }

        public Criteria andGameImgIsNotNull() {
            addCriterion("game_img is not null");
            return (Criteria) this;
        }

        public Criteria andGameImgEqualTo(String value) {
            addCriterion("game_img =", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgNotEqualTo(String value) {
            addCriterion("game_img <>", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgGreaterThan(String value) {
            addCriterion("game_img >", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgGreaterThanOrEqualTo(String value) {
            addCriterion("game_img >=", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgLessThan(String value) {
            addCriterion("game_img <", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgLessThanOrEqualTo(String value) {
            addCriterion("game_img <=", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgLike(String value) {
            addCriterion("game_img like", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgNotLike(String value) {
            addCriterion("game_img not like", value, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgIn(List<String> values) {
            addCriterion("game_img in", values, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgNotIn(List<String> values) {
            addCriterion("game_img not in", values, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgBetween(String value1, String value2) {
            addCriterion("game_img between", value1, value2, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameImgNotBetween(String value1, String value2) {
            addCriterion("game_img not between", value1, value2, "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameLogoIsNull() {
            addCriterion("game_logo is null");
            return (Criteria) this;
        }

        public Criteria andGameLogoIsNotNull() {
            addCriterion("game_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGameLogoEqualTo(String value) {
            addCriterion("game_logo =", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoNotEqualTo(String value) {
            addCriterion("game_logo <>", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoGreaterThan(String value) {
            addCriterion("game_logo >", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoGreaterThanOrEqualTo(String value) {
            addCriterion("game_logo >=", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoLessThan(String value) {
            addCriterion("game_logo <", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoLessThanOrEqualTo(String value) {
            addCriterion("game_logo <=", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoLike(String value) {
            addCriterion("game_logo like", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoNotLike(String value) {
            addCriterion("game_logo not like", value, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoIn(List<String> values) {
            addCriterion("game_logo in", values, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoNotIn(List<String> values) {
            addCriterion("game_logo not in", values, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoBetween(String value1, String value2) {
            addCriterion("game_logo between", value1, value2, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameLogoNotBetween(String value1, String value2) {
            addCriterion("game_logo not between", value1, value2, "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoIsNull() {
            addCriterion("game_sealogo is null");
            return (Criteria) this;
        }

        public Criteria andGameSealogoIsNotNull() {
            addCriterion("game_sealogo is not null");
            return (Criteria) this;
        }

        public Criteria andGameSealogoEqualTo(String value) {
            addCriterion("game_sealogo =", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoNotEqualTo(String value) {
            addCriterion("game_sealogo <>", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoGreaterThan(String value) {
            addCriterion("game_sealogo >", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoGreaterThanOrEqualTo(String value) {
            addCriterion("game_sealogo >=", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoLessThan(String value) {
            addCriterion("game_sealogo <", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoLessThanOrEqualTo(String value) {
            addCriterion("game_sealogo <=", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoLike(String value) {
            addCriterion("game_sealogo like", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoNotLike(String value) {
            addCriterion("game_sealogo not like", value, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoIn(List<String> values) {
            addCriterion("game_sealogo in", values, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoNotIn(List<String> values) {
            addCriterion("game_sealogo not in", values, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoBetween(String value1, String value2) {
            addCriterion("game_sealogo between", value1, value2, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoNotBetween(String value1, String value2) {
            addCriterion("game_sealogo not between", value1, value2, "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andGameIntroIsNull() {
            addCriterion("game_intro is null");
            return (Criteria) this;
        }

        public Criteria andGameIntroIsNotNull() {
            addCriterion("game_intro is not null");
            return (Criteria) this;
        }

        public Criteria andGameIntroEqualTo(String value) {
            addCriterion("game_intro =", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroNotEqualTo(String value) {
            addCriterion("game_intro <>", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroGreaterThan(String value) {
            addCriterion("game_intro >", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroGreaterThanOrEqualTo(String value) {
            addCriterion("game_intro >=", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroLessThan(String value) {
            addCriterion("game_intro <", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroLessThanOrEqualTo(String value) {
            addCriterion("game_intro <=", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroLike(String value) {
            addCriterion("game_intro like", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroNotLike(String value) {
            addCriterion("game_intro not like", value, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroIn(List<String> values) {
            addCriterion("game_intro in", values, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroNotIn(List<String> values) {
            addCriterion("game_intro not in", values, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroBetween(String value1, String value2) {
            addCriterion("game_intro between", value1, value2, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andGameIntroNotBetween(String value1, String value2) {
            addCriterion("game_intro not between", value1, value2, "gameIntro");
            return (Criteria) this;
        }

        public Criteria andIsTypeIsNull() {
            addCriterion("is_type is null");
            return (Criteria) this;
        }

        public Criteria andIsTypeIsNotNull() {
            addCriterion("is_type is not null");
            return (Criteria) this;
        }

        public Criteria andIsTypeEqualTo(Integer value) {
            addCriterion("is_type =", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeNotEqualTo(Integer value) {
            addCriterion("is_type <>", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeGreaterThan(Integer value) {
            addCriterion("is_type >", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_type >=", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeLessThan(Integer value) {
            addCriterion("is_type <", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("is_type <=", value, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeIn(List<Integer> values) {
            addCriterion("is_type in", values, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeNotIn(List<Integer> values) {
            addCriterion("is_type not in", values, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeBetween(Integer value1, Integer value2) {
            addCriterion("is_type between", value1, value2, "isType");
            return (Criteria) this;
        }

        public Criteria andIsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_type not between", value1, value2, "isType");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIsNull() {
            addCriterion("is_insurance is null");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIsNotNull() {
            addCriterion("is_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceEqualTo(Byte value) {
            addCriterion("is_insurance =", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotEqualTo(Byte value) {
            addCriterion("is_insurance <>", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceGreaterThan(Byte value) {
            addCriterion("is_insurance >", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_insurance >=", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLessThan(Byte value) {
            addCriterion("is_insurance <", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLessThanOrEqualTo(Byte value) {
            addCriterion("is_insurance <=", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIn(List<Byte> values) {
            addCriterion("is_insurance in", values, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotIn(List<Byte> values) {
            addCriterion("is_insurance not in", values, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceBetween(Byte value1, Byte value2) {
            addCriterion("is_insurance between", value1, value2, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_insurance not between", value1, value2, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andScatIdIsNull() {
            addCriterion("scat_id is null");
            return (Criteria) this;
        }

        public Criteria andScatIdIsNotNull() {
            addCriterion("scat_id is not null");
            return (Criteria) this;
        }

        public Criteria andScatIdEqualTo(Integer value) {
            addCriterion("scat_id =", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdNotEqualTo(Integer value) {
            addCriterion("scat_id <>", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdGreaterThan(Integer value) {
            addCriterion("scat_id >", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scat_id >=", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdLessThan(Integer value) {
            addCriterion("scat_id <", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdLessThanOrEqualTo(Integer value) {
            addCriterion("scat_id <=", value, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdIn(List<Integer> values) {
            addCriterion("scat_id in", values, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdNotIn(List<Integer> values) {
            addCriterion("scat_id not in", values, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdBetween(Integer value1, Integer value2) {
            addCriterion("scat_id between", value1, value2, "scatId");
            return (Criteria) this;
        }

        public Criteria andScatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scat_id not between", value1, value2, "scatId");
            return (Criteria) this;
        }

        public Criteria andGameNameLikeInsensitive(String value) {
            addCriterion("upper(game_name) like", value.toUpperCase(), "gameName");
            return (Criteria) this;
        }

        public Criteria andGameImgLikeInsensitive(String value) {
            addCriterion("upper(game_img) like", value.toUpperCase(), "gameImg");
            return (Criteria) this;
        }

        public Criteria andGameLogoLikeInsensitive(String value) {
            addCriterion("upper(game_logo) like", value.toUpperCase(), "gameLogo");
            return (Criteria) this;
        }

        public Criteria andGameSealogoLikeInsensitive(String value) {
            addCriterion("upper(game_sealogo) like", value.toUpperCase(), "gameSealogo");
            return (Criteria) this;
        }

        public Criteria andTemplateLikeInsensitive(String value) {
            addCriterion("upper(template) like", value.toUpperCase(), "template");
            return (Criteria) this;
        }

        public Criteria andGameIntroLikeInsensitive(String value) {
            addCriterion("upper(game_intro) like", value.toUpperCase(), "gameIntro");
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