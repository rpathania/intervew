package com.trp.interview;

import java.util.Arrays;
import java.util.List;

public class Stream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list  =  Arrays.asList(1,2,3,4,5,65,6,7);
		
	//	list.stream().filter(i -> i%2!=0).map(i->Math.pow(i, 2)).reduce(identity, accumulator) ;
		//list.forEach(System.out::println(i->Math.pow(i,2)));
		
		list.stream().map(i->i*2).forEach(System.out::println);
		
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		
		
		String g = "Mississipi";
		
		char[] arr = g.toCharArray();
		
		System.out.println(g.chars().filter(i->i=='i').toArray());
		char i = 'i';
		
		
		
		
		
		
	//	list = Instream.range(1,)
		//		(i->Math.pow(i,2)));

	///	list.forEach(i->System.out.println(i));
		
	}

}
