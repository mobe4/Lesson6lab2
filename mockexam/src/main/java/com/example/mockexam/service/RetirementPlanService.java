package com.example.mockexam.service;

import com.example.mockexam.entity.RetirementPlan;

public interface RetirementPlanService {
    RetirementPlan getRetirementPlanByEmployeeId(Long employeeId);
    RetirementPlan createRetirementPlan(Long employeeId, RetirementPlan retirementPlan);
}