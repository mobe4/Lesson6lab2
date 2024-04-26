package com.example.thisisit.service.main2;

import com.example.thisisit.dto.EmployeeRequest;
import com.example.thisisit.dto.EmployeeResposne;
import com.example.thisisit.entity.Employee;
import com.example.thisisit.repositery.Empolyeerepo;
import com.example.thisisit.service.Empolyeeimp;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Transactional
@AllArgsConstructor
@Service
public class  EmployeeService implements Empolyeeimp {

    private final Empolyeerepo empolyeerepo;

    @Override
    public List<EmployeeResposne> getAllEmployees() {

        List<Employee> employees = empolyeerepo.findAll();

        return employees.stream().map(EmployeeResposne::fromEmployee).toList();
    }

    @Override
    public List<EmployeeResposne> getRetiringEmployeesSortedByRetirementDate() {
        return null;
    }

    @Override
    public EmployeeResposne CreateEmployee(EmployeeRequest employeeRequest) {

        Employee employee = new Employee();
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setLastName(employeeRequest.getLastName());
        employee.setYearlySalary(employeeRequest.getYearlySalary());
        employee = empolyeerepo.save(employee);
        return EmployeeResposne.fromEmployee(employee);
    }
}
