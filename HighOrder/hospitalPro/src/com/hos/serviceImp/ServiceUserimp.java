/**
 * 
 */
package com.hos.serviceImp;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hos.Dao.LoginDao;
import com.hos.beans.Login_user;
import com.hos.serviceDao.ServiceUser;

/**
 * @author Administrator
 *
 */
public class ServiceUserimp implements ServiceUser {

	/**
	 * 
	 */
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	LoginDao user=(LoginDao) context.getBean("userDao");
	public ServiceUserimp() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.hos.serviceDao.ServiceUser#find(java.lang.String, java.lang.String)
	 */
	public List<Login_user > find(String um, String pw) {
		// TODO Auto-generated method stub
		return this.user.find(um, pw);
	}

	/* (non-Javadoc)
	 * @see com.hos.serviceDao.ServiceUser#saveIV(com.hos.beans.Login_user, java.lang.String, java.lang.String)
	 */
	public Boolean save(Login_user user, String um, String pw) {
		// TODO Auto-generated method stub
		return this.user.save(user, um, pw);
	}

}
