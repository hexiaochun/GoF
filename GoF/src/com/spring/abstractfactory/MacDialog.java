package com.spring.abstractfactory;

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
