package com.arty.testpulse.mappers;

import com.arty.testpulse.domains.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface EmployeeMapper
{
	/**
	 * Get all employees
	 * @return
	 */
	@Select("SELECT * " +
			"FROM employees e " +
			"JOIN departments d ON e.department_id = d.id " +
			"JOIN positions p ON e.position_id = p.id " +
			"ORDER BY e.id " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<Employee> getAll(Integer cnt_offset, Integer cnt_next);

	/**
	 * Get average salary of employees
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as average_salary " +
			"FROM employees e ")
	Map<String, Object> getAvgSalary();

	/**
	 * Get average salary by department
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as average_salary, d.department_name " +
			"FROM employees e JOIN departments d ON e.department_id = d.id " +
			"GROUP BY d.department_name " +
			"ORDER BY average_salary " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<Map<String, Object>> getAvgSalaryByDepartment(Integer cnt_offset, Integer cnt_next);

	/**
	 * Get average salary by position
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as average_salary, p.position " +
			"FROM employees e JOIN positions p ON e.position_id = p.id " +
			"GROUP BY p.position " +
			"ORDER BY average_salary " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<Map<String, Object>> getAvgSalaryByPosition(Integer cnt_offset, Integer cnt_next);
}
