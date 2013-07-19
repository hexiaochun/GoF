package com.spring.defaultadapter;


/**
 * 监听类的接口，当我只需要监听关闭接口时就可以建立一个中间层过滤掉不需要的接口
 * @author Administrator
 *
 */
public interface WindowListener {

	public void closeListener();
	public void openListener();
	public void moveListener();
	public void dropListener();
	
}
