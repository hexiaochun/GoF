package com.spring.command;

import java.util.ArrayList;


/**
 * 客户端直接调用execute方法，无需知道被调用者的其它更多类的方法名。
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<Command>  list			=Producer.producerRequest();
		
		for (Command command : list) {
			command.execute();
		}
		
	}
	
}
