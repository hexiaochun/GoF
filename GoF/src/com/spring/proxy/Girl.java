package com.spring.proxy;


/**
 * 要操作的对象
 * @author Administrator
 *
 */

public class Girl {

	private String name;
	public Girl(String name) {
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
