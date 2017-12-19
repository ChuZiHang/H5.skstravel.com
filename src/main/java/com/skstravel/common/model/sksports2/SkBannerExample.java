package com.skstravel.common.model.sksports2;

import com.skstravel.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SkBannerExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public SkBannerExample() {
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(Integer value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(Integer value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(Integer value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(Integer value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<Integer> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<Integer> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(Integer value1, Integer value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMaxTitleIsNull() {
            addCriterion("max_title is null");
            return (Criteria) this;
        }

        public Criteria andMaxTitleIsNotNull() {
            addCriterion("max_title is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTitleEqualTo(String value) {
            addCriterion("max_title =", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleNotEqualTo(String value) {
            addCriterion("max_title <>", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleGreaterThan(String value) {
            addCriterion("max_title >", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleGreaterThanOrEqualTo(String value) {
            addCriterion("max_title >=", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleLessThan(String value) {
            addCriterion("max_title <", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleLessThanOrEqualTo(String value) {
            addCriterion("max_title <=", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleLike(String value) {
            addCriterion("max_title like", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleNotLike(String value) {
            addCriterion("max_title not like", value, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleIn(List<String> values) {
            addCriterion("max_title in", values, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleNotIn(List<String> values) {
            addCriterion("max_title not in", values, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleBetween(String value1, String value2) {
            addCriterion("max_title between", value1, value2, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMaxTitleNotBetween(String value1, String value2) {
            addCriterion("max_title not between", value1, value2, "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleIsNull() {
            addCriterion("min_title is null");
            return (Criteria) this;
        }

        public Criteria andMinTitleIsNotNull() {
            addCriterion("min_title is not null");
            return (Criteria) this;
        }

        public Criteria andMinTitleEqualTo(String value) {
            addCriterion("min_title =", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleNotEqualTo(String value) {
            addCriterion("min_title <>", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleGreaterThan(String value) {
            addCriterion("min_title >", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleGreaterThanOrEqualTo(String value) {
            addCriterion("min_title >=", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleLessThan(String value) {
            addCriterion("min_title <", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleLessThanOrEqualTo(String value) {
            addCriterion("min_title <=", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleLike(String value) {
            addCriterion("min_title like", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleNotLike(String value) {
            addCriterion("min_title not like", value, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleIn(List<String> values) {
            addCriterion("min_title in", values, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleNotIn(List<String> values) {
            addCriterion("min_title not in", values, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleBetween(String value1, String value2) {
            addCriterion("min_title between", value1, value2, "minTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleNotBetween(String value1, String value2) {
            addCriterion("min_title not between", value1, value2, "minTitle");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andVideoLinkIsNull() {
            addCriterion("video_link is null");
            return (Criteria) this;
        }

        public Criteria andVideoLinkIsNotNull() {
            addCriterion("video_link is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLinkEqualTo(String value) {
            addCriterion("video_link =", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkNotEqualTo(String value) {
            addCriterion("video_link <>", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkGreaterThan(String value) {
            addCriterion("video_link >", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkGreaterThanOrEqualTo(String value) {
            addCriterion("video_link >=", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkLessThan(String value) {
            addCriterion("video_link <", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkLessThanOrEqualTo(String value) {
            addCriterion("video_link <=", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkLike(String value) {
            addCriterion("video_link like", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkNotLike(String value) {
            addCriterion("video_link not like", value, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkIn(List<String> values) {
            addCriterion("video_link in", values, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkNotIn(List<String> values) {
            addCriterion("video_link not in", values, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkBetween(String value1, String value2) {
            addCriterion("video_link between", value1, value2, "videoLink");
            return (Criteria) this;
        }

        public Criteria andVideoLinkNotBetween(String value1, String value2) {
            addCriterion("video_link not between", value1, value2, "videoLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkIsNull() {
            addCriterion("mobile_link is null");
            return (Criteria) this;
        }

        public Criteria andMobileLinkIsNotNull() {
            addCriterion("mobile_link is not null");
            return (Criteria) this;
        }

        public Criteria andMobileLinkEqualTo(String value) {
            addCriterion("mobile_link =", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkNotEqualTo(String value) {
            addCriterion("mobile_link <>", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkGreaterThan(String value) {
            addCriterion("mobile_link >", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_link >=", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkLessThan(String value) {
            addCriterion("mobile_link <", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkLessThanOrEqualTo(String value) {
            addCriterion("mobile_link <=", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkLike(String value) {
            addCriterion("mobile_link like", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkNotLike(String value) {
            addCriterion("mobile_link not like", value, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkIn(List<String> values) {
            addCriterion("mobile_link in", values, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkNotIn(List<String> values) {
            addCriterion("mobile_link not in", values, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkBetween(String value1, String value2) {
            addCriterion("mobile_link between", value1, value2, "mobileLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkNotBetween(String value1, String value2) {
            addCriterion("mobile_link not between", value1, value2, "mobileLink");
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

        public Criteria andImgUrlLikeInsensitive(String value) {
            addCriterion("upper(img_url) like", value.toUpperCase(), "imgUrl");
            return (Criteria) this;
        }

        public Criteria andMaxTitleLikeInsensitive(String value) {
            addCriterion("upper(max_title) like", value.toUpperCase(), "maxTitle");
            return (Criteria) this;
        }

        public Criteria andMinTitleLikeInsensitive(String value) {
            addCriterion("upper(min_title) like", value.toUpperCase(), "minTitle");
            return (Criteria) this;
        }

        public Criteria andLinkLikeInsensitive(String value) {
            addCriterion("upper(link) like", value.toUpperCase(), "link");
            return (Criteria) this;
        }

        public Criteria andVideoLinkLikeInsensitive(String value) {
            addCriterion("upper(video_link) like", value.toUpperCase(), "videoLink");
            return (Criteria) this;
        }

        public Criteria andMobileLinkLikeInsensitive(String value) {
            addCriterion("upper(mobile_link) like", value.toUpperCase(), "mobileLink");
            return (Criteria) this;
        }

        public Criteria andNotesLikeInsensitive(String value) {
            addCriterion("upper(notes) like", value.toUpperCase(), "notes");
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