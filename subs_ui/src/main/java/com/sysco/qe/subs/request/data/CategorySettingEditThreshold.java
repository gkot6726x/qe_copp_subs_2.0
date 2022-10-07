package com.sysco.qe.subs.request.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.syscolab.qe.core.api.request.RequestBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "opcoId",
        "modificationType",
        "note",
        "autoRejectThresh",
        "autoApproveThresh"
})
public class CategorySettingEditThreshold extends RequestBase {

    @JsonProperty("opcoId")
    private String opcoId;
    @JsonProperty("modificationType")
    private String modificationType;
    @JsonProperty("note")
    private String note;
    @JsonProperty("autoRejectThresh")
    private String autoRejectThresh;
    @JsonProperty("autoApproveThresh")
    private String autoApproveThresh;

    /**
     * No args constructor for use in serialization
     *
     */
    public CategorySettingEditThreshold() {
    }

    /**
     *
     * @param note
     * @param autoApproveThresh
     * @param modificationType
     * @param autoRejectThresh
     * @param opcoId
     */
    public CategorySettingEditThreshold(String opcoId, String modificationType, String note, String autoRejectThresh, String autoApproveThresh) {
        super();
        this.opcoId = opcoId;
        this.modificationType = modificationType;
        this.note = note;
        this.autoRejectThresh = autoRejectThresh;
        this.autoApproveThresh = autoApproveThresh;
    }

    @JsonProperty("opcoId")
    public String getOpcoId() {
        return opcoId;
    }

    @JsonProperty("opcoId")
    public void setOpcoId(String opcoId) {
        this.opcoId = opcoId;
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

    @JsonProperty("autoRejectThresh")
    public String getAutoRejectThresh() {
        return autoRejectThresh;
    }

    @JsonProperty("autoRejectThresh")
    public void setAutoRejectThresh(String autoRejectThresh) {
        this.autoRejectThresh = autoRejectThresh;
    }

    @JsonProperty("autoApproveThresh")
    public String getAutoApproveThresh() {
        return autoApproveThresh;
    }

    @JsonProperty("autoApproveThresh")
    public void setAutoApproveThresh(String autoApproveThresh) {
        this.autoApproveThresh = autoApproveThresh;
    }

}
