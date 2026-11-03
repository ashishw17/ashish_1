package com.nt.spring.Basic;

import com.nt.spring.jdbc.Controller.EmpController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Laptop laptop = (Laptop) context.getBean("laptop");
        //System.out.println("inside main..."+laptop);
    }
}







/*
* package com.nt.Practice_1;

public class Main
{
    public static void m2()
    {
        //int[][] myarr = new int[row][col];

        int a=10;
        int[][] arr = {{1,2,3}, {4,5,6}};  //arr[0][0], arr[0][1]
        int col=arr[0].length;//3
        int row=arr.length;//2
        int[][] result = new int[col][row];


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<=result.length;i++) {
            for (int j = 0; j <result[0].length; j++) {
                System.out.print("[" + result[i][j]+"]");
            }
            System.out.println();
        }
        // algo
















        /*List<Emp> emps = Arrays.asList(new Emp(101,"ashish",80000.00,"IT Department"),
                new Emp(102,"hriday",98000.00,"Accounts Department"),
                new Emp(103,"prachi",88000.00,"HR Department"),
                new Emp(104,"mythili",60000.00,"Marketing Department")
        );

        List<String> str = Arrays.asList("ashish","prachi","hriday","rahul","pooja","anil");
        String s = "ashish";

        Map<Integer,List<String>> result = str.stream()
                            //.map(String::length).collect(Collectors.toList());
                            .collect(Collectors.groupingBy(String::length));

        long cnt = s.chars()
                .filter(n->n=='s').count();

        System.out.println("s: "+cnt);
    }*/






    /* public static void m1()
    {
        List<Emp> emps = Arrays.asList(new Emp(101,"ashish",80000.00,"IT Department"),
                new Emp(102,"hriday",98000.00,"Accounts Department"),
                new Emp(103,"prachi",88000.00,"HR Department"),
                new Emp(104,"mythili",60000.00,"Marketing Department")
        );

        Map<String,Optional<Emp>> map = emps.stream()
                .collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparing(Emp::getSalary))));

        Pen p1 = new Pen();
        Pen p2 = new Pen(101,"Peter Parker");
        Pen p3 = new Pen(102,"Reynold");
        Pen p4 = new Pen(103,"Pin Point");
        Pen p5 = new Pen(104,"Celio");
        Pen p6 = new Pen(105,"Cello");
        Pen p7 = new Pen(106,"Apsara");

        Map<Pen,String> penMap = new HashMap<>();
        penMap.put(p2,"A");
        penMap.put(p3,"B");
        penMap.put(p4,"C");
        penMap.put(p5,"D");
        penMap.put(p6,"E");
        penMap.put(p7,"F");

        //for(int i=1;i<=6;i++)
           //System.out.println("p"+""+i);

        //System.out.println("Size : "+penMap.size());

        Pen p = new Pen();
        //p::writingWithPen;
        //System.out.println("Pen : "+p::writingWithPen);

        List<String> str = Arrays.asList("a","b","c");
        List<String> result = Collections.singletonList(str.stream().collect(Collectors.joining("-")));
        System.out.println("Result : "+result);

    }



            //public static void main(String[] args)
            {
        /*HashMap<Employee, String> e1 = new HashMap();

        e1.put(new Employee(1,"karthi","Mech"),"Mech");
        e1.put(new Employee(2,"prem","Ece"),"Ece");
        e1.put(new Employee(1,"karthi","Mech"),"Mech");*/

        /*List<Emp> emps = Arrays.asList(new Emp(101,"ashish",80000.00,"IT Department"),
                new Emp(102,"hriday",98000.00,"Accounts Department"),
                new Emp(103,"prachi",88000.00,"HR Department"),
                new Emp(104,"mythili",60000.00,"Marketing Department")
        );


        Map<String, Optional<Emp>> result = emps.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                l -> l.stream()
                                        .sorted(Comparator.comparing(Emp::getSalary).reversed())
                                        .skip(0)
                                        .findFirst()
                        )
                ));

        Map<String, Optional<Emp>> result1 = emps.stream()
                        .collect(Collectors.groupingBy(Emp::getName,Collectors.collectingAndThen(Collectors.toList(),
                                l -> l.stream()
                                        .sorted(Comparator.comparing(Emp::getSalary).reversed())
                                        .skip(0)
                                        .findFirst())));


        Map<String,Optional<Emp>> map = emps.stream()
                .collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
        */
            //Laptop1 l1 = new Laptop1(201,"Dell",emps);

            //m2();
            //System.out.println("Record : "+map);




/* record Laptop1(int id, String name,List<Emp> emps)
{
    public Laptop1
    {
        List.of(id);
        List.of(name);
        List.copyOf(emps);
    }
}*/

/* class Employee
{
    int id ;
    String name;
    String dept;

    Employee(int id,String name,String dept)
    {
        this.id = id;
        this.name =  name;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.equals(obj);
    }
}*/