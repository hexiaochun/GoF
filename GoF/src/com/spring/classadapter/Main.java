package com.spring.classadapter;

public class Main {

	
	 public static void main(String[] args) {
		 //新接口调用老接口
		 Client client			=new NewMethod();
		 System.out.println(client.sum(1, 2));
		 
		 //老接口
		 OldMethod method	=new OldMethod();
		 System.out.println(method.oldsum(1, 2));
		 
	}
	
	
}
