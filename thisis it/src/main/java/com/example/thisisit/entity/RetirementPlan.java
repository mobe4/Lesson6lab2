package com.example.thisisit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class RetirementPlan {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long planId;
  @Column(nullable = false, unique = true)
    private String referenceNumber;
@Column(nullable = false)
    private LocalDate enrollmentDate;
@Column(nullable = false)
    private LocalDate retirementDate;

    private double monthlyContribution;
    @OneToOne(mappedBy = "retirementPlan")
    private Employee employee;
}
