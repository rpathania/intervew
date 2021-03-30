package com.trp.interview;

public class ThreadPrep extends Thread implements Runnable{

	
	public void run() {
		System.out.println("running....");
	}
	public static void main(String[] args) {
		
		
		Thread tx = new Thread(()->System.out.println());
		
		ThreadPrep t1  = new ThreadPrep();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getName());
		
		String h = "Rishi";
		
		h = h.replaceAll("i", "");
		System.out.println("Str  = "+ h);
		
	}

}
