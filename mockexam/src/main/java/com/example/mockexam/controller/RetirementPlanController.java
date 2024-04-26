package com.example.mockexam.controller;

import com.example.mockexam.entity.RetirementPlan;
import com.example.mockexam.service.RetirementPlanService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/retirement-plan")
public class RetirementPlanController {

    private final RetirementPlanService retirementPlanService;

    @GetMapping("/employee/{employeeId}")
    @ResponseStatus(HttpStatus.OK)
    public RetirementPlan getRetirementPlanByEmployeeId(@PathVariable Long employeeId) {
        return retirementPlanService.getRetirementPlanByEmployeeId(employeeId);
    }

    @PostMapping("/employee/{employeeId}")
    @ResponseStatus(HttpStatus.CREATED)
    public RetirementPlan createRetirementPlan(@PathVariable Long employeeId, @RequestBody RetirementPlan retirementPlan) {
        return retirementPlanService.createRetirementPlan(employeeId, retirementPlan);
    }
}