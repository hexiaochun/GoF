package com.spring.abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		
		
		CustomDialog dialog			=new WindowDialog();
		
		dialog.getIButton().paintButton();
		dialog.getIFildText().paintText();
		
		
		CustomDialog dialog2			=new MacDialog();
		
		dialog2.getIButton().paintButton();
		dialog2.getIFildText().paintText();
	}
	
	
}
