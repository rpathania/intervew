package com.trp.interview;

class Hi extends Thread{
	
	public void run() {
	for (int i=0;i<5;i++) {
		System.out.println("Hi");
			try {			Thread.sleep(1000);} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}



class Hello extends Thread{
	
	public void run() {
	for (int i=0;i<5;i++) {
		System.out.println("Hello");
		
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}



public class ThreadClass {

	
	public static void main(String[] args) throws Exception {
		
	
	Hi hi  =new Hi();
	
	Hello hello = new Hello();
	
	hi.start();
	
	hello.start();
	
	hi.join();
	
	hello.join();
	
	System.out.println("End");
}

}	