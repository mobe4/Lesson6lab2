package com.example.mockexam.repositery;

import com.example.mockexam.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e JOIN e.retirementPlan p WHERE MONTH(p.retirementDate) = :month AND YEAR(p.retirementDate) = :year")
    List<Employee> getEmployeesRetiringByMonth(int month, int year);
}