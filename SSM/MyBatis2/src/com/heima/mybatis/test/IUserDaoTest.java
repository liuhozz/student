package com.heima.mybatis.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IUserDaoTest {
	private ApplicationContext applicationContext;
	
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
	}

	@Test
	public void testGetUserById() {
		/*IUserDao userDao = applicationContext.getBean(UserDao.class);
		User user = userDao.getUserById(25);
		System.out.println(user);*/
		
	}

	@Test
	public void testGetUserByName() {
		/*IUserDao userDao = applicationContext.getBean(UserDao.class);
		List<User> list = userDao.getUserByName("��");
		for (User user : list) {
			System.out.println(user);
		}*/
		
	}

	@Test
	public void testInsertUser() {
		/*IUserDao userDao = applicationContext.getBean(UserDao.class);
		User user = new User();
		user.setUsername("��С��");
		user.setSex("1");
		user.setAddress("�ɻ��Ͽ�");
		userDao.insertUser(user);*/
	}

}
