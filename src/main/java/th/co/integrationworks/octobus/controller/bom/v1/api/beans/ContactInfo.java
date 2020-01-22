
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
    "bp_ip",
    "mail",
    "telephone",
    "web",
    "socialLinks"
})
public class ContactInfo {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_ip")
    @JsonPropertyDescription("")
    private String bpIp;
    /**
     * 
     * 
     */
    @JsonProperty("mail")
    @JsonPropertyDescription("")
    private String mail;
    /**
     * 
     * 
     */
    @JsonProperty("telephone")
    @JsonPropertyDescription("")
    private String telephone;
    /**
     * 
     * 
     */
    @JsonProperty("web")
    @JsonPropertyDescription("")
    private String web;
    /**
     * 
     * 
     */
    @JsonProperty("socialLinks")
    @JsonPropertyDescription("")
    private List<SocialLink> socialLinks = new ArrayList<SocialLink>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_ip")
    public String getBpIp() {
        return bpIp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bp_ip")
    public void setBpIp(String bpIp) {
        this.bpIp = bpIp;
    }

    /**
     * 
     * 
     */
    @JsonProperty("mail")
    public String getMail() {
        return mail;
    }

    /**
     * 
     * 
     */
    @JsonProperty("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 
     * 
     */
    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    /**
     * 
     * 
     */
    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 
     * 
     */
    @JsonProperty("web")
    public String getWeb() {
        return web;
    }

    /**
     * 
     * 
     */
    @JsonProperty("web")
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * 
     * 
     */
    @JsonProperty("socialLinks")
    public List<SocialLink> getSocialLinks() {
        return socialLinks;
    }

    /**
     * 
     * 
     */
    @JsonProperty("socialLinks")
    public void setSocialLinks(List<SocialLink> socialLinks) {
        this.socialLinks = socialLinks;
    }

}
