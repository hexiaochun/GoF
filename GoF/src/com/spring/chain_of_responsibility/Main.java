package com.spring.chain_of_responsibility;

/**
 * 
 * @author Administrator
 * 
 *         运行结果
 * 
 * 
 *         处理者-01 处理：1 
 *         当前 处理者-01 不足以处理 请求-02 
 *         处理者-02 处理：2 
 *         当前 处理者-01 不足以处理 请求-03
 *         当前 处理者-02 不足以处理 请求-03 
 *         处理者-03 处理：3
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// 创建指责链的所有节点
		AbstractHandler handler01 = new Handler01();
		AbstractHandler handler02 = new Handler02();
		AbstractHandler handler03 = new Handler03();

		// 进行链的组装，即头尾相连，一层套一层
		handler01.setNextHandler(handler02);
		handler02.setNextHandler(handler03);

		// 创建请求并提交到指责链中进行处理
		AbstractRequest request01 = new Request01("request01");
		AbstractRequest request02 = new Request02("request02");
		AbstractRequest request03 = new Request03("request03");

		// 每次提交都是从链头开始遍历
		handler01.handleRequest(request01);
		handler01.handleRequest(request02);
		handler01.handleRequest(request03);

	}

}
