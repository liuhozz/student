package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoTwo {

	/**
	 20.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名twoTwo;
  给定一个整型数组，如果数组中出现的每个2位于另一个2旁边，则返回true。
提示:
方法调用	期望值
twoTwo([4,2,2,3])	true
twoTwo([2,2,4])	true
twoTwo([2,2,4,2])	false
	 */
	public static void main(String[] args) {
		System.out.println(twoTwo_method(new int[]{2,2,2,4,4,2,2}));
		
	}
	public static boolean twoTwo_method(int[] arr){
		String str="";
		for (int i : arr) {
			str+=i;
		}
		System.out.println(str);
		String regex="2+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			System.out.println(matcher.group());
			if(matcher.group().length()==1){
				return false;
			}
		}
		return true;
	}
}
