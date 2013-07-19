package com.spring.abstractfactory;

/**
 * Mac下Button的实现
 * @author Administrator
 *
 */


public class MacButton implements IButton{

	@Override
	public void paintButton() {
		System.out.println("mac button");
	}

}
