package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetirementPlan {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;
@NonNull
    @Column(unique = false)
    private int referenceNumber;
@NonNull
    private LocalDateTime enrollmentDate;
@Column(unique = false)
    private LocalDateTime retirementDate;
    private Double monthlyContribution;

    @OneToOne(mappedBy = "retirementPlan")
    private Employee employee;
}
