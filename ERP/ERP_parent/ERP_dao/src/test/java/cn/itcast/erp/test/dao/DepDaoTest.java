package cn.itcast.erp.test.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.erp.dao.IDepDao;
import cn.itcast.erp.entity.Dep;

public class DepDaoTest {

	@Test
	public void TestDep(){
		
		/*ApplicationContext ac =new ClassPathXmlApplicationContext("classpath*:spring/applicationContext_*.xml");
		IDepDao depDao = (IDepDao)ac.getBean("depDao");
		Dep dep = new Dep();
		dep.setName("工");
		List<Dep> list = depDao.findByCrata(dep, 1, 10);
		System.out.println(list.size());
		for (Dep dep2 : list) {
			System.out.println(dep2.getName()+"...."+dep2.getTele());
		}*/
		
	}
	
	
	
}
