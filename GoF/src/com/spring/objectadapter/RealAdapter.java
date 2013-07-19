package com.spring.objectadapter;


/**
 * 适配器组合了老方法的实现变成新方法
 * @author Administrator
 *
 */

public class RealAdapter implements Client{

	private Plus add;
	
	private Sub sub;
	
	private Mul mul;
	
	public RealAdapter() {
		add		=new Plus();
		sub		=new Sub();
		mul		=new Mul();
		
	}
	
	
	@Override
	public int add(int a, int b) {
		return add.add(a, b);
	}

	@Override
	public int sub(int a, int b) {
		
		return sub.sub(a, b);
	}

	@Override
	public int mul(int a, int b) {
		
		return mul.mul(a, b);
	}

}
