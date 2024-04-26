package com.example.mockexam.service;

import com.example.mockexam.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    List<Employee> getRetiringEmployeesSortedByRetirementDate();
    Employee createEmployee(Employee employee);
}