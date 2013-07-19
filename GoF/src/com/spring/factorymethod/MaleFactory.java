package com.spring.factorymethod;

/**
 * 男人工厂
 * @author Administrator
 *
 */


public class MaleFactory implements GodFactory{

	@Override
	public Person createPerson() {
		return new Male();
	}

}
