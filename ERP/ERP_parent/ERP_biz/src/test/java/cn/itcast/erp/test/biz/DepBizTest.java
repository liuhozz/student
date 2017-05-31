package cn.itcast.erp.test.biz;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.erp.biz.IDepBiz;
import cn.itcast.erp.entity.Dep;


public class DepBizTest {

	@Test
	public void TestSaveDep(){
		ApplicationContext ac =new ClassPathXmlApplicationContext("classpath*:spring/applicationContext_*.xml");
		IDepBiz depBiz = (IDepBiz)ac.getBean("depBiz");
		Dep dep = new Dep();
		dep.setName("111");
		dep.setTele("222");
		depBiz.save(dep);
	}
	@Test
	public void TestUpdateDep(){
		ApplicationContext ac =new ClassPathXmlApplicationContext("classpath*:spring/applicationContext_*.xml");
		IDepBiz depBiz = (IDepBiz)ac.getBean("depBiz");
		/*Dep dep = new Dep();
		dep.setName("111");
		dep.setTele("222");
		dep.setUuid(17l);*/
		
		System.out.println(depBiz.getDep(10l));
	}
}
