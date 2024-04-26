package com.example.demo.service.imple;


import com.example.demo.dto.retirement.RetirementRequest;
import com.example.demo.dto.retirement.RetirementResponse;
import com.example.demo.entity.Employee;
import com.example.demo.entity.RetirementPlan;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.repository.RetirementRepo;
import com.example.demo.service.RetirementInterface;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class Retirementimpl implements RetirementInterface {

    public final RetirementRepo retirementRepo;

    public final EmployeeRepo employeeRepo;


    @Override
    public RetirementResponse getRetirementPlanByEmployeeId(Long employeeId) {

        return retirementRepo.findByEmployee_EmployeeId(employeeId).map(RetirementResponse::retirementResponse).orElseThrow(() -> new RuntimeException("retiremnt plan nit found"));
    }

    @Override
    public RetirementResponse countRetirementPlan(Long EmployeeId, RetirementRequest retirementRequest) {

        Employee employee = employeeRepo.findById(EmployeeId).orElseThrow (() ->new RuntimeException("Employee not found"));

        RetirementPlan retirementPlan = new RetirementPlan();

        retirementPlan.setPlanId(retirementRequest.getPlanId());
        retirementPlan.setRetirementDate(retirementRequest.getRetirementDate());
        retirementPlan.setEnrollmentDate(retirementRequest.getEnrollmentDate());
        retirementPlan.setReferenceNumber(retirementRequest.getReferenceNumber());
        retirementPlan.setMonthlyContribution(retirementRequest.getMonthlyContribution());

        employee.setRetirementPlan(retirementPlan);
        employeeRepo.save(employee);
        return RetirementResponse.retirementResponse(retirementPlan);
    }
}
