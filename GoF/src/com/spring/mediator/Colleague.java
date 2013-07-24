package com.spring.mediator;

public abstract class Colleague {
	public Mediator mediator;
	
	
	public Colleague(Mediator mediator){
		this.mediator		=mediator;
	}

	public abstract void send(String msg);
	public abstract void read(String msg);

}
