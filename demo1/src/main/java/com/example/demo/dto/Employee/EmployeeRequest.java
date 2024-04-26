package com.example.demo.dto.Employee;

import com.example.demo.entity.RetirementPlan;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeRequest {

    private long employeeId;

    private String firstName;

    private String LastName;

    private BigDecimal yearlySalary;



}
