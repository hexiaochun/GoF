package com.spring.mediator;


/**
 * http://hudeyong926.iteye.com/blog/796202
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreteMediator concreteMediator		=new ConcreteMediator();
		
		Colleague colleague1					=new ConcreteColleague1(concreteMediator);
		Colleague colleague2					=new ConcreteColleague2(concreteMediator);
		
		concreteMediator.setColleague1(colleague1);
		concreteMediator.setColleague2(colleague2);
		
		colleague2.send("fuck you too");
		colleague1.send("fuck you ");
		
	}
}
