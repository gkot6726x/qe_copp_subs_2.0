package com.sysco.qe.subs.request.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.syscolab.qe.core.api.request.RequestBase;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "opcos",
        "categoryId",
        "categoryType",
        "modificationType",
        "margin",
        "priceZone"
})
public class CategoryRenewalMarginSetting extends RequestBase {

    @JsonProperty("opcos")
    private List<String> opcos;
    @JsonProperty("categoryId")
    private String categoryId;
    @JsonProperty("categoryType")
    private String categoryType;
    @JsonProperty("modificationType")
    private String modificationType;
    @JsonProperty("margin")
    private Double margin;
    @JsonProperty("priceZone")
    private String priceZone;

    /**
     * @param categoryType
     * @param margin
     * @param modificationType
     * @param opcos
     * @param categoryId
     */
    public CategoryRenewalMarginSetting(List<String> opcos, String categoryId, String categoryType, String modificationType, Double margin, String priceZone) {
        super();
        this.opcos = opcos;
        this.categoryId = categoryId;
        this.categoryType = categoryType;
        this.modificationType = modificationType;
        this.margin = margin;
        this.priceZone = priceZone;
    }


    @JsonProperty("opcos")
    public List<String> getOpcos() {
        return opcos;
    }

    @JsonProperty("opcos")
    public void setOpcos(List<String> opcos) {
        this.opcos = opcos;
    }

    @JsonProperty("categoryId")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("categoryId")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("categoryType")
    public String getCategoryType() {
        return categoryType;
    }

    @JsonProperty("categoryType")
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @JsonProperty("modificationType")
    public String getModificationType() {
        return modificationType;
    }

    @JsonProperty("modificationType")
    public void setModificationType(String modificationType) {
        this.modificationType = modificationType;
    }

    @JsonProperty("margin")
    public Double getMargin() {
        return margin;
    }

    @JsonProperty("margin")
    public void setMargin(Double margin) {
        this.margin = margin;
    }

    @JsonProperty("priceZone")
    public void getPriceZone(String priceZone) {
        this.priceZone = priceZone;
    }

    @JsonProperty("priceZone")
    public void setPriceZone(String priceZone) {
        this.priceZone = priceZone;
    }
}

