package com.spring.proxy;

public class Main {

	
	public static void main(String[] args) {
		Girl girl		=new Girl("xiaowei");
		Proxy proxy		=new Proxy(girl);
		proxy.giveFlower();
		proxy.giveIce();
		proxy.giveTea();
		
		System.out.println("----------------------------");
		//代理有真实类一样的接口，也可以在原来的类上做上面的访问
		RealSubject realSubject	=new RealSubject(girl);
		realSubject.giveFlower();
		realSubject.giveIce();
		realSubject.giveTea();
		
		
	}
}
