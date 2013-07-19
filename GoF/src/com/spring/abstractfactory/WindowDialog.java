package com.spring.abstractfactory;

/**
 * window�µĽ������
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
