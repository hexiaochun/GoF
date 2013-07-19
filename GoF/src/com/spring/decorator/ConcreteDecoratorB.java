package com.spring.decorator;


/**
 * 具体装饰角色1，负责给构件对象"贴上"附加的责任，即添加新的功能 
 * @author Administrator
 *
 */
public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
		
	}

	@Override
	public void dosomething() {
		super.dosomething();
		doOthersomething();
	}
	
	public void doOthersomething() {
		System.out.println("do the thing B");
	}

}
