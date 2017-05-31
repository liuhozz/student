package com.heima.store.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.heima.store.enty.Category;
import com.heima.store.enty.Product;
import com.heima.store.utils.Hibernate_SessionUtils;

public class Test_Mapping {

	@Test
	public void dome1(){
		Session session=Hibernate_SessionUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		Product product=new Product();
		product.setPname("asdfghjdfghjdfghjdfg");
		/*Category category=session.get(Category.class, "1");
		product.setPname("123123212");
		product.setCategory(category);
		session.save(product);*/
		Category category=new Category(); 
		category.setCname("bbb");
		product.setCategory(category);
		category.getProduct().add(product);
		session.save(category);
		tr.commit();
		session.close();
	}
}
