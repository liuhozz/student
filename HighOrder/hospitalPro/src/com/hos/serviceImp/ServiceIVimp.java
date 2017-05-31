/**
 * 
 */
package com.hos.serviceImp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hos.Dao.ImgVedioDao;
import com.hos.beans.Img_Vedio;
import com.hos.serviceDao.ServiceIV;

/**
 * @author Administrator
 *
 */
public class ServiceIVimp implements ServiceIV {

	/**
	 * 
	 */
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	ImgVedioDao bt=(ImgVedioDao) context.getBean("imgVedioDao");
	public ServiceIVimp() {
		// TODO Auto-generated constructor stub
	}

	public Boolean deleteIV(int id) {
		
		return bt.deleteIV(id);
		
	}

	public Img_Vedio findById(int id) {
		// TODO Auto-generated method stub
		return bt.findById(id);
	}

	public List<Img_Vedio> findImgVedio() {
		// TODO Auto-generated method stub
		return bt.findImgVedio();
	}

	public Boolean saveIV(Img_Vedio iv, String a, String b, String c, String d,
			String e) {
		// TODO Auto-generated method stub
		return bt.saveIV(iv, a, b, c, d, e);
	}

}
