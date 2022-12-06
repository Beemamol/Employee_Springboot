package com.example.employeeapp_backend.controller;

import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to My Website";
    }
    @PostMapping("/add")
    public String EmployeeAdd()
    {
        return "Employee Added Successfully";
    }

    @GetMapping("/view")
    public String EmployeeView()
    {
        return "Employee Viewed Successfully";
    }
}
