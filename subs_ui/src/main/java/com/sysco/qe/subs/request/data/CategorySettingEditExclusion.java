package com.sysco.qe.subs.request.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.syscolab.qe.core.api.request.RequestBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "opcoId",
        "modificationType",
        "note"
})
public class CategorySettingEditExclusion extends RequestBase {

    @JsonProperty("opcoId")
    private String opcoId;
    @JsonProperty("modificationType")
    private String modificationType;
    @JsonProperty("note")
    private String note;

    /**
     * No args constructor for use in serialization
     *
     */
    public CategorySettingEditExclusion() {
    }

    /**
     *
     * @param note
     * @param modificationType
     * @param opcoId
     */
    public CategorySettingEditExclusion(String opcoId, String modificationType, String note) {
        super();
        this.opcoId = opcoId;
        this.modificationType = modificationType;
        this.note = note;
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

}