package com.spring.composite;

/**
 * 组合中的对象声明接口，
 * 在适当情况下实现所有类共有的默认行为，
 * 声明一个接口用于访问和管理Component的子组件。
 * 在递归结构中定义一个接口，用于访问一个父部件，
 * 并在合适的情况下实现它。
 * @author Administrator
 *
 */

public abstract class Component {

	public String name;
	
	public Component(String name){
		this.name	=name;
	}
	
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void display(int depth);
	
}
