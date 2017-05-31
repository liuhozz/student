package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countTriple_class {

	/**
	 5书写一个类，类名为Itheima;
	  类中有一个方法，方法名countTriple;
	  “三元组”是指一个连续出现的三次的字符，返回给定字符串中三元组的个数，
	“三元组”是可以重叠的：“AAAA”包含两个三元组
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countTriple("yyyy")); 
	}
	public static int countTriple(String str){
		int count=0;
		String regex ="(.)\\1{2,}";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			String group = matcher.group();
			if(group.length()>3){
				count=count+group.length()-2;
			}else{
				count++;
			}
		}
		return count;
	}
	
}
