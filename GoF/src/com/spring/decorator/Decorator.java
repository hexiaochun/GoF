package com.spring.decorator;


/**
 * 装饰角色：持有一个构件(Component)对象的引用  
 * @author Administrator
 *
 */
public class Decorator implements Component{

	private Component component;
	
	public Decorator(Component component) {
		this.component	=component;
		
	}
	
	@Override
	public void dosomething() {
		component.dosomething();
	}
	
}
