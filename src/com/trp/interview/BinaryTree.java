package com.trp.interview;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	
	public Node addRec(Node n,int val) {
		
		if(n==null)
			return new Node(val);
		
		else
			if(n.value>val)
				n.left = addRec(n.left,val);
			else if(n.value<val)
				n.right = addRec(n.right,val);
			else
				return n;
		
		return n;
		
				
		
		
	}
	
	public void add(int val) {
		
		
		
	}

}


class Node{
	
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		
		this.value = value;
		left = null;
		right = null;
		
	}
	
	
	
	
}
