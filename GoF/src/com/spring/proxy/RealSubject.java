package com.spring.proxy;


/**
 * 
 * @author Administrator
 *真实对象的控制
 */


public class RealSubject implements Subject{

	private Girl girl;
	
	public RealSubject(Girl girl) {
		this.girl		=girl;
	}
	
	
	@Override
	public void giveFlower() {
		System.out.println(girl.getName()+" get the flower");
	}

	@Override
	public void giveTea() {
		System.out.println(girl.getName()+" get the tea");
	}

	@Override
	public void giveIce() {
		System.out.println(girl.getName()+" get the ice");
	}

}
