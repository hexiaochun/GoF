package com.spring.simplefactory;


/**
 * 具体产品
 * @author Administrator
 *
 */
public class ViolinBox implements IMusicBox{

	@Override
	public void play() {
		System.out.println("violinBox play");
	}

	
	
}
