package com.spring.iterator;

public class Main {

	public static void main(String[] args) {
		Aggregate aggregate			=new ConcreteAggregate();
		aggregate.add("xiaoming");
		aggregate.add("xiaowei");
		aggregate.add("xiaodan");
		
		Iterator iterator		=aggregate.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
