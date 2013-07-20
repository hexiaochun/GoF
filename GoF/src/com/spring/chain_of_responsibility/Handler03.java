package com.spring.chain_of_responsibility;

/**
 * 处理类03
 * 
 * @author Administrator
 * 
 */

public class Handler03 extends AbstractHandler {

	@Override
	protected int getHandlerLevel() {
		return Levels.LEVEL_03;
	}

	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("处理者-03 处理：" + request.getRequestLevel());
	}

}
