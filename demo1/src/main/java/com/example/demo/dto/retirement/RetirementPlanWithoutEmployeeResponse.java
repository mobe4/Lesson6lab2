package com.example.demo.dto.retirement;

import com.example.demo.entity.RetirementPlan;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RetirementPlanWithoutEmployeeResponse {
    private Long planId;
    private String referenceNumber;
    private LocalDateTime enrollmentDate;
    private LocalDateTime retirementDate;
    private double monthlyContribution;

 public static RetirementPlanWithoutEmployeeResponse fromRetirementPlan(RetirementPlan re){

     RetirementPlanWithoutEmployeeResponse retirementPlan = new RetirementPlanWithoutEmployeeResponse();

     retirementPlan.setPlanId(re.getPlanId());
     retirementPlan.setRetirementDate(re.getRetirementDate());
     retirementPlan.setEnrollmentDate(re.getEnrollmentDate());
     retirementPlan.setMonthlyContribution(re.getMonthlyContribution());

     return retirementPlan;

 }


}
