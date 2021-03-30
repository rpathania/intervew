package com.trp.interview.designpatterns;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeBuilder b = new EmployeeBuilder().withId(1).hasName("Rishi").inDepartment("DPB763").build();
	}

}
