package com.nt.CoreJavaOops;

import com.nt.Pojo.Address;
import com.nt.Pojo.Dept;
import com.nt.Pojo.Emp;
import com.nt.Pojo.Projects;

public class Hello
{
    public static void main(String[] args)
    {
        Address address1 = new Address(129,"Basawa-Nilaya","RR Nagar","Bangalore");
        Dept dept1 = new Dept(201,"IT Department");
        Projects projects1 = new Projects(301,"amexGBT","travel");

        Emp e1 = new Emp(101,"ashish",90000,address1,dept1,projects1);

        System.out.println("Emp Details : "+e1);
    }
}
