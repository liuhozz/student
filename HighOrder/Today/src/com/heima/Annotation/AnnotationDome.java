package com.heima.Annotation;

import java.lang.reflect.Method;

public class AnnotationDome {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("com.heima.Annotation.Daoo");
		
		Method[] mds = clazz.getDeclaredMethods();
		for (Method me : mds) {
			boolean falg = me.isAnnotationPresent(First.class);
			System.out.println(falg);
			if(falg){
				Daoo daoo = new Daoo();
				me.invoke(daoo);
				//daoo.eat();
				}
		}
		
	}
}
