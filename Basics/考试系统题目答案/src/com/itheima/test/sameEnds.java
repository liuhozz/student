package com.itheima.test;

public class sameEnds {

	/**
	 9题目描述:
	  书写一个类，类名为Itheima;
	  类中有一个方法，方法名sameEnds;
	  给定一字符串，截取出该字符串开头和结尾相同的内容且不可重叠，并返回。
	例如：sameEnds("abXab") is "ab"
	提示:
	方法调用	期望值
	sameEnds("abXYab")	"ab"
	sameEnds("xx")	"x"
	sameEnds("xxx")	"x"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sameEnds("abcab"));
	}
	public static String sameEnds(String str){
		String result = "";
		int len=str.length()/2;
		for (int i = 1; i <= len; i++) {
			String start = str.substring(0, i);
			String end = str.substring(str.length()-i);
			if(start.equals(end)){
				result=str.substring(0, i);
			}
		}
		
		return result;
		
	}

}
