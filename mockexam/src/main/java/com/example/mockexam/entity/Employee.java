package com.example.mockexam.entity;

import com.example.mockexam.entity.RetirementPlan;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long employeeId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private double yearlySalary;
    @OneToOne
    private RetirementPlan retirementPlan;
}