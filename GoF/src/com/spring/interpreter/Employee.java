package com.spring.interpreter;

public class Employee implements Command{

	private String name;
	public Employee(String name) {
		this.setName(name);
	}
	@Override
	public void execute(String order) {
		System.out.println(getName()+":我们开始干："+order);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
