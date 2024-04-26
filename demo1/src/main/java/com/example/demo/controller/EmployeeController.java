package com.example.demo.controller;

import com.example.demo.dto.Employee.EmployeeRequest;
import com.example.demo.dto.Employee.EmployeeResponses;
import com.example.demo.service.imple.Employeeimple;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class EmployeeController {

    private Employeeimple employeeimple;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeResponses> getAllEmployees(){

        return employeeimple.getAllEmployees();
    }

    @GetMapping(params = "retiring")
    public List<EmployeeResponses> getRetiringResposnse(){
        return employeeimple.getRetiringEmployeesSortedByRetirementDate();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponses createEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeimple.createEmployee(employeeRequest);


    }

}
