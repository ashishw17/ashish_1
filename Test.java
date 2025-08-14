package com.nt.CodingPreps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/*
 * HashSet
 * LinkedHashSet
 * 
 * ArrayList
 * LinkedList
 * 
 * 
 * 
 * */

public class Test implements I1,I2
{
	public static void hashsetEg()
	{
		Set<Integer> hs = new HashSet<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			hs.add(i*3);
		}
		
		System.out.println(" "+hs);
		
		Iterator<Integer> itr = hs.iterator(); 
		
		while(itr.hasNext())
		{
			if(itr.next() % 2 == 1)
				itr.remove();
		}
		System.out.println(" "+hs);
	}
	
	public static void treesetEg()
	{
		Set<Integer> ts = new TreeSet<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			ts.add(i*3);
		}
		
		System.out.println(" "+ts);
		
		Iterator<Integer> itr = ts.iterator(); 
		
		while(itr.hasNext())
		{
			if(itr.next() % 2 == 1)
				itr.remove();
		}
		System.out.println(" "+ts);
		
	}
	public static void compareTwoHashset()
	{
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Red");hs1.add("Yellow");hs1.add("Green");hs1.add("Violet");
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Red");hs2.add("Pink");hs2.add("Black");hs2.add("Violet");
		
		System.out.println(" "+hs1);
		System.out.println(" "+hs2);
		
		for(String s : hs1)
		{
			System.out.println(hs2.contains(s) ? "Yes" : "No");
		}
	}
	public static void compareTreeSet()
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");ts.add("Black");ts.add("Green");ts.add("Yellow");ts.add("White");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.print("  "+itr.next());
		}
		
		System.out.println("\n SOP => ");
	}
	
	public static void compareArrayList()
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(3);al.add(1);al.add(2);al.add(4);al.add(5);
		
		al.add(0,6);
		System.out.println(" "+al+" \n "+al);
	}
	public static void compareLinkedList()
	{
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(3);al.add(1);al.add(2);al.add(4);al.add(5);
		
		System.out.println(" "+al+" \n ");
		al.push(10);
		System.out.println(" "+al+" \n "+" "+al.peek());
	}
	
	public static void compareHashMap()
	{
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("ashish",40000);
		hm.put("prachi",30000);
		hm.put("rani",60000);
		
		//Set<Entry<Integer,String>> s = ;
		
		System.out.println("==================================");
		System.out.println("Name \t || \t  Salary");
		System.out.println("==================================");
		
		for(Map.Entry<String,Integer> m : hm.entrySet())
		{
			String name = m.getKey();
			int salary = m.getValue();
			
			if(salary > 30000)
				System.out.println(" "+m.getKey()+" \t || \t  "+m.getValue());
		}
		
		System.out.println("==================================");
		
	}
	
	public static void forEach_Eg()
	{
		List<String> data = new ArrayList<>(); 
		data.add("New Delhi"); 
		data.add("New York"); 
		data.add("Mumbai"); 
		data.add("London"); 

		data.forEach(new Consumer<String>() 
		{
			@Override
			public void accept(String t) 
			{ 
				System.out.println(t); 
			} 
		}); 
	}
	private static boolean isPrime(int number) 
	{		
		if(number < 2) 
			return false;
		
		for(int i=2; i<number; i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	private static boolean isPrime_1(int number) 
	{		
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}
	public static void even_odd(int a)
	{
		if(a%2==0)
			System.out.println("even number ....");
		else
			System.out.println("odd number ....");
	}
	public static void even_odd_lambda(int a)
	{
		
	}
	
	public static void main(String[] args) 
	{
		/* Temp_1 t1 = (int a) -> {
			int result;
			result = a * a;
			System.out.println("Result : "+result);
		};
			
		t1.powerfunc(3); */
		
		Test t = new Test();
		//t.m2();
		I1.m2();
	}

	@Override
	public void m3() {
		
	}

	@Override
	public void m1() {
		
	}
	
	/*@Override
	public void m2() {
		System.out.println("inside class from m2 ...");
	}*/
}

interface Temp_1
{
	public void powerfunc(int a);
}

interface I1
{
	public void m1();
	static void m2() {
		System.out.println("m2() from I1");
	}
}

interface I2
{
	public void m3();
	static void m4() {
		System.out.println("m4() from I2");
	}
}
