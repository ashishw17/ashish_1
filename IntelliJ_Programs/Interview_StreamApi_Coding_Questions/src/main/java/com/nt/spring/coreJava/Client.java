package com.nt.spring.coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class Client {


    /*
    * practice related to stream api
    * 1. for integer list
    * 2. for string list
    * */
    public static void m1() {
        List<Integer> myList = Arrays.asList(2, 1, 4, 3, 6, 5, 7, 8, 9, 10, 2, 3, 5);
        List<String> myStringList = Arrays.asList("ashish","prachi","rahul");

        List<Integer> myListResult = myList.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> myListResult1 = myList.stream().filter(n->n%2!=0).collect(Collectors.toList());
        List<Integer> myListResultMax = myList.stream().max(Integer::compare).stream().collect(Collectors.toList());
        List<Integer> myListResultMin = myList.stream().min(Integer::compare).stream().collect(Collectors.toList());
        //myList.stream().mapToInt(n->n).max(Integer::compare).stream().collect(Collectors.toList());

        List<Integer> myFilterList = myList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        int max = myList.stream()
                .max(Integer::compare)
                .orElseThrow();

        int min = myList.stream()
                .min(Integer::compare)
                .orElseThrow();

        List<Integer> sortedResult = myList.stream().sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());

        Map<Integer,List<String>> stringLength = myStringList.stream()
                .collect(Collectors.groupingBy(String::length));

        OptionalDouble count = OptionalDouble.of(myList.stream()
                .mapToInt(n->n).count());
        int sum = myList.stream().mapToInt(n->n).sum();
        OptionalDouble avg = myList.stream().mapToInt(n->n).average();

        // multiply by 2
        List<Integer> intResult=myList.stream()
                .map(n->n*2)
                .collect(Collectors.toList());

        List<Integer> intResultUsingBoxed=myList.stream()
                .mapToInt(n->n*2)
                .boxed()
                .collect(Collectors.toList());

        List<String> stringResult = myStringList.stream()
                .filter(n->n.startsWith("p"))
                        .collect(Collectors.toList());

        Set<Integer> unique = new HashSet<Integer>();
        Set<Integer> duplicates = myList.stream()
                .filter(n->!unique.add(n))
                .collect(Collectors.toSet());

        double count1 = myList.stream()
                .mapToInt(n->n)
                .count();

        System.out.println("Count-1 : "+count1);
        System.out.println("Unique Nos : "+unique);
        System.out.println("Duplicate Nos : "+duplicates);


        // flatList
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened Map: "+flattenedList);

        /* System.out.println("Max Nos: "+max);
        System.out.println("Min Nos: "+min);
        System.out.println("Count: "+count);
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
        System.out.println("Even Nos: "+myFilterList);
        System.out.println("Sorted Result: "+sortedResult);
        System.out.println("String length result: "+stringLength);
        System.out.println("intResult: "+intResult);
        System.out.println("intResultUsingBoxed: "+intResultUsingBoxed);
        System.out.println("stringResult: "+stringResult); */


        myList.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
        System.out.println("================");
        myList.stream()
                .max(Integer::compare).ifPresent(System.out::println);
        System.out.println("================");
        myList.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("================");



    }

    public static void main(String [] args)
    {
        /* Pen p1 = new Pen(101,"Peter Parker",8999);
        Pen p2 = new Pen(102,"Reynold",7888);
        Pen p3 = new Pen(103,"Pin Point",5999);
        Pen p4 = new Pen(104,"Marker",4343);

        List<Pen> pens = new ArrayList<Pen>();
        pens.add(p1);pens.add(p2);pens.add(p3);pens.add(p4);

        /*for(Pen p:pens)
        {
            if(p.getName().startsWith("M"))
            {
                List<Pen> result = new ArrayList<Pen>();
                result.add(p);
                System.out.println(" "+p.getName());
            }
        }

        double min = pens.get(0).getPrice(), max = pens.get(0).getPrice();

        for(int i=0;i<pens.size();i++) {

            if (pens.get(i).getPrice() < min)
                min = pens.get(i).getPrice();
            if (pens.get(i).getPrice() > max)
                max = pens.get(i).getPrice();
        }

        System.out.println("Min Price :" + min);
        System.out.println("Max Price :" + max);

        for(Pen p:pens)
        {
            double min=0,max=0;

            if(p.getPrice()<min)
                min = p.getPrice();
            if(p.getPrice()>max)
                max = p.getPrice();

            System.out.println("Min Price :"+min);
            System.out.println("Max Price :"+max);
        }*/

        m1();

    }
}
