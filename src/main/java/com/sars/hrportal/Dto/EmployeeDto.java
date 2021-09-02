package com.sars.hrportal.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.lang.Nullable;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class EmployeeDto {

    private Long id;
    private String employeeNumber;
    private String firstName;
    private String lastName;

    private AddressDto address;

    private ContactDetailDto contactDetails;

    private SocialMediaAddressDto socialMediaAddress;


    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String employeeNumber,String firstName, String lastName, AddressDto address, ContactDetailDto contactDetails, SocialMediaAddressDto socialMediaAddress) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactDetails = contactDetails;
        this.socialMediaAddress = socialMediaAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public ContactDetailDto getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailDto contactDetails) {
        this.contactDetails = contactDetails;
    }

    public SocialMediaAddressDto getSocialMediaAddress() {
        return socialMediaAddress;
    }

    public void setSocialMediaAddress(SocialMediaAddressDto socialMediaAddress) {
        this.socialMediaAddress = socialMediaAddress;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", contactDetails=" + contactDetails +
                ", socialMediaAddress=" + socialMediaAddress +
                '}';
    }
}
