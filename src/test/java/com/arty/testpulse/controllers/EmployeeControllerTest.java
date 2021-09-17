package com.arty.testpulse.controllers;

import com.arty.testpulse.domains.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest
{

    @Autowired
    MockMvc mockMvc;

    @Test
    void get ()
    {
        EmployeeController employeeController = new EmployeeController();
        String s = employeeController.get("Artur");
        assertEquals("Artur me", s);
    }

    @Test
    void getAll () throws Exception
    {
        RequestBuilder request = MockMvcRequestBuilders.get("api/employees/getAll/0");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertNotNull(result);
        /*EmployeeController employeeController = new EmployeeController();
        ResponseEntity<List<Employee>> list_employee = employeeController.getAll("0");
        assertNotNull(list_employee);*/
    }

    @Test
    void getAvgSalary ()
    {
    }

    @Test
    void getAvgSalaryByDepartment ()
    {
    }

    @Test
    void getAvgSalaryByPosition ()
    {
    }
}