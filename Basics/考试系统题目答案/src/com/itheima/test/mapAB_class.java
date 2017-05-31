package com.itheima.test;

import java.util.HashMap;

public class mapAB_class {

	/**
	 题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名mapAB;
  修改并返回给定的映射如下：在键值对映射中可以包含或可以不包含“a”和“b”键。 
如果ab两个键都存在，则将它们的2个字符串的值附加在一起并将结果存储在键“ab”下。
提示:
方法调用	期望值
mapAB({"b":"There","a":"Hi"})	{"b":"There","a":"Hi","ab":"HiThere"}
mapAB({"a":"Hi"})	{"a":"Hi"}
mapAB({"b":"There"})	{"b":"There"}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static HashMap<String, String> mapAB(HashMap<String, String> hm){
		if(hm.containsKey("a")&&hm.containsKey("b")){
			hm.put("ab", hm.get("a")+hm.get("b"));
		}
		return hm;
	}

}
