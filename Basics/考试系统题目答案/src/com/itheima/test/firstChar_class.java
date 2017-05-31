package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class firstChar_class {

	/**
	 *53 书写一个类，类名为Itheima;
	  类中有一个方法，方法名firstChar;
	  给定一个非空字符串数组，为每个不同的第一个字符返回一个Map ，
	键为字符串的首个字符，值为含有该键首个字符的所有字符串进行追加，例如：["salt","tea","soda","toast"]字符串数组
	返回结果是{“t”:"teatoast","s":"saltsoda"}，键是不同字符串的首个字符，值是按它们在数组中的顺序追加在一起。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstChar(new String[]{"salt","tea","soda","toast"}));
	}
	
	public static Map<String,String> firstChar(String[] arr){
		HashMap<String, String> hm = new HashMap<String, String>();
		for (String string : arr) {
			hm.put(string.charAt(0)+"", !hm.containsKey(string.charAt(0)+"")?string:string+hm.get(string.charAt(0)+""));
		}
		
		return hm;
		
	}

}
