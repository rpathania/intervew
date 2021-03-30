package com.trp.interview.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hSet = new HashSet<>();
		
		for(int i=10;i>0;i--)		hSet.add(new Random().nextInt(1000));
		
		System.out.println(hSet);
		
		Set<Pen> pSet = new HashSet<>();
		
		Pen p1 = new Pen();
		
		Pen p2 = new Pen();
		
		p1.setRate(10);
		p1.setColor("blue");
		
		p2.setColor("Red");
		p2.setRate(10);
		
		System.out.println("p1 = " +p1);
		System.out.println("##");
		System.out.println("p2 = " +p2);
		
		pSet.add(p1);
		pSet.add(p2);
		
		System.out.println(pSet);


	}
	
	


}

class Pen{
	
	private int rate;
	private String color;
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
	/*	System.out.println( "Hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + rate;*/
		return 11;
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println( "equals");
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (rate != other.rate)
			return false;
		return true;*/
		return true;
	}
	
	
}