package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailDto {

    @JsonProperty("employee_id")
    private Long employeeId;
    private String landLine;
    private String mobile;
    private String email;

    public ContactDetailDto() {
    }

    public ContactDetailDto(Long employeeId, String landLine, String mobile, String email) {
        this.employeeId = employeeId;
        this.landLine = landLine;
        this.mobile = mobile;
        this.email = email;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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
                "employee_id=" + employeeId +
                ", landLine='" + landLine + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
