
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
    "firstName",
    "lastName",
    "email",
    "telephone",
    "position",
    "contact_id",
    "bp_id"
})
public class ContactPerson {

    /**
     * 
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("")
    private String firstName;
    /**
     * 
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("")
    private String lastName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("")
    private String email;
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
    @JsonProperty("position")
    @JsonPropertyDescription("")
    private String position;
    /**
     * 
     * 
     */
    @JsonProperty("contact_id")
    @JsonPropertyDescription("")
    private String contactId;
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
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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
    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    /**
     * 
     * 
     */
    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 
     * 
     */
    @JsonProperty("contact_id")
    public String getContactId() {
        return contactId;
    }

    /**
     * 
     * 
     */
    @JsonProperty("contact_id")
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

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

}
