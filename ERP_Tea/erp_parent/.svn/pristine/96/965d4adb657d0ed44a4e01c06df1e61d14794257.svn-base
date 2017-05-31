package cn.itcast.erp.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.erp.biz.IStoreBiz;
import cn.itcast.erp.entity.Store;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext_test.xml"})
public class StoreTest {
	
	@SuppressWarnings("resource")
	@Test
	public void testLogic(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		IStoreBiz bean = (IStoreBiz) context.getBean("storeBiz");
		Store t = new Store();
		t.setEmpuuid(1l);
		t.setName("xxd");
		bean.add(t);
	}
	

}
