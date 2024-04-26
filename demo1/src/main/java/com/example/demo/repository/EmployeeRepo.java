package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Query("SELECT employee FROM Employee  employee JOIN RetirementPlan plan ON employee.retirementPlan.planId = plan.planId WHERE MONTH(plan.retirementDate) = :month AND YEAR(plan.retirementDate) = :year")
    List<Employee> getEmployeesRetiringByMonth(int month, int year);
}
