package com.spring.facade;

public class Main {

	
	
	public static void main(String[] args) {
		Facade facade		=new Facade(new Diascope(), new Dvd(), new Music());
		
		facade.turnon();
		
		facade.trunoff();
	}
}
