package com.arty.testpulse.services;

import com.arty.testpulse.domains.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *  Interface of employee service
 */
public interface IEmployeeService
{
    ResponseEntity<List<Employee>> getAll(String cnt_offset);
    ResponseEntity<Map<String, Object>> getAvgSalary();
    ResponseEntity<List<Map<String, Object>>> getAvgSalaryByDepartment(String cnt_offset);
    ResponseEntity<List<Map<String, Object>>> getAvgSalaryByPosition(String cnt_offset);
}
