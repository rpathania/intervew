package com.trp.interview.designpatterns;

public class SingletonPattern {

	private static SingletonPattern obj;
	
	private SingletonPattern() {};
	
	public static synchronized  SingletonPattern getInstance() {
		
		if(obj==null) {
			obj = new SingletonPattern();
		}
		
		return obj;
	}
	
	
	
}
