
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
    "url",
    "name"
})
public class SocialLink {

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
    @JsonProperty("url")
    @JsonPropertyDescription("")
    private String url;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;

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
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
