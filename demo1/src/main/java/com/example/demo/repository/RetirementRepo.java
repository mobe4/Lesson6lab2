package com.example.demo.repository;

import com.example.demo.entity.RetirementPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface RetirementRepo extends JpaRepository<RetirementPlan,Long> {

    Optional<RetirementPlan> findByEmployee_EmployeeId (Long employeeId);
}
