package com.spring.interpreter;

import java.util.ArrayList;


/**
 * 老板接到总裁的命令后就找经理来处理
 * @author Administrator
 *
 */

public class Boss implements Command{

	private ArrayList<Manage> manages;
	private Manage devmanage;
	private String order;
	
	{
		manages=new ArrayList<Manage>();
		for (int i = 0; i < 4; i++) {
			manages.add(new Manage("xiaowei"+i));
		}
	}
	
	public void serviceForPresident(){
		System.out.println(devmanage.getName()+"经理开始处理...");
		devmanage.execute(order);
	}
	
	@Override
	public void execute(String order) {
		this.order		=order;
		System.out.println("老板开始找经理:"+order);
		devmanage		=manages.get(3);
		serviceForPresident();
	}

}
