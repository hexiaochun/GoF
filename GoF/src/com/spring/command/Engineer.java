package com.spring.command;

/**
 * 具体命令
 * @author Administrator
 *
 */

public class Engineer implements Command {

	@Override
	public void execute() {
		System.out.println(this.getClass().getName());
	}

}
