package com.arty.testpulse.controllers;

import com.arty.testpulse.domains.Employee;
import com.arty.testpulse.services.IEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
@Api(value = "/api/employee" , description = "Operation about company employees", tags = "Employees")
public class EmployeeController
{
    @Autowired
    IEmployeeService employeeService;

    @ApiOperation(value = "Get all employees",
            response = List.class,
            responseContainer = "ResponseEntity<List<Employee>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 204, message = "No employees in database")
    })
    @GetMapping("/getAll/{cnt_offset}")
    public ResponseEntity<List<Employee>> getAll (@PathVariable String cnt_offset) {
        return employeeService.getAll(cnt_offset);
    }

    @ApiOperation(value = "Get average employees' salary in company",
            response = Map.class,
            responseContainer = "Map<String, Object>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 204, message = "No employees in database")
    })
    @GetMapping("/getAvgSalary/{cnt_offset}")
    public ResponseEntity<Map<String, Object>> getAvgSalary(@PathVariable String cnt_offset) {
        return employeeService.getAvgSalary(cnt_offset);
    }

    @ApiOperation(value = "Get average employees' salary for every department",
            response = List.class,
            responseContainer = "List<Map<String, Object>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 204, message = "No employees in database")
    })
    @GetMapping("/getAvgSalaryByDepartment/{cnt_offset}")
    public ResponseEntity<List<Map<String, Object>>> getAvgSalaryByDepartment(@PathVariable String cnt_offset) {
        return employeeService.getAvgSalaryByDepartment(cnt_offset);
    }

    @ApiOperation(value = "Get average employees' salary for every position",
            response = List.class,
            responseContainer = "List<Map<String, Object>>")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 204, message = "No employees in database")
    })
    @GetMapping("/getAvgSalaryByPosition/{cnt_offset}")
    public ResponseEntity<List<Map<String, Object>>> getAvgSalaryByPosition(@PathVariable String cnt_offset) {
        return employeeService.getAvgSalaryByPosition(cnt_offset);
    }

}
