package com.trp.interview;


class A{

	public void show() {
		System.out.println("In A");
	}
	
	public A() {
		System.out.println("A called");
	}
	 public static void creat() {
		System.out.println("create");
	}
}
public class Inheritence extends A{
	
	public void show() {
		super.show();
	}
	
	public Inheritence() {
		//super();
	}
	
	public void abc() {
		A.creat();
	}
	//creat();
	
	
	public static void main(String[] args) {
		
		
		Inheritence b = new Inheritence();
		
		//A a = new Inheritence();
		
	//	A aa= new A();
		b.show();
	//	a.show();
		
	//	aa.show();
	}

}
