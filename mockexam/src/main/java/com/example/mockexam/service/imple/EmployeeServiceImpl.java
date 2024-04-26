package com.example.mockexam.service.imple;

import com.example.mockexam.entity.Employee;
import com.example.mockexam.repositery.EmployeeRepository;
import com.example.mockexam.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getRetiringEmployeesSortedByRetirementDate() {
        // Assuming logic to determine the month and year is somewhere else
        return employeeRepository.getEmployeesRetiringByMonth(12, 2023);
    }



    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
