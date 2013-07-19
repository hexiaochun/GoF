package com.spring.builder;

/**
 * House建造的具体细节
 * @author Administrator
 *
 */


public class ConcreteBuilder implements Builder{

	private House house;
	
	public ConcreteBuilder() {
		
		house		=new House();
		
	}
	
	@Override
	public void buildBamboo() {
		System.out.println("bamboo");
		house.setBamboo("finish bamboo");
	}

	@Override
	public void buildWindbell() {
		System.out.println("windbell");
		house.setWindbell("finish windbell");
	}

	@Override
	public void buildTeapoy() {
		System.out.println("teapoy");
		house.setTeapoy("finish teapoy");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
