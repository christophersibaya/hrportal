package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

    private Long employee_id;
    private String residential;
    private String postal;

    public AddressDto() {
    }

    public AddressDto(Long employee_id, String residential, String postal) {
        this.employee_id = employee_id;
        this.residential = residential;
        this.postal = postal;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
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
                "employee_id=" + employee_id +
                ", residential='" + residential + '\'' +
                ", postal='" + postal + '\'' +
                '}';
    }
}
