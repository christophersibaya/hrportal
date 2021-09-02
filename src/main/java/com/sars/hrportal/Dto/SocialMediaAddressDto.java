package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialMediaAddressDto {

    private Long employee_id;
    private String twitter;
    private String instagram;
    private String facebook;

    public SocialMediaAddressDto() {
    }

    public SocialMediaAddressDto(Long employee_id, String twitter, String instagram, String facebook) {
        this.employee_id = employee_id;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
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
                "employee_id=" + employee_id +
                ", twitter='" + twitter + '\'' +
                ", instagram='" + instagram + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }
}
