
package th.co.integrationworks.octobus.controller.bom.v1.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bp_id",
    "timeZone",
    "lang",
    "dateFormat",
    "timeFormat",
    "numberFormat"
})
public class RegionalInfo {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_id")
    @JsonPropertyDescription("")
    private String bpId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeZone")
    @JsonPropertyDescription("")
    private String timeZone;
    /**
     * 
     * 
     */
    @JsonProperty("lang")
    @JsonPropertyDescription("")
    private String lang;
    /**
     * 
     * 
     */
    @JsonProperty("dateFormat")
    @JsonPropertyDescription("")
    private String dateFormat;
    /**
     * 
     * 
     */
    @JsonProperty("timeFormat")
    @JsonPropertyDescription("")
    private String timeFormat;
    /**
     * 
     * 
     */
    @JsonProperty("numberFormat")
    @JsonPropertyDescription("")
    private String numberFormat;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_id")
    public String getBpId() {
        return bpId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_id")
    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * 
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * 
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * 
     */
    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 
     * 
     */
    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * 
     * 
     */
    @JsonProperty("timeFormat")
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * 
     * 
     */
    @JsonProperty("timeFormat")
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * 
     * 
     */
    @JsonProperty("numberFormat")
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * 
     * 
     */
    @JsonProperty("numberFormat")
    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

}
