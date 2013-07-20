package com.spring.command;

import java.util.ArrayList;

/**
 * 按照通常做法,我们就可以直接调用这三个Command
 * ,但是使用Command模式,我们要将他们封装起来,
 * 扔到黑盒子List里去:
 * 
 * @author Administrator
 * 
 */

public class Producer {

	public static ArrayList<Command> producerRequest() {

		ArrayList<Command> list = new ArrayList<Command>();

		list.add(new Engineer());
		list.add(new Programmer());
		list.add(new Politician());

		return list;

	}

}
