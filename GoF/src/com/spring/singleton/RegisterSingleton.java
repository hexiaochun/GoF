package com.spring.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * ע��ʽ����
 * @author Administrator
 *
 */

public class RegisterSingleton {

	//��¼ʵ��
	private static Map<String, Object> hash  =new HashMap<String ,Object>();
	
	private RegisterSingleton(){
		
	}
	
	
	public static void register(String name,Object singleton){
		if(!hash.containsKey(name)){
			hash.put(name, singleton);
		}
	}
	
	public static Object instance(String classname){
		Object singleton			=hash.get(classname);
		if(singleton!=null){
			return singleton;
		}
		try {
			singleton					=Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		hash.put(classname, singleton);
		return singleton;
	}
	
	
}
