package com.itheima.spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * XML和注解整合开发
 * @author jt
 *
 */
public class SpringDemo3 {

	@Test
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService productService = (ProductService) applicationContext.getBean("productService");
		productService.save();
	}
}
