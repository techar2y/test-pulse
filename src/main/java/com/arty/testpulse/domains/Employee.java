package com.arty.testpulse.domains;

public class Employee
{
    private Long id;
    private String name;
    private String position;
    private Integer departement_id;
    private String departement_name;
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

    public Integer getDepartement_id ()
    {
        return departement_id;
    }

    public void setDepartement_id (Integer departement_id)
    {
        this.departement_id = departement_id;
    }

    public Integer getSalary ()
    {
        return salary;
    }

    public void setSalary (Integer salary)
    {
        this.salary = salary;
    }

    public String getDepartement_name ()
    {
        return departement_name;
    }

    public void setDepartement_name (String departement_name)
    {
        this.departement_name = departement_name;
    }
}
