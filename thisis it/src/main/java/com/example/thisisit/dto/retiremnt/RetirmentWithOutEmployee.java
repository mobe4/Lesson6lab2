package com.example.thisisit.dto.retiremnt;

import com.example.thisisit.dto.EmployeeWithOutRetirmnetData;
import com.example.thisisit.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RetirmentWithOutEmployee {
    private Long planId;
    private String referenceNumber;
    private LocalDate enrollmentDate;
    private LocalDate retirementDate;
    private double monthlyContribution;

    private EmployeeWithOutRetirmnetData employee;

    public static RetirmentWithOutEmployee fromRetirementPlan(RetirementPlan retirementPlan) {
        RetirmentWithOutEmployee response = new RetirmentWithOutEmployee();
        response.setPlanId(retirementPlan.getPlanId());
        response.setReferenceNumber(retirementPlan.getReferenceNumber());
        response.setEnrollmentDate(retirementPlan.getEnrollmentDate());
        response.setRetirementDate(retirementPlan.getRetirementDate());
        response.setMonthlyContribution(retirementPlan.getMonthlyContribution());
        response.setEmployee(EmployeeWithOutRetirmnetData.fromEmployee(retirementPlan.getEmployee()));
        return response;
    }
}
