package com.spring.factorymethod;




public class Main {

	
	public static void main(String[] args) {
		
		Person person;
		
		GodFactory godFactory			=new MaleFactory();
		person							=godFactory.createPerson();
		person.eat();
		
		GodFactory godFactory2			=new FemalFactory();
		person							=godFactory2.createPerson();
		person.eat();
		
		
	}
}
