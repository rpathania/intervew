package com.trp.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.trp.interview.designpatterns.EmployeeBuilder;


public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		
		List<EmployeeBuilder> liste = Arrays.asList(
									  new EmployeeBuilder().withId(1).hasName("Rishi").inDepartment("DPB763").build(),
									  new EmployeeBuilder().withId(2).hasName("TRP").inDepartment("DPB762").build(),
									  new EmployeeBuilder().withId(5).hasName("Prateek").inDepartment("DPB765").build());
		
		Stream<Integer> stream = list.stream();
	//	Map<Integer,Double>map = stream.map(i -> i*2).collect(Collectors.toMap(i->i, x->Math.random()));
	//	stream.limit(3).forEach(System.out::println);
	///	System.out.println(map);
		
		System.out.println(liste.stream().min((val1,val2) -> {return val1.getName().compareTo(val2.getName());}).get().toString());
		
		IntStream.of(1,5,3,4,2).forEach(System.out::print);

	}

}
