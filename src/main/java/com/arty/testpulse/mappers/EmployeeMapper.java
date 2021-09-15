package com.arty.testpulse.mappers;

import com.arty.testpulse.domains.AvgPositionSalary;
import com.arty.testpulse.domains.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface EmployeeMapper
{
    @Select("SELECT * " +
            "FROM employees e JOIN departements d ON e.departement_id = d.id")
    List<Employee> getAll();

    /**
     * Средняя зарплата по компании
     * @return
     */
    @Select("SELECT AVG(e.salary) as avgSalary " +
            "FROM employees e JOIN departements d ON e.departement_id = d.id")
    Map<String, Object> getAvgCompanySalary();

    /**
     * Средняя заплата по отделу
     * @return
     */
    @Select("SELECT AVG(e.salary) as avgSalary, departement FROM employees e JOIN departements d ON e.departement_id = d.id " +
            "GROUP BY departement")
    List<Map<String, Object>> getAvgDepartementSalary();

    /**
     * Средняя зарплата по должности
     * @return
     */
    @Select("SELECT AVG(salary) as avgSalary, position FROM employees GROUP BY position")
    List<Map<String, Object>> getAvgPositionSalary();
}
