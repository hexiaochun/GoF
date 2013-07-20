package com.spring.chain_of_responsibility;

/**
 * 具体请求类03
 * 
 * @author Administrator
 * 
 */
public class Request03 extends AbstractRequest {

	public Request03(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_03;
	}

}
