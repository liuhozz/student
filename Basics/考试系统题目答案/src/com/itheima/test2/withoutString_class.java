package com.itheima.test2;

public class withoutString_class {

	/**
	
10.书写一个类，类名为Itheima;

  类中有一个方法，方法名withoutString;

  给定两个字符串，base和remove，返回删除了remove字符串的base字符串（不区分大小写），
并且返回的base字符串不含有remove的重叠事例。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutString("adeFabcDEFbdefc","def"));

	}
	public static String withoutString(String s1,String s2){
		for (int i = 0; i < s1.length()-1; i++) {
			String string = s1.substring(i, s2.length()+i);
			if(string.equalsIgnoreCase(s2)){
				s1 = s1.replaceAll(string, "");
			}
		}
		return s1;
		
	}
}
