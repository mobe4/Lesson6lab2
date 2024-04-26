package com.example.thisisit.dto;

import com.example.thisisit.entity.Employee;
import com.example.thisisit.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeWithOutRetirmnetData {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private double yearlySalary;

    public static EmployeeWithOutRetirmnetData fromEmployee(Employee employee) {

        EmployeeWithOutRetirmnetData response = new EmployeeWithOutRetirmnetData();
        response.setEmployeeId(employee.getEmployeeId());
        response.setFirstName(employee.getFirstName());
        response.setLastName(employee.getLastName());
        response.setYearlySalary(employee.getYearlySalary());
        return response;
    }
}