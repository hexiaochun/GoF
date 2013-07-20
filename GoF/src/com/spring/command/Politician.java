package com.spring.command;

public class Politician implements Command {

	@Override
	public void execute() {
		System.out.println(this.getClass().getName());
	}
}
