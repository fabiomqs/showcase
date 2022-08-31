package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartnerAttributes {

    @JsonProperty("sponsored")
    private boolean sponsored;
    @JsonProperty("redirect_apply")
    private String redirectApply;
    @JsonProperty("utm_medium")
    private String utmMedium;
    @JsonProperty("utm_campaign")
    private String utmCampaign;
    @JsonProperty("keyword")
    private String keyword;
    @JsonProperty("search_fetch_id")
    private String searchFetchId;
    @JsonProperty("page")
    private int page;
    @JsonProperty("order")
    private int order;
    @JsonProperty("city_center")
    private String cityCenter;
    @JsonProperty("utm_source")
    private String utmSource;
    @JsonProperty("source")
    private String source;

    public boolean isSponsored() {
        return sponsored;
    }

    public void setSponsored(boolean sponsored) {
        this.sponsored = sponsored;
    }

    public String getRedirectApply() {
        return redirectApply;
    }

    public void setRedirectApply(String redirectApply) {
        this.redirectApply = redirectApply;
    }

    public String getUtmMedium() {
        return utmMedium;
    }

    public void setUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
    }

    public String getUtmCampaign() {
        return utmCampaign;
    }

    public void setUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSearchFetchId() {
        return searchFetchId;
    }

    public void setSearchFetchId(String searchFetchId) {
        this.searchFetchId = searchFetchId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getCityCenter() {
        return cityCenter;
    }

    public void setCityCenter(String cityCenter) {
        this.cityCenter = cityCenter;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
