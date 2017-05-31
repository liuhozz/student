package com.itheima.test;

public class SameEnds_class {

	private static String substring;

	/**
	38.题目描述:
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
		System.out.println(sameEnds("abXYab"));
	}
	
	public static String sameEnds(String s) {
		String result = "";
		int length = s.length()/2;
		for (int i = 1; i <= length; i++) {
			String start = s.substring(0, i);
			String end = s.substring(s.length()-i);
			System.out.println(start+"="+end);
			if (start.equals(end)) {
				result =  s.substring(0, i);
			}
		}
		return result;
	}

}
