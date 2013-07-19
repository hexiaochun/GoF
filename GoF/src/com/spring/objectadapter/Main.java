package com.spring.objectadapter;

public class Main {

	public static void main(String[] args) {
			Client	client		=new RealAdapter();
		
			
			System.out.println(client.add(12, 2));
			System.out.println(client.sub(12, 2));
			System.out.println(client.mul(12, 2));
			
		
		
	}
	
	
}
