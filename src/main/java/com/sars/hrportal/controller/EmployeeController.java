package com.sars.hrportal.controller;

import com.sars.hrportal.Dto.EmployeeDto;
import com.sars.hrportal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = {"/","/home","index"})
    public String main(Model model) {

        model.addAttribute("employeeList", employeeService.getAllEmployees());

        return "index";
    }

    @GetMapping("/add")
    public String addEmployee(Model model) {

        model.addAttribute("newEmployee", new EmployeeDto());

        return "add-employee";
    }

    @GetMapping("/delete/{id}")
    public String addEmployee(Model model, @PathVariable long id) {

        model.addAttribute("deleteEmployee", employeeService.deleteEmployee(id));

        return main(model);
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(Model model, @PathVariable long id) {

        model.addAttribute("updateEmployee", employeeService.findEmployeeById(id));

        return "update-employee";
    }

    @RequestMapping(value = "/save-employee",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE,
            method = RequestMethod.POST)
    @ResponseBody
    public String saveEmployee(@RequestBody String newEmployee, HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        return employeeService.saveEmployee(newEmployee);
    }

    @RequestMapping(value = "/save-updated-employee",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE,
            method = RequestMethod.PUT)
    @ResponseBody
    public String saveUpdatedEmployee(@RequestBody String updatedEmployee, HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        return employeeService.saveEmployee(updatedEmployee);
    }

}
