package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sumNumbers_class {

	/**
	 37.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名sumNumbers;
  给定一字符串，求出现在字符串中的数字之和。
例如：sumNumbers("abc123xyz") → 123
提示:
方法调用	期望值
sumNumbers("abc123xyz")	123
sumNumbers("aa11b33")	44
sumNumbers("7 11")	18
	 */
	public static void main(String[] args) {
		
		System.out.println(sumNumbers("aa11b33"));
	}
	
	public static int sumNumbers(String str){
		int sum = 0;
		String regex = "\\d+";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			int parseInt = Integer.parseInt(matcher.group());
			sum += parseInt;
		}
		return sum;
	}
}
