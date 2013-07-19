package com.spring.builder;

/**
 * 要建造的房子
 * @author Administrator
 *
 */


public class House {

	private String bamboo;
	private String teapoy;
	private String windbell;
	public String getBamboo() {
		return bamboo;
	}
	public void setBamboo(String bamboo) {
		this.bamboo = bamboo;
	}
	public String getTeapoy() {
		return teapoy;
	}
	public void setTeapoy(String teapoy) {
		this.teapoy = teapoy;
	}
	public String getWindbell() {
		return windbell;
	}
	public void setWindbell(String windbell) {
		this.windbell = windbell;
	}
	@Override
	public String toString() {
		return "House [bamboo=" + bamboo + ", teapoy=" + teapoy + ", windbell="
				+ windbell + "]";
	}
	
	
}
