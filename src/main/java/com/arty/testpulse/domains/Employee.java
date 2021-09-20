package com.arty.testpulse.domains;

import java.util.Objects;

public class Employee
{
    private Long id;
    private String name;
    private String position;
    private Integer position_id;
    private Integer department_id;
    private String department_name;
    private Integer salary;

    public Long getId ()
    {
        return id;
    }

    public void setId (Long id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public Integer getSalary ()
    {
        return salary;
    }

    public void setSalary (Integer salary)
    {
        this.salary = salary;
    }

    public Integer getPosition_id ()
    {
        return position_id;
    }

    public void setPosition_id (Integer position_id)
    {
        this.position_id = position_id;
    }

    public Integer getDepartment_id ()
    {
        return department_id;
    }

    public void setDepartment_id (Integer department_id)
    {
        this.department_id = department_id;
    }

    public String getDepartment_name ()
    {
        return department_name;
    }

    public void setDepartment_name (String department_name)
    {
        this.department_name = department_name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.name, employee.name)
                && Objects.equals(this.position_id, employee.position_id)
                && Objects.equals(this.department_id, employee.department_id)
                && Objects.equals(this.department_name, employee.department_name)
                && Objects.equals(this.salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name,
                this.position_id, this.department_id,
                this.department_name, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + this.id
                + ", name='" + this.name + '\''
                + ", position_id='" + this.position_id + '\''
                + ", department_id='" + this.department_id + '\''
                + ", department_name='" + this.department_name + '\''
                + ", salary='" + this.salary + '\''
                + '}';
    }
}
