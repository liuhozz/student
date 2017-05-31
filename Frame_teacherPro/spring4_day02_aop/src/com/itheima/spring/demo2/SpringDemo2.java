package com.itheima.spring.demo2;

import org.junit.Test;

public class SpringDemo2 {

	@Test
	/**
	 * cglib的测试
	 */
	public void demo1(){
		CustomerDao customerDao = new CustomerDao();
		
		CustomerDao proxy = new CglibProxy(customerDao).createProxy();
		proxy.save();
		proxy.update();
		proxy.find();
		proxy.delete();
	}
}
