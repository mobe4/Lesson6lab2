package com.example.demo.dto.retirement;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RetirementRequest {

    private long planId;

    private int referenceNumber;

    private LocalDateTime enrollmentDate;

    private LocalDateTime retirementDate;

    private Double monthlyContribution;

}
