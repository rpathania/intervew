package com.trp.interview.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.trp.interview.Person;

public class LambdaPrep {
	
	public static void main(String[] args) {
		
		FuncInterface intf = new FuncInterface(){
			public void printMethod(String msg) {
				System.out.println("Def implementation");
			}
		};
		/*First Approach*/
		T1 tx = new T1();
		Thread t1 = new Thread(tx);
		/*Second approach*/
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Via anonymous class");
			}
		});
		
		/*Third approach*/
		
		Thread t3 = new Thread(() -> System.out.println("via lambda"));
		
		/*Exercise*/
		
		List<Person> list = Arrays.asList(
				new Person(1, "Rishi",25),
				new Person(2, "John",33),
				new Person(3, "Catherine",26),
				new Person(4, "Ap",65),
				new Person(5, "Pr",35),
				new Person(6, "Rishi",25)				
				);
		
		Collections.sort(list,new myComparator());
		
		list.stream().filter(i -> i.getName().length()<=3).forEach(System.out::println);
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
			
		});
		
		Collections.sort(list,(p1,p2) -> p1.getAge() - p2.getAge());
		
		System.out.println(list);

		FuncInterface intLambda = (s) -> System.out.println("Lambda Implementation" + s);
	//	final int b = 9;
	//	final int t = 10;
		addNum x = (b,t) ->  b+t;
		System.out.println();
		
		LambdaPrep.methd((b,t) ->  b+t);
	}
	
	public static void methd(addNum x) {
		System.out.println(x.ad(0, 2));
	}

}

interface addNum{
	public int ad(int a, int b);
}

class T1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Running via creating and implementing a class");
		
	}
	
}

class myComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Person p1  = (Person)o1;
		Person p2 = (Person)o2;
		return p1.getName().compareTo(p2.getName());
	}
	
}

