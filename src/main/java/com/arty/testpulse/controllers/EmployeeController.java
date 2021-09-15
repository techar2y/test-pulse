package com.arty.testpulse.controllers;

import com.arty.testpulse.domains.Employee;
import com.arty.testpulse.mappers.EmployeeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "/api/employee" , description = "Operation about employees" , tags = "Employees")
public class EmployeeController
{
    @Autowired
    EmployeeMapper employeeMapper;


    @ApiOperation(value = "Find all employees",
            response = List.class,
            responseContainer = "ResponseEntity<List<Employee>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 204, message = "No employees in database")
    })
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll() {
        try {

            List<Employee> employees = employeeMapper.getAll();
            if(employees.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Get average employees' salary in company",
            response = Map.class,
            responseContainer = "Map<String, Object>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @GetMapping("/getAvgCompanySalary")
    public ResponseEntity<Map<String, Object>> getAvgCompanySalary() {
        try {

            Map<String, Object> avgCompanySalary = employeeMapper.getAvgCompanySalary();
            return new ResponseEntity<>(avgCompanySalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @ApiOperation(value = "Get average employees' salary for departement",
            response = List.class,
            responseContainer = "List<Map<String, Object>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @GetMapping("/getAvgDepartementSalary")
    public ResponseEntity<List<Map<String, Object>>> getAvgDepartementSalary() {
        try {

            List<Map<String, Object>> avgDepartementSalary = employeeMapper.getAvgDepartementSalary();
            return new ResponseEntity<>(avgDepartementSalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Get average employees' salary for position",
            response = List.class,
            responseContainer = "List<Map<String, Object>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error")
    })
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
