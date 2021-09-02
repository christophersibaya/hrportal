package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

    @JsonProperty("employee_id")
    private Long employeeId;
    private String residential;
    private String postal;

    public AddressDto() {
    }

    public AddressDto(Long employeeId, String residential, String postal) {
        this.employeeId = employeeId;
        this.residential = residential;
        this.postal = postal;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getResidential() {
        return residential;
    }

    public void setResidential(String residential) {
        this.residential = residential;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "employee_id=" + employeeId +
                ", residential='" + residential + '\'' +
                ", postal='" + postal + '\'' +
                '}';
    }
}
