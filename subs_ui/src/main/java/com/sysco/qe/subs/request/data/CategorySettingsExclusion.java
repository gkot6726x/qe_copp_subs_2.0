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
        "note",
        "priceZone"
})
public class CategorySettingsExclusion extends RequestBase {

    @JsonProperty("opcos")
    private List<String> opcos = null;
    @JsonProperty("categoryId")
    private String categoryId;
    @JsonProperty("categoryType")
    private String categoryType;
    @JsonProperty("modificationType")
    private String modificationType;
    @JsonProperty("note")
    private String note;
    @JsonProperty("priceZone")
    private String priceZone;

    /**
     * No args constructor for use in serialization
     *
     */
    public CategorySettingsExclusion() {
    }

    /**
     *
     * @param categoryType
     * @param note
     * @param opcos
     * @param modificationType
     * @param categoryId
     * @param priceZone
     */
    public CategorySettingsExclusion(List<String> opcos, String categoryId, String categoryType, String modificationType, String note, String priceZone) {
        super();
        this.opcos = opcos;
        this.categoryId = categoryId;
        this.categoryType = categoryType;
        this.modificationType = modificationType;
        this.note = note;
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

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    public String getPriceZone() {
        return priceZone;
    }

    public void setPriceZone(String priceZone) {
        this.priceZone = priceZone;
    }
}
