package com.spring.chain_of_responsibility;

/**
 * 抽象请求类
 * 
 * @author Administrator
 * 
 */

public abstract class AbstractRequest {

	private String content = null;

	public AbstractRequest(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	// 获得请求的级别
	public abstract int getRequestLevel();

}
