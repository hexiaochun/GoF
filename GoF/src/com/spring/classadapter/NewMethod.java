package com.spring.classadapter;

/**
 * 新接口连接到老接口上
 * @author Administrator
 *
 */
public class NewMethod extends OldMethod implements Client{

	@Override
	public int sum(int a, int b) {
		return oldsum(a, b);
	}

}
