package com.spring.chain_of_responsibility;

/**
 * 具体请求类02
 * 
 * @author Administrator
 * 
 */
public class Request02 extends AbstractRequest {

	public Request02(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_02;
	}

}
