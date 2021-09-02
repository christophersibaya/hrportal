package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialMediaAddressDto {

    @JsonProperty("employee_id")
    private Long employeeId;
    private String twitter;
    private String instagram;
    private String facebook;

    public SocialMediaAddressDto() {
    }

    public SocialMediaAddressDto(Long employeeId, String twitter, String instagram, String facebook) {
        this.employeeId = employeeId;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "SocialMediaAddressDto{" +
                "employee_id=" + employeeId +
                ", twitter='" + twitter + '\'' +
                ", instagram='" + instagram + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }
}
