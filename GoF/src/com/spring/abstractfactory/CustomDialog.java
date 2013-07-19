package com.spring.abstractfactory;


/**
 * 抽象工厂的接口
 * @author Administrator
 *
 */

public interface CustomDialog {
	public IButton getIButton();
	public IFildText getIFildText();
}
