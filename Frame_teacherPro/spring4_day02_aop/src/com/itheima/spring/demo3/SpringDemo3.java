package com.itheima.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * AOP的入门
 * @author jt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

	@Resource(name="productDao")
	private ProductDao productDao;
	
	@Test
	public void demo1(){
		productDao.save();
		productDao.update();
		productDao.delete();
		productDao.find();
	}
}
