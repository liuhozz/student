package com.heima.store.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_SessionUtils {
	
	private static final Configuration cf;
	private static final SessionFactory sf;
	
	static {
		cf=new Configuration().configure();
		sf=cf.buildSessionFactory();
	}

	public static Session getSession(){
		return sf.openSession();
	}
	
	public static Session getCurrentSession(){
		return sf.getCurrentSession();
	}
}
