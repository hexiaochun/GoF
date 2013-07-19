package com.spring.defaultadapter;


/**
 * 只写一个要用到的监听就可以了
 * @author Administrator
 *
 */
public class RealControl extends WindowAdapterListener{

	@Override
	public void openListener() {
		super.openListener();
		
		System.out.println("system open");
	}

	
}
