package com.spring.singleton;


/**
 * ����һ�㶼�����ڹ������У�ֻ����һ��ʵ������
 * @author Administrator
 *
 */

public class Manage {
	//����ʽ����
//	private static Manage manage	=new Manage();
	//����ʽ����
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
		System.out.println("������������...");
	}

}
