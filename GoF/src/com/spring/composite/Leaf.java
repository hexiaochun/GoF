package com.spring.composite;


/**
 * 树叶节点
 * 在组合中表示叶节点，叶节点没有子节点，定义对象的基本行为。
 * @author Administrator
 *
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
	}

	@Override
	public void remove(Component component) {
	}

	@Override
	public void display(int depth) {
	}

}
