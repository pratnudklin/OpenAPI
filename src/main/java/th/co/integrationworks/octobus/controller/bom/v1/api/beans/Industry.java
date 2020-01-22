
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
    "industry_id",
    "industry_name"
})
public class Industry {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_id")
    @JsonPropertyDescription("")
    private String industryId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_name")
    @JsonPropertyDescription("")
    private String industryName;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_id")
    public String getIndustryId() {
        return industryId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_id")
    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_name")
    public String getIndustryName() {
        return industryName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("industry_name")
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

}
