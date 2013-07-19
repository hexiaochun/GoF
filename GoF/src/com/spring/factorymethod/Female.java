package com.spring.factorymethod;

/**
 * 女人
 * @author Administrator
 *
 */
public class Female implements Person{

	@Override
	public void talk() {
		System.out.println("small talk");
	}

	@Override
	public void eat() {
		System.out.println("small eat");
	}

	@Override
	public void sleep() {
		System.out.println("small sleep");
	}

}
