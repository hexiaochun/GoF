package com.spring.prototype;

/**
 * 原型模式就是做一个对象的副本，可以对副本操作不影响原型对象
 * @author Administrator
 *
 */

public class Main {

	
	public static void main(String[] args) {
		try {
			ClonePerson person			=new ClonePerson("xiaowei", 170, 21);
			ClonePerson person_copy		=(ClonePerson) person.clone();
			
			System.out.println(person.getName()+" "+person.getAge()+" "+person.getHight());
			
			
			System.out.println(person_copy.getName()+" "+person_copy.getAge()+" "+person_copy.getHight());
			
			person_copy.setAge(22);

			System.out.println("-------------------");
			System.out.println(person.getName()+" "+person.getAge()+" "+person.getHight());
			System.out.println(person_copy.getName()+" "+person_copy.getAge()+" "+person_copy.getHight());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
