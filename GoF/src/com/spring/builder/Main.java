package com.spring.builder;

public class Main {
	
	
	public static void main(String[] args) {
		ConcreteBuilder builder			=new ConcreteBuilder();
		
		Director director		=new Director(builder);
		
		director.construct();
		
		House house		=builder.getHouse();
		
		System.out.println(house);
		
		
	}
	

}
