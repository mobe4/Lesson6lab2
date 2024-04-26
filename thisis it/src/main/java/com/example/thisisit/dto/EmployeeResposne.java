package com.example.thisisit.dto;

import com.example.thisisit.dto.retiremnt.RetirmentWithOutEmployee;
import com.example.thisisit.entity.Employee;
import lombok.Data;

@Data
public class EmployeeResposne {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private double yearlySalary;

    private RetirmentWithOutEmployee retirement;

    public static EmployeeResposne fromEmployee(Employee employee) {
        EmployeeResposne response = new EmployeeResposne();
       response.setEmployeeId(employee.getEmployeeId());
        response.setFirstName(employee.getFirstName());
        response.setLastName(employee.getLastName());
        response.setYearlySalary(employee.getYearlySalary());
        if (employee.getRetirementPlan() != null) {
            response.setRetirement(RetirmentWithOutEmployee.fromRetirementPlan(employee.getRetirementPlan()));
        }
        return response;
    }


}



