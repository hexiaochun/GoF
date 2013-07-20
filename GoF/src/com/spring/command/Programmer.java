package com.spring.command;

public class Programmer implements Command {

	@Override
	public void execute() {
		System.out.println(this.getClass().getName());
	}

}
