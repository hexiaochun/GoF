package com.spring.bridge;


/**
 * 圆组合的绘制的接口
 * @author Administrator
 *
 */

public class Circle implements Shape{

	private Draw draw;
	
	public Circle(Draw draw) {
		this.draw	=draw;
	}
	
	
	@Override
	public int getRect() {
		System.out.println("circle");
		draw.draw();
		
		return 0;
	}

}
