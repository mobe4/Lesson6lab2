package com.example.demo.service;

import com.example.demo.dto.Employee.EmployeeRequest;
import com.example.demo.dto.Employee.EmployeeResponses;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeInterface {

    List<EmployeeResponses> getAllEmployees();

    List<EmployeeResponses> getRetiringEmployeesSortedByRetirementDate();

    EmployeeResponses createEmployee(EmployeeRequest employeeRequest);
}
