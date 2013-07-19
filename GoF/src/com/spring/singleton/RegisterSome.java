package com.spring.singleton;

/**
 * 注册单例的使用
 * @author Administrator
 *
 */


public class RegisterSome {

	private String name;
	
	
	public RegisterSome() {
		RegisterSingleton.register(RegisterSome.class.getName(), this);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
