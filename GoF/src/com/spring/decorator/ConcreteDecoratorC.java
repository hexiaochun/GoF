package com.spring.decorator;


/**
 * 具体装饰角色2  
 * @author Administrator
 *
 */
public class ConcreteDecoratorC extends Decorator{

	public ConcreteDecoratorC(Component component) {
		super(component);
	}

	@Override
	public void dosomething() {
		super.dosomething();
		doOthersomething();
	}
	
	public void doOthersomething() {
		System.out.println("do the thing C");
	}

}
