package com.example.thisisit.dto.retiremnt;

import com.example.thisisit.dto.EmployeeWithOutRetirmnetData;
import com.example.thisisit.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RetirementResponse {
    private Long id;
    private String referenceNumber;
    private LocalDate enrollmentDate;
    private LocalDate retirementDate;
    private double monthlyContribution;

    private EmployeeWithOutRetirmnetData Employeew;


    public static RetirementResponse fromRetirementPlan(RetirementPlan retirementPlan) {
        RetirementResponse response = new RetirementResponse();
        response.setId(retirementPlan.getPlanId());
        response.setReferenceNumber(retirementPlan.getReferenceNumber());
        response.setEnrollmentDate(retirementPlan.getEnrollmentDate());
        response.setRetirementDate(retirementPlan.getRetirementDate());
        response.setMonthlyContribution(retirementPlan.getMonthlyContribution());
        if(retirementPlan.getEmployee() != null) {
            response.setEmployeew(EmployeeWithOutRetirmnetData.fromEmployee(retirementPlan.getEmployee()));
        }
        return response;
    }
}
