package com.spring.proxy;

/**
 * ¥˙¿Ì¿‡
 * @author Administrator
 *
 */


public class Proxy implements Subject{

	private RealSubject realSubject;
	
	public Proxy(Girl girl) {
		realSubject		=new RealSubject(girl);
	}
	
	
	@Override
	public void giveFlower() {
		realSubject.giveFlower();
	}

	@Override
	public void giveTea() {
		realSubject.giveTea();
	}

	@Override
	public void giveIce() {
		realSubject.giveIce();
	}

}
