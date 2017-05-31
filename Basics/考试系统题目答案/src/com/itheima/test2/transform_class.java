package com.itheima.test2;

import java.util.HashMap;

public class transform_class {

	/**
	 1.题目描述:
题目描述:
  书写一个工具类，类名为ExamUtils,
  书写一个工具方法，方法名为transform,
  要求此方法能将传入的字符串参数进行处理，将处理后得到的整型数字返回给此方法;
  处理方式为:
    例如：传入整型数字为: 二万二千三百四十五
	20000+2000+300+40+5
    要求处理后为: 12345
    即 将中文数字转换为阿拉伯数字显示方式
提示:
  1. 通常工具类中工具的方法都为公有静态方法
  2. [0123456789]分别对应[零一二三四五六七八九]
  3. 中文的标准位数: 十百千万
  4. 数字判断只需要做到5位数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(transform("四万二千二百三十一"));
	}
	public static int transform(String str){
		int sum=0;
		String zh = "零一二三四五六七八九";
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('十', 1);
		hm.put('百', 2);
		hm.put('千', 3);
		hm.put('万', 4);
		if(str.length()==1){
			if(str.equals("十")){
				return 10;
			}else{
				zh.indexOf(str);
			}
		}
		
		for (int i = 1; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(hm.containsKey(charAt)){
				int num = (int) (Math.pow(10, hm.get(charAt))*zh.indexOf(str.charAt(i-1)));
				sum+=num;
				
			}else if(i==str.length()-1){
				sum+=zh.indexOf(str.charAt(i));
			}
		}
		return sum;
	}
}
