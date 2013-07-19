package com.spring.abstractfactory;

/**
 * Window下的FildText的实现
 * @author Administrator
 *
 */

public class WindowFildText implements IFildText{

	@Override
	public void paintText() {

		System.out.println("window fild text");
	}

}
