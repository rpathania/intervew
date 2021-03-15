package com.trp.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable{

	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		
		System.out.println("Hashcode");
		return sid+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		
		Student s1  = new Student(1,"Rishi");
		
		Student s3  = new Student(3,"Mid2");
		Student s2  = new Student(2,"Mid");
		
		
		
		
		
		List<Student> l = Arrays.asList(s1,s2,s3);
		Collections.sort(l);
		l.forEach(System.out::println);
		
		System.out.println(s1.equals(s2));
		
	}
	@Override
	public int compareTo(Object o) {
		Student that = (Student) o;
		
		return this.name.compareTo(that.name);
	
		
		
		
	}
	
}
