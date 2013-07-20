package com.spring.bridge;


/**
 * 多维变化的抽象设计
 * 桥梁模式的用意是将问题的抽象和实现分离开来实现，通过用聚合代替继承来解决子类爆炸性增长的问题。 
 *	比如我们有一个画图程序 有2个图形（Circle Rectangle ）和2种画图方法（Drawing1 Drawing2） 
 *	图形可能会使用Drawing1来画图 也可能使用Drawing2来画图 
 *	在这个画图程序中有两个可变因素 一个是图形的种类 有可能会增加新的图形 另一个是画图方法 可能会有Drawing3出现 
 *	当系统有两个可变因素时 我就应该考虑到桥梁模式，至少它应该在你的脑子里闪过
 * @author Administrator
 *
 */

public class Main {

	public static void main(String[] args) {
		Draw draw		=new DrawBlue();
		
		Circle circle		=new Circle(draw);
		circle.getRect();

		draw				=new DrawYellow();
		Rectangle rectangle		=new Rectangle(draw);
		rectangle.getRect();
	}
	
}
