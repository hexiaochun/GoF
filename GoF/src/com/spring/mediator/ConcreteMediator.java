package com.spring.mediator;

public class ConcreteMediator implements Mediator{

	private Colleague colleague1;
	private Colleague colleague2;
	
	@Override
	public void sendMsg(String msg, Colleague c) {
	
		if(colleague1   ==c){
			this.colleague2.read(msg);
		}else{
			this.colleague1.read(msg);
		}
	}
	
	public void setColleague1(Colleague colleague1){
		this.colleague1			= colleague1;
	}
	
	public void setColleague2(Colleague colleague2){
		this.colleague2				=colleague2;
	}
	

}
