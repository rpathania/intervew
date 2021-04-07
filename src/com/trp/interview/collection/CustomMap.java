package com.trp.interview.collection;

import java.util.HashMap;
import java.util.Map;
import com.trp.interview.model.*;

public class CustomMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee,Integer> employeeMap = new HashMap<>();
		
		Employee emp1 = new Employee(1,"Rishi","Pathania","DPB763");
		Employee emp2 = new Employee(2,"John","Ikr","DPB764");
		Employee emp3 = new Employee(3,"Ejaz","Md","DPB765");
		Employee emp4 = new Employee(4,"Rishi","Pathania","DPB766");
		
		employeeMap.put(emp1,0);
		employeeMap.put(emp2,1);
		employeeMap.put(emp3,2);
		employeeMap.put(emp3,3);
		
		System.out.println(employeeMap);
		

	}

}
