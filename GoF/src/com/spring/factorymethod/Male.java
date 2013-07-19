package com.spring.factorymethod;


/**
 * 男人
 * @author Administrator
 *
 */

public class Male implements Person{

	@Override
	public void talk() {
		System.out.println("big talk");
	}

	@Override
	public void eat() {
		System.out.println("big eat");
	}

	@Override
	public void sleep() {
		System.out.println("big sleep");
	}

}
