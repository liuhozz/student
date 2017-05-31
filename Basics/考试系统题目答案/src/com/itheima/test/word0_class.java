package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class word0_class {

	/**
	 49题目描述:
  书写一个类，类名为Itheima;

  类中有一个方法，方法名word0;

  给定一个字符串数组，返回一个Map ，
把数组中每个不同字符作为key，value都是0.例如，字符串数组["h","e","l","l","o"]键是"h" "e" "l" "o"，值是0。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Map<String,Integer> word0(String[] st){
		Map<String ,Integer> map = new HashMap<String, Integer>();
		for (String string : st) {
			map.put(string, 0);
		}
		return map;
	}
}
