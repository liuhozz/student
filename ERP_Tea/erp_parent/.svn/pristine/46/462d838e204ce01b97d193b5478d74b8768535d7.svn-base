package cn.itcast.erp.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.erp.biz.IEmpBiz;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext_test.xml"})
public class EmpTest {
	
	
	@SuppressWarnings("resource")
	@Test
	public void testLogic() throws FileNotFoundException{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		IEmpBiz bean = (IEmpBiz) context.getBean("empBiz");
		bean.export(new FileOutputStream("d:\\xxd\\1.xsl"), null);
		
	}
	

}
