package com.spring.interpreter;


/**
 * http://www.iteye.com/topic/599901
 * @author Administrator
 *
 */

public class Main {

	
	public static void main(String[] args) {
		President president		=	new President();
		president.callBoss();
		president.execute("开发SX系统");
	}
	
}
