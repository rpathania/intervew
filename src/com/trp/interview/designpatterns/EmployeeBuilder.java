package com.trp.interview.designpatterns;

public class EmployeeBuilder {
	private int id;
	private String name;
	private String deptId;
	public EmployeeBuilder(int id, String name, String deptId) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
	}
	public EmployeeBuilder() {
	}
	public EmployeeBuilder withId(int id) {
		this.id = id;
		return this;
	}
	

	public EmployeeBuilder hasName(String name) {
		this.name = name;
		return this;
	}
	

	public EmployeeBuilder inDepartment(String deptId) {
		this.deptId = deptId;
		return this;
	}
	
	public EmployeeBuilder build() {
		return new EmployeeBuilder(id,name,deptId);
	}

	
}
