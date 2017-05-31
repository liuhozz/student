package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hHappy_class {

	/**
	 16.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名gHappy;
  如果字符串中的’g’的相邻左边或者右边有另外一个’g’，则’g’在这个字符串中是happy的，
如果字符串中所有的’g’都是happy的则返回true，否则返回false。
提示:
方法调用	期望值
gHappy("xxggxx")	true
gHappy("xxgxx")	false
gHappy("xxggyygxx")	false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gHappy("xxggxx"));
	}
	
	public static boolean gHappy(String str){
		String regex = "g+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			if(matcher.group().length()==1){
				return false;
			}
		}
		return true;
	}

}
