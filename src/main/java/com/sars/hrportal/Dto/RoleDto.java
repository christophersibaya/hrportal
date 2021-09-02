package com.sars.hrportal.Dto;

import com.sars.hrportal.enumeration.EnumRole;

public class RoleDto {

    private Long id;
    private EnumRole role;

    public RoleDto() {
    }

    public RoleDto(long id, EnumRole role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }

}
