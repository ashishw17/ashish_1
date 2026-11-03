package com.nt.Pojo;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Person
{
    private String name;
}

@Data
@Getter
@Setter
public class Emp extends Person
{
    private int id;
    private double salary;
    Address address;
    Dept dept;
    Projects projects;

    public Emp()
    {}

    public Emp(int id,double salary)
    {
        this.id = id;
        this.salary = salary;
    }

    public Emp(int id,String name,double salary, Address address,Dept dept,Projects projects)
    {
        super(name);
        this.id = id;
        this.salary = salary;
        this.address = address;
        this.dept = dept;
        this.projects = projects;
    }

    public String toString()
    {
        return "[ Id - "+id+", Name - "+super.getName()+", Salary - "+salary+", \n Address - "+address + ", \n Dept - "+dept+", \n Projects - "+projects+"]";
    }
}
