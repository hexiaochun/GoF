package com.spring.singleton;

public class Main {

	public static void main(String[] args) {
		
		Manage manage			=Manage.instance();
		manage.print();
		
		RegisterSome some			=new RegisterSome();
		some.setName("register singleton");
		System.out.println(some.getName());
		
		RegisterSome some_copy	=  (RegisterSome) RegisterSingleton.instance(some.getClass().getName());
		System.out.println(some_copy.getName());
		
		
		
	}
	
}
