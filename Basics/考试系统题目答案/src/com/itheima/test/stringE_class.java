package com.itheima.test;

public class stringE_class {

	/**
	 题目描述:
书写一个类，类名为Itheima;
类中有一个方法，方法名stringE;
返回 true 如果字符串中包含1到3个 'e' 字符.
提示:
方法调用	期望值
stringE("Hello")	true
stringE("Heelle")	true
stringE("Heelele")	false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringE("Hello"));
		System.out.println(stringE("Heelle"));
		System.out.println(stringE("Heelele"));
	}
	
	public static boolean stringE(String str){
		int count=0;
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if(c=='e'){
				count++;
			}
		}
		if(count>=1&&count<=3){
			return true;
		}else{
			return false;
		}
		
	}

}
