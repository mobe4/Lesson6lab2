package com.example.thisisit.dto;

import com.example.thisisit.entity.Employee;
import lombok.Data;

@Data
public class EmployeeRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private Long yearlySalary;



}
