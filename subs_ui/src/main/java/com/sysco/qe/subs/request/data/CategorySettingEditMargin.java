package com.sysco.qe.subs.request.data;

import com.fasterxml.jackson.annotation.*;
import com.syscolab.qe.core.api.request.RequestBase;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "opcoId",
        "modificationType",
        "margin"
})
public class CategorySettingEditMargin extends RequestBase {

    @JsonProperty("opcoId")
    private String opcoId;
    @JsonProperty("modificationType")
    private String modificationType;
    @JsonProperty("margin")
    private String margin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CategorySettingEditMargin() {
    }

    /**
     *
     * @param margin
     * @param modificationType
     * @param opcoId
     */
    public CategorySettingEditMargin(String opcoId, String modificationType, String margin) {
        super();
        this.opcoId = opcoId;
        this.modificationType = modificationType;
        this.margin = margin;
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

    @JsonProperty("margin")
    public String getMargin() {
        return margin;
    }

    @JsonProperty("margin")
    public void setMargin(String margin) {
        this.margin = margin;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}