package com.spring.simplefactory;

/**
 * 工厂方法
 * @author Administrator
 *
 */


public class Factory {

	public IMusicBox createPiano(){
		return new PianoBox();
	}
	
	public IMusicBox createViolin(){
		return new ViolinBox();
	}
	
}
