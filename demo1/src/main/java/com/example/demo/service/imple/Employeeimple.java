package com.example.demo.service.imple;

import com.example.demo.dto.Employee.EmployeeRequest;
import com.example.demo.dto.Employee.EmployeeResponses;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeInterface;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class Employeeimple implements EmployeeInterface {

      private final EmployeeRepo employeeRepo;


    @Override
    public List<EmployeeResponses> getAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();

        return employees.stream().map(EmployeeResponses::fromEmployee).toList();

    }

    @Override
    public List<EmployeeResponses> getRetiringEmployeesSortedByRetirementDate() {
        LocalDateTime date = LocalDateTime.now();

        int month;
        int year;
        if(date.getMonthValue() == 12) {

            month = 1;
            year = date.getYear() + 1;

        }
        else {
            month = date.getMonthValue() +1;
            year = date.getYear();
        }
        List<Employee> employees = employeeRepo.getEmployeesRetiringByMonth(month,year);

        return employees.stream().map(EmployeeResponses::fromEmployee).toList();

    }

    @Override
    public EmployeeResponses createEmployee(EmployeeRequest employeeRequest2) {

        Employee employee = new Employee();

        employee.setEmployeeId(employeeRequest2.getEmployeeId());
        employee.setYearlySalary(employeeRequest2.getYearlySalary());
        employee.setLastName(employeeRequest2.getLastName());
        employee.setFirstName(employeeRequest2.getFirstName());

        employee = employeeRepo.save(employee);

        return EmployeeResponses.fromEmployee(employee);
    }
}

