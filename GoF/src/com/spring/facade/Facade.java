package com.spring.facade;

/**
 * 门面组合类
 * @author Administrator
 *
 */

public class Facade {

	private Diascope diascope;
	
	private Dvd dvd;
	
	private Music music;
	
	public Facade(Diascope diascope,Dvd dvd,Music music) {
		
		this.diascope		=diascope;
		this.dvd			=dvd;
		this.music			=music;
		
	}
	
	public void turnon(){
		diascope.turnon();
		dvd.play();
		music.on();
	}

	public void trunoff(){
		diascope.turnoff();
		dvd.stop();
		music.off();
	}
	
}
