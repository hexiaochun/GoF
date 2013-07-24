package com.spring.interpreter;


/**
 * 总裁叫老板
 * @author Administrator
 *
 */

public class President implements Command{

	private Boss boss;
	private String order;
	
	public Boss callBoss(){
		boss			=new Boss();
		return boss;
	}
	
	
	@Override
	public void execute(String order) {
		System.out.println("总裁开始发命令:"+order);
		this.order		=order;
		boss.execute(order);
	}

}
