
package th.co.integrationworks.octobus.controller.bom.v1.api.beans;

import java.util.ArrayList;
import java.util.List;
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
    "displayName",
    "description",
    "Industrys"
})
public class GeneralInfo {

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
    @JsonProperty("displayName")
    @JsonPropertyDescription("")
    private String displayName;
    /**
     * 
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("")
    private String description;
    /**
     * 
     * 
     */
    @JsonProperty("Industrys")
    @JsonPropertyDescription("")
    private List<Industry> industrys = new ArrayList<Industry>();

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
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * 
     */
    @JsonProperty("Industrys")
    public List<Industry> getIndustrys() {
        return industrys;
    }

    /**
     * 
     * 
     */
    @JsonProperty("Industrys")
    public void setIndustrys(List<Industry> industrys) {
        this.industrys = industrys;
    }

}
