package com.spring.factorymethod;

/**
 * 女人工厂
 * @author Administrator
 *
 */

public class FemalFactory implements GodFactory{

	@Override
	public Person createPerson() {
		return new Female();
	}

}
