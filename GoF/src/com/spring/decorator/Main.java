package com.spring.decorator;

public class Main {

	
	
	public static void main(String[] args) {
		Component		component			=new ConcreteDecoratorC(new ConcreteDecoratorB(new ConcreteComponent()));
		component.dosomething();
	}
}
