package com.nt.CoreJavaOops.a.Oops;

// compile time polymorphism
class Operation
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
}

// run time polymorphism
class A
{
    int a;

    A()
    {}

    A(int a)
    {
        this.a = a;
    }

    public void a1()
    {
        System.out.println("inside a1");
    }
}
class B extends A
{
    int b;

    B(){}

    B(int b)
    {
        this.b = b;
    }
    public void b1()
    {
        System.out.println("inside b1");
    }
}

public class Polymorphism
{
    public static void main(String [] args)
    {
        Operation ops = new Operation();

        System.out.println("Compile Time Polymorphism(int,int) : "+ops.add(10, 20));
        System.out.println("Compile Time Polymorphism(double,double) : "+ops.add(3.5,4.6));

        A a = new A();
        a.a1();
        B b = new B();
        b.b1();
        A a1 = new B();
        a1.a1();

    }
}
