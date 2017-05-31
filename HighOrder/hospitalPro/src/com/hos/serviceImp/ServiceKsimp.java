package com.hos.serviceImp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hos.Dao.KeshiDao;
import com.hos.beans.Keshi;
import com.hos.serviceDao.ServiceKs;

public class ServiceKsimp implements ServiceKs {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	KeshiDao KS=(KeshiDao) context.getBean("keshiDao");
	public Boolean deleteKS(int id) {
		// TODO Auto-generated method stub
		return KS.deleteKS(id);
	}

	public Keshi findById(int id) {
		// TODO Auto-generated method stub
		return KS.findById(id);
	}

	public List<Keshi> findKeshi() {
		// TODO Auto-generated method stub
		return KS.findKeshi();
	}

	public Boolean saveKS(Keshi ks, String a, String b, String c,int d,String e,String f) {
		// TODO Auto-generated method stub
		return KS.saveKS(ks, a, b, c, d, e, f);
	}

	public Boolean updateKS(int id,String ksIntroduce) {
		// TODO Auto-generated method stub
		return KS.updateKS(id, ksIntroduce);
	}

}
