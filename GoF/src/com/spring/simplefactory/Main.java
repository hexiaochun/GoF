package com.spring.simplefactory;

public class Main {

	
	
	public static void main(String[] args) {
		Factory factory			=new Factory();
		IMusicBox	piano			=factory.createPiano();
		piano.play();
		IMusicBox	violin		=factory.createViolin();
		violin.play();
	}
}
