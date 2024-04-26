package com.example.demo.service;

import com.example.demo.dto.retirement.RetirementRequest;
import com.example.demo.dto.retirement.RetirementResponse;
import com.example.demo.entity.RetirementPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RetirementInterface  {

    RetirementResponse getRetirementPlanByEmployeeId(Long employeeId);

    RetirementResponse countRetirementPlan(Long EmployeeId, RetirementRequest retirementRequest);
}
