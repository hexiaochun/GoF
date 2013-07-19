package com.spring.builder;

/**
 * 导演类组装零件
 * @author Administrator
 *
 */

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder 	=builder;
		
	}
	
	
	public void construct(){
		builder.buildBamboo();
		builder.buildWindbell();
		builder.buildTeapoy();
	}
	
	
}
