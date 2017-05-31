/**
 * 
 */
package com.hos.DaoImp;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.hos.Dao.LoginDao;
import com.hos.beans.Login_user;

/**
 * @author Administrator
 *
 */
public class LoginDaoImp extends HibernateDaoSupport implements LoginDao {

	/**
	 * 
	 */
	public LoginDaoImp() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unchecked")
	public List<Login_user > find(String um ,String pw) {
		List<Login_user > user=this.getHibernateTemplate().find("from Login_user where username=? and password=?",new Object[]{um,pw});
		return user;

	}
	public Boolean save(Login_user user, String um, String pw) {
		user.setUsername(um);
	    user.setPassword(pw);
		this.getHibernateTemplate().save(user);
		return true;
	}
}
