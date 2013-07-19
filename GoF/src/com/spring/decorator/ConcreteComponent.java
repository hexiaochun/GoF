package com.spring.decorator;


/**
 * 具体构件角色  
 * @author Administrator
 *
 */
public class ConcreteComponent implements Component{

	@Override
	public void dosomething() {
		System.out.println("do the thing A");
	}

}
