package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class wordCount_class {

	/**
	54.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名wordCount;
  给定一个字符串数组，返回一个Map ，每个不同的字符串作为key
value为字符串在数组中出现的次数。
提示:
方法调用	期望值
wordCount(["a","b","a","c","b"])	{"b":2,"c":1,"a":2}
wordCount(["c","b","a"])	{"b":1,"c":1,"a":1}
wordCount(["c","c","c","c"])	{"c":4}
	 */
	public static void main(String[] args) {
		
		System.out.println(wordCount(new String[]{"a","b","a","c","b"}));
	}
	
	public static Map<String,Integer> wordCount(String[] arr){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String string : arr) {
			hm.put(string, !hm.containsKey(string)?1:hm.get(string)+1);
		}
		return hm;
	}
}
