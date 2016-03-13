package com.test.sample.bean;

/**
 * @author ravi_exception
 *
 */
public class Employee {

	private String id;
	private String name;
	
	public Employee(String id, String name){
		this.id=id;
		this.name=name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}
