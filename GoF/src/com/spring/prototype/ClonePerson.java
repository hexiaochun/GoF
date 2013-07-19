package com.spring.prototype;


/**
 * 原型类和重写的克隆类
 * @author Administrator
 *
 */

public class ClonePerson implements Cloneable{

	private String name;
	
	private int hight;
	
	private int age;

	
	public ClonePerson(String name,int hight,int age) {
		this.name	=name;
		this.hight	=hight;
		this.age	=age;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ClonePerson(name, hight, age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
