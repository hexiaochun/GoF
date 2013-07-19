package com.spring.abstractfactory;

/**
 * window下的界面绘制
 * @author Administrator
 *
 */


public class WindowDialog implements CustomDialog{

	@Override
	public IButton getIButton() {
		return new WindowButton();
	}

	@Override
	public IFildText getIFildText() {
		return new WindowFildText();
	}

}
