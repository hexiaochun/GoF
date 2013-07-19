package com.spring.abstractfactory;


/**
 * Mac下的界面绘制
 * @author Administrator
 *
 */
public class MacDialog implements CustomDialog{

	@Override
	public IButton getIButton() {
		return new MacButton();
	}

	@Override
	public IFildText getIFildText() {
		return new MacFildText();
	}

}
