package com.spring.abstractfactory;

/**
 * Window�µ�Buttonʵ��
 * @author Administrator
 *
 */

public class WindowButton implements IButton{

	@Override
	public void paintButton() {
		System.out.println("window button");
	}

}
