package com.hos.serviceImp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hos.Dao.Specialist_ExpertDao;
import com.hos.beans.Specialist_Expert;
import com.hos.serviceDao.ServiceSE;

public class ServiceSEimp implements ServiceSE {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Specialist_ExpertDao sE=(Specialist_ExpertDao) context.getBean("sEDao");
	public Boolean deleteSE(int id) {
		// TODO Auto-generated method stub
		return sE.deleteSE(id);
	}

	public Specialist_Expert findById(int id) {
		// TODO Auto-generated method stub
		return sE.findById(id);
	}

	public List<Specialist_Expert> findSpecialist_Expert() {
		// TODO Auto-generated method stub
		return sE.findSpecialist_Expert();
	}

	public Boolean saveSE(Specialist_Expert SE, String a, String b, int c,
			String d,  String g, String h) {
		// TODO Auto-generated method stub
		return sE.saveSE(SE, a, b, c, d,  g, h);
	}
   
}
