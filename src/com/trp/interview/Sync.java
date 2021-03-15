package com.trp.interview;



class Counter{
	
private  int count;

public synchronized void inc() {
	count++;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}	
}


public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c = new Counter();
		
		Thread t1 = new Thread(()-> {
			for(int i=0;i<10000;i++)
				c.inc();
		 	});
		Thread t2 = new Thread( new Runnable(){
			public void run() {
			for(int i=0;i<10000;i++)
				c.inc();}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getCount());
		}
	
}

