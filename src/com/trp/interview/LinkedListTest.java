package com.trp.interview;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		//list.add(1);
		
		for (int i=0;i<5;i++)
			list.add(i);
		
	String 	S = "i.like.this.program.very.much";
	 String[] arr = S.split("[.]");
	 
	 for(String g : arr) {
		 System.out.println(g);
	 }
	 
	//Arrays.stream(arr).forEachOrdered(System.out::prinlnt);
		System.out.println(list);
	}

}


