package com.spring.simplefactory;

/**
 * ��������
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
