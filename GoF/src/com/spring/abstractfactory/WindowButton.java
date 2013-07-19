package com.spring.abstractfactory;

public class WindowButton implements IButton{

	@Override
	public void paintButton() {
		System.out.println("window button");
	}

}
