package com.spring.composite;

import java.util.ArrayList;

/**
 * 树枝节点
 * 定义有子部件的那些部件的行为，存储子部件并在Component接口实现与子部件有关的操作。
 * @author Administrator
 *
 */

public class Composite extends Component{


	private ArrayList<Component> children    =new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		if(children.contains(component)){
			children.remove(component);
		}
	}

	@Override
	public void display(int depth) {
		
		for (Component iterable : children) {
			iterable.display(depth+2);
		}
		
	}

}
