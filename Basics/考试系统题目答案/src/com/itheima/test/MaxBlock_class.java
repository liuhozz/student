package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxBlock_class {

	/**
	 12.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名maxBlock;
  给定一个字符串，返回该字符串中连续出现个数最多的字符的数量。
提示:
方法调用	期望值
maxBlock("hoopla")	2
maxBlock("abbCCCddBBBxx")	3
maxBlock("")	0
	 */
	public static void main(String[] args) {
		
		System.out.println(maxBlock("djsdaaaaaskdfjslkcccccccccc"));
	}
	
	public static int maxBlock(String str){
		int max=0;
		String regex="(.)\\1+";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			String group = matcher.group();
			if(group.length()>max){
				max=group.length();
				System.out.println(group);
			}
		}
		return max;
	}
}
