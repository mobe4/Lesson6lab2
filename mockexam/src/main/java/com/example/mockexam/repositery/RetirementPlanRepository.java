package com.example.mockexam.repositery;

import com.example.mockexam.entity.RetirementPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RetirementPlanRepository extends JpaRepository<RetirementPlan, Long> {
    Optional<RetirementPlan> findByEmployeeEmployeeId(Long employeeId);
}