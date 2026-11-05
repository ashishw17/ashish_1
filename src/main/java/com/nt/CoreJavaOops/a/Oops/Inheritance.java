package com.nt.CoreJavaOops.a.Oops;


class Products
{
    private int id;
    private String name;

    public Products()
    {

    }
    public Products(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Inheritance extends Products
{
    private double price;

    public Inheritance()
    {}

    public Inheritance(int id,String name,double price)
    {
        super(id,name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inheritance{" +
                "price=" + price +
                '}';
    }
}
