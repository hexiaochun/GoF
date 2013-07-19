package com.spring.singleton;


/**
 * 单例一般都是用在管理类中，只认许一个实例纯在
 * @author Administrator
 *
 */

public class Manage {
	//饿汗式单例
//	private static Manage manage	=new Manage();
	//懒汉式单例
	private static Manage manage	=null;
	private Manage(){
		
	}
	
	public static Manage instance(){
		if(manage==null){
			manage 	=new Manage();
		}
		return manage;
	}
	
	
	
	public void print(){
		System.out.println("单例被调用了...");
	}

}
