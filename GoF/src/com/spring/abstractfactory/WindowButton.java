package com.spring.abstractfactory;

/**
 * Window下的Button实现
 * @author Administrator
 *
 */

public class WindowButton implements IButton{

	@Override
	public void paintButton() {
		System.out.println("window button");
	}

}
