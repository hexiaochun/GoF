package com.spring.interpreter;

import java.util.ArrayList;

public class Manage implements Command{

	private String name;
	private String order;
	private ArrayList<Employee> devs;
	private ArrayList<Employee> designs;
	private ArrayList<Employee> team;
	
	{
		devs		=new ArrayList<Employee>();
		designs		=new ArrayList<Employee>();
		team		=new ArrayList<Employee>();
		for (int i = 0; i < 4; i++) {
			devs.add(new Employee("devs"+i));
			designs.add(new Employee("design"+i));
		}
	}
	
	public void serviceForBoss(){
		System.out.println(this.name+"分派好了任务...");
		for (Employee employee : team) {
			employee.execute(order);
		}
		
	}
	
	public Manage(String name) {
		this.setName(name);
	}
	
	@Override
	public void execute(String order) {
		this.order		=order;
		team.add(devs.get(0));
		team.add(devs.get(1));
		team.add(devs.get(2));
		team.add(designs.get(3));
		team.add(designs.get(2));
		serviceForBoss();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
