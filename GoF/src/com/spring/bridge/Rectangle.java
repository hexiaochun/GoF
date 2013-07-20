package com.spring.bridge;

/**
 * 正方形组合绘制的接口
 * @author Administrator
 *
 */

public class Rectangle implements Shape{

	private Draw draw;
	
	public Rectangle(Draw draw) {
		this.draw		=draw;
	}
	
	@Override
	public int getRect() {
		System.out.println("rect");
		draw.draw();
		return 0;
	}

	
}
