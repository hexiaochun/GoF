package com.spring.proxy;

public class Main {

	
	public static void main(String[] args) {
		Girl girl		=new Girl("xiaowei");
		Proxy proxy		=new Proxy(girl);
		proxy.giveFlower();
		proxy.giveIce();
		proxy.giveTea();
		
		System.out.println("----------------------------");
		//��������ʵ��һ���Ľӿڣ�Ҳ������ԭ��������������ķ���
		RealSubject realSubject	=new RealSubject(girl);
		realSubject.giveFlower();
		realSubject.giveIce();
		realSubject.giveTea();
		
		
	}
}
