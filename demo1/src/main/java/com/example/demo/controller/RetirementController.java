package com.example.demo.controller;

import com.example.demo.dto.retirement.RetirementRequest;
import com.example.demo.dto.retirement.RetirementResponse;
import com.example.demo.service.imple.Retirementimpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/retirement")
@AllArgsConstructor

public class RetirementController {

    private final Retirementimpl retirementimpl;

    @GetMapping("/employee/{EmployeeId}")
    @ResponseStatus(HttpStatus.OK)
    public RetirementResponse retirementResponse(@PathVariable Long EmployeeId){

        return retirementimpl.getRetirementPlanByEmployeeId(EmployeeId);
    }


   @PostMapping("/employee/{employeeId}")
   @ResponseStatus(HttpStatus.CREATED)
    public RetirementResponse retirementResponse2(@PathVariable Long employeeId, @RequestBody RetirementRequest retirementRequest){

        return retirementimpl.countRetirementPlan(employeeId,retirementRequest);

   }

}
