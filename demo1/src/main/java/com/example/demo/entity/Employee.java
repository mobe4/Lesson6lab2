package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long employeeId;
    @NonNull
    private String firstName;
    @NonNull
    private String LastName;

    private BigDecimal yearlySalary;
    @OneToOne
    private RetirementPlan retirementPlan;



}
