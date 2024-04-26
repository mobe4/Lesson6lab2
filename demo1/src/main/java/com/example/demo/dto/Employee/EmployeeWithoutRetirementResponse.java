package com.example.demo.dto.Employee;

import com.example.demo.dto.retirement.RetirementPlanWithoutEmployeeResponse;
import com.example.demo.entity.Employee;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeWithoutRetirementResponse {

    private long employeeId;

    private String firstName;

    private String LastName;

    private BigDecimal yearlySalary;

    public static EmployeeWithoutRetirementResponse fromEmployee(Employee e){

        EmployeeWithoutRetirementResponse employee = new EmployeeWithoutRetirementResponse();

        employee.setEmployeeId(e.getEmployeeId());
        employee.setLastName(e.getLastName());
        employee.setFirstName(e.getFirstName());
        employee.setYearlySalary(e.getYearlySalary());

        return employee;
    }

}
