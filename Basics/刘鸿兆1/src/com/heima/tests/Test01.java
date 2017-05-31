package com.heima.tests;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {

	/**
	 *需求:在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<>();
		str.add("mdds");
		str.add("tgkd");
		str.add("qeg");
		str.add("wx");
		str.add("asf");
		str.add("asf");
		str.add("asf");
		
		px(str);
		System.out.println(str);
		
	}

	public static void px(ArrayList<String> str) {
		// TODO Auto-generated method stub
		Collections.sort(str);
		
	}
	
	

}
