package com.example.thisisit.controller;

import com.example.thisisit.dto.EmployeeRequest;
import com.example.thisisit.dto.EmployeeResposne;
import com.example.thisisit.dto.retiremnt.RetirementResponse;
import com.example.thisisit.service.Empolyeeimp;
import com.example.thisisit.service.main2.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    public EmployeeService employeeService;


    @GetMapping
    public List<EmployeeResposne> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public EmployeeResposne getRetiringEmployees(@RequestBody EmployeeRequest employeeRequest) {
            return employeeService.CreateEmployee(employeeRequest);
        }
}
