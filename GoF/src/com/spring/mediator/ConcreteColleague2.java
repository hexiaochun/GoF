package com.spring.mediator;

public class ConcreteColleague2 extends Colleague {

	
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String msg) {
	
		System.out.println(this.getClass().getName()+" send "+msg);
		mediator.sendMsg(msg, this);
	}

	@Override
	public void read(String msg) {
		System.out.println(this.getClass().getName()+" read "+ msg);
	}

}
