package com.spring.abstractfactory;

/**
 * Mac��Button��ʵ��
 * @author Administrator
 *
 */


public class MacButton implements IButton{

	@Override
	public void paintButton() {
		System.out.println("mac button");
	}

}
