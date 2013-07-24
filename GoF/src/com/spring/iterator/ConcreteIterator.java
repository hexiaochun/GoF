package com.spring.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator{

	private List list		=new ArrayList<>();
	private int current=0;
	
	public ConcreteIterator(List list) {
		this.list		=list;
	}
	
	@Override
	public Object next() {
		Object object		=null;
		if(this.hasNext()){
			object		=list.get(current++);
		}
		return object;
	}

	@Override
	public boolean hasNext() {
		if(current!=list.size()){
			return true;
		}
		return false;
	}

}
