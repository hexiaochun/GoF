package com.spring.command;

/**
 * 典型的Command模式需要有一个接口. 接口中有一个统一的方法, 这就是"将命令/请求封装为对象":
 * 
 * @author Administrator
 * 
 */
public interface Command {

	public void execute();

}
