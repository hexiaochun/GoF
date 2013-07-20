package com.spring.bridge;


/**
 * 具体的绘制方法1
 * @author Administrator
 *
 */
public class DrawBlue implements Draw{

	@Override
	public void draw() {
		System.out.println("add blue");
	}

}
