package com.spring.composite;


/**
 * 透明模式：也就是说在Component中声明所有用来管理子对象的方法，其中包括Add、Remove等。
 * 这样实现Component接口的所有子类都具备了Add和Remove。这样做的好处就是叶节点和枝节点对于外界没有区别，
 * 它们具有完全一致的行为接口，但问题也很明显，因为Leaf类本身不具备Add(),Remove()方法的功能，所以实现他是没有意义的。
 * @author Administrator
 *安全模式：就是在Component接口中不去声明Add和Remove方法，
 *那么子类的Leaf也就不需要去实现它，
 *而是在Composite声明所有用来管理子类对象的方法，
 *这样就不会出现透明模式出现的问题，不过由于不够透明，
 *所以叶节点和枝节点将不具有相同的接口，
 *客户端调用需要做相应的判断，带来了不便。
 *
 */

public class Main {

	
	public static void main(String[] args) {
		Composite root		=new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		Composite comp		=new Composite("composite x");
		comp.add(new Leaf("xa"));
		comp.add(new Leaf("xb"));
		
		root.add(comp);
		
		 Composite comp2 = new Composite("Composite XY");
         comp2.add(new Leaf("Leaf XYA"));
         comp2.add(new Leaf("Leaf XYB"));

         comp.add(comp2);

         root.add(new Leaf("Leaf C"));

         Leaf leaf = new Leaf("Leaf D");
         root.add(leaf);
//         root.remove(leaf);

         root.display(1);
		
		
		
	}
}
