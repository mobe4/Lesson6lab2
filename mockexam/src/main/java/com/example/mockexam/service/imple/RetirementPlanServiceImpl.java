package com.example.mockexam.service.imple;

import com.example.mockexam.entity.RetirementPlan;
import com.example.mockexam.repositery.RetirementPlanRepository;
import com.example.mockexam.service.RetirementPlanService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RetirementPlanServiceImpl implements RetirementPlanService {

    @Autowired
    private RetirementPlanRepository retirementPlanRepository;

    @Override
    public RetirementPlan getRetirementPlanByEmployeeId(Long employeeId) {
        return retirementPlanRepository.findByEmployeeEmployeeId(employeeId)
                .orElseThrow(() -> new RuntimeException("Retirement Plan not found"));
    }

    @Override
    public RetirementPlan createRetirementPlan(Long employeeId, RetirementPlan retirementPlan) {
        return retirementPlanRepository.save(retirementPlan);
    }
}