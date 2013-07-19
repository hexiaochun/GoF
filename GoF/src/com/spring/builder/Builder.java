package com.spring.builder;

/**
 * Build的抽象接口
 * @author Administrator
 *
 */

public interface Builder {

	//建造竹子
	public void buildBamboo();
	//建造风铃
	public void buildWindbell();
	//建造茶几
	public void buildTeapoy();
	
	public House getHouse();
}
