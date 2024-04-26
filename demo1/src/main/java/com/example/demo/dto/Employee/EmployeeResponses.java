package com.example.demo.dto.Employee;

import com.example.demo.dto.retirement.RetirementPlanWithoutEmployeeResponse;
import com.example.demo.entity.Employee;
import com.example.demo.entity.RetirementPlan;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeResponses {


    private long employeeId;

    private String firstName;

    private String LastName;

    private BigDecimal yearlySalary;

    private RetirementPlanWithoutEmployeeResponse retirementPlan;


  public static EmployeeResponses fromEmployee(Employee e){

      EmployeeResponses employeeResponses = new EmployeeResponses();

      employeeResponses.setEmployeeId(e.getEmployeeId());
      employeeResponses.setFirstName(e.getFirstName());
      employeeResponses.setLastName(e.getLastName());
      employeeResponses.setEmployeeId(e.getEmployeeId());
      employeeResponses.setYearlySalary(e.getYearlySalary());

      if (e.getRetirementPlan() != null){
           employeeResponses.setRetirementPlan(RetirementPlanWithoutEmployeeResponse.fromRetirementPlan(e.getRetirementPlan()));
      }
return employeeResponses;
  }


}
