package com.example.cfs.controller;

import com.example.cfs.model.Employee;
import com.example.cfs.repository.DepartmentRepository;
import com.example.cfs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;

    public EmployeeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/employees")
    public String showEmployees(Model model){
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("list",employees);
        return "list";
    }

}
