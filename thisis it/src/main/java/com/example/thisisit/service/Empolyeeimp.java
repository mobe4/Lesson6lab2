package com.example.thisisit.service;

import com.example.thisisit.dto.EmployeeRequest;
import com.example.thisisit.dto.EmployeeResposne;
import org.springframework.stereotype.Service;

import java.net.InterfaceAddress;
import java.util.List;

@Service

public interface Empolyeeimp {

    List<EmployeeResposne> getAllEmployees();
    List<EmployeeResposne> getRetiringEmployeesSortedByRetirementDate();

    EmployeeResposne CreateEmployee(EmployeeRequest employeeRequest);
}
