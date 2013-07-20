package com.spring.bridge;

/**
 * 具体的绘制方法2
 * @author Administrator
 *
 */

public class DrawYellow implements Draw{

	@Override
	public void draw() {
		System.out.println("add yellow");
	}

}
