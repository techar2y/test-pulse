package com.arty.testpulse.controllers;

import com.arty.testpulse.domains.Employee;
import com.arty.testpulse.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController
{
    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll() {
        try {

            List<Employee> employees = employeeMapper.getAll();
            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAvgCompanySalary")
    public ResponseEntity<Map<String, Object>> getAvgCompanySalary() {
        try {

            Map<String, Object> avgCompanySalary = employeeMapper.getAvgCompanySalary();
            return new ResponseEntity<>(avgCompanySalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAvgDepartementSalary")
    public ResponseEntity<List<Map<String, Object>>> getAvgDepartementSalary() {
        try {

            List<Map<String, Object>> avgDepartementSalary = employeeMapper.getAvgDepartementSalary();
            return new ResponseEntity<>(avgDepartementSalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAvgPositionSalary")
    public ResponseEntity<List<Map<String, Object>>> getAvgPositionSalary() {
        try {

            List<Map<String, Object>> avgPositionSalary = employeeMapper.getAvgPositionSalary();
            return new ResponseEntity<>(avgPositionSalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
