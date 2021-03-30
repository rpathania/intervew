package pkg1;

import java.util.ArrayList;
import java.util.List;

public class StackPrep {

	private List<String> data;
	
	StackPrep(){
		data = new ArrayList<>();
	}
	
	public void push(String d) {
		
		data.add(d);
	
	}
	
	public String pop() {
		
		if(data.size() ==0) 
			return -1+"";
		else
			return data.remove(data.size()-1);
		
	}
	
	@Override
	public String toString() {
		return "StackPrep [data=" + data + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackPrep stack  = new StackPrep();
	
		stack.push("Rishi");
		stack.push("Abc");
		stack.push("Def");
		System.out.println(stack);
		stack.pop();

		System.out.println(stack);
		stack.pop();

		System.out.println(stack);
		stack.pop();

		System.out.println(stack);
		stack.pop();

		System.out.println(stack);
		
	}


}
