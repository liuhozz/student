package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class mapbully_class {

	/**
	39.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名mapBully;
  修改并返回给定映射如下：如果键“a”具有值，则将键“b”设置为“a”的值，
并将键“a”设置为值“”，取值并用空字符串替换它。如果不存在键“a”将原路返回。
提示:
方法调用	期望值
mapBully({"b":"dirt","a":"candy"})	{"b":"candy","a":""}
mapBully({"a":"candy"})	{"b":"candy","a":""}
mapBully({"b":"carrot","c":"meh","a":"candy"})	{"b":"candy","c":"meh","a":""}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Map<String, String> mapBully(Map<String, String> map){
		if(map.containsKey("a")&&map.get("a")!=null){
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

}
