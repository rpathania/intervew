package com.trp.interview;

public class Stack {

	private int[] arr;
	
	private int top ;
	
	public Stack(){
		top=-1;
		arr = new int[100];
		
	}
	public int peek() {
		if (top ==-1)
				return -9;
		return arr[top];
	}
	public int getTop() {
		return top;
	}
	
	public void push(int val) {
		
		top+=1;
		arr[top] = val;
	}

	public int pop() {
		
		int x = arr[top];
		top-=1;
		return x;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st = new Stack();
		
		st.push(24);
		st.push(58);
		//System.out.println();
		System.out.println(st.peek());

		st.pop();
		
		System.out.println(st.peek());

	}

}
