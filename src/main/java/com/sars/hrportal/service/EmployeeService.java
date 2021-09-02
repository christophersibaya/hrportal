package com.sars.hrportal.service;

import com.sars.hrportal.Dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeDto> getAllEmployees();
    public String saveEmployee(String employeeDto);
    public String deleteEmployee(long id);
}
