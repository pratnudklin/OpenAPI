
package th.co.integrationworks.octobus.controller.bom.v1.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address1",
    "address2",
    "address3",
    "country",
    "postCode",
    "district",
    "city",
    "name",
    "bp_id",
    "address_id"
})
public class Address {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("")
    private String address1;
    /**
     * 
     * 
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("")
    private String address2;
    /**
     * 
     * 
     */
    @JsonProperty("address3")
    @JsonPropertyDescription("")
    private String address3;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postCode")
    @JsonPropertyDescription("")
    private String postCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("district")
    @JsonPropertyDescription("")
    private String district;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("")
    private String city;
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
    @JsonPropertyDescription("")
    private String bpId;
    /**
     * 
     * 
     */
    @JsonProperty("address_id")
    @JsonPropertyDescription("")
    private String addressId;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * 
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     * 
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 
     * 
     */
    @JsonProperty("address3")
    public String getAddress3() {
        return address3;
    }

    /**
     * 
     * 
     */
    @JsonProperty("address3")
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
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
     * 
     */
    @JsonProperty("address_id")
    public String getAddressId() {
        return addressId;
    }

    /**
     * 
     * 
     */
    @JsonProperty("address_id")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

}
