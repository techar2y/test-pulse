package com.arty.testpulse.domains;

public class Employee
{
    private Long id;
    private String name;
    private String position;
    private String departement;
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

    public String getDepartement ()
    {
        return departement;
    }

    public void setDepartement (String departement)
    {
        this.departement = departement;
    }

    public Integer getSalary ()
    {
        return salary;
    }

    public void setSalary (Integer salary)
    {
        this.salary = salary;
    }
}
