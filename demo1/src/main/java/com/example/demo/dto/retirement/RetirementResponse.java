package com.example.demo.dto.retirement;

import com.example.demo.dto.Employee.EmployeeWithoutRetirementResponse;
import com.example.demo.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class RetirementResponse {


    private Long planId;
    private String referenceNumber;
    private LocalDateTime enrollmentDate;
    private LocalDateTime retirementDate;
    private double monthlyContribution;

    private EmployeeWithoutRetirementResponse employee;

    public static RetirementResponse retirementResponse (RetirementPlan r){

        RetirementResponse retirementResponse = new RetirementResponse();

        retirementResponse.setPlanId(r.getPlanId());
        retirementResponse.setRetirementDate(r.getRetirementDate());
        retirementResponse.setEnrollmentDate(r.getRetirementDate());
        retirementResponse.setEnrollmentDate(r.getEnrollmentDate());
        if (r.getEmployee() != null){

            retirementResponse.setEmployee(EmployeeWithoutRetirementResponse.fromEmployee(r.getEmployee()));

        }
return retirementResponse;
    }

}
