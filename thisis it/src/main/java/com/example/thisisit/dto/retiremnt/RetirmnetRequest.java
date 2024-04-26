package com.example.thisisit.dto.retiremnt;

import com.example.thisisit.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RetirmnetRequest {
    private String referenceNumber;
    private LocalDate enrollmentDate;
    private LocalDate retirementDate;
    private double monthlyContribution;

    public static RetirmnetRequest fromRetirementPlan(RetirementPlan retirementPlan) {
        RetirmnetRequest request = new RetirmnetRequest();
        request.setReferenceNumber(retirementPlan.getReferenceNumber());
        request.setEnrollmentDate(retirementPlan.getEnrollmentDate());
        request.setRetirementDate(retirementPlan.getRetirementDate());
        request.setMonthlyContribution(retirementPlan.getMonthlyContribution());
        return request;
    }
}
