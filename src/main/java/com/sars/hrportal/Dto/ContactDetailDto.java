package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailDto {

    private Long employee_id;
    private String landLine;
    private String mobile;
    private String email;

    public ContactDetailDto() {
    }

    public ContactDetailDto(Long employee_id, String landLine, String mobile, String email) {
        this.employee_id = employee_id;
        this.landLine = landLine;
        this.mobile = mobile;
        this.email = email;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetailDto{" +
                "employee_id=" + employee_id +
                ", landLine='" + landLine + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
