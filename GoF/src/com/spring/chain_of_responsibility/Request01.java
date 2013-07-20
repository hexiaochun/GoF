package com.spring.chain_of_responsibility;

/**
 * 具体请求类01
 * 
 * @author Administrator
 * 
 */

public class Request01 extends AbstractRequest {

	public Request01(String content) {
		super(content);
	}

	@Override
	public int getRequestLevel() {
		return Levels.LEVEL_01;
	}

}
