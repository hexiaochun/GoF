package com.spring.chain_of_responsibility;

/**
 * 处理类02
 * 
 * @author Administrator
 * 
 */

public class Handler02 extends AbstractHandler {

	@Override
	protected int getHandlerLevel() {
		return Levels.LEVEL_02;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("处理者-02 处理：" + request.getRequestLevel());
	}

}
