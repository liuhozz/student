package com.itheima.test;

import java.util.TreeMap;

public class conversion {

	/**
	 .题目描述:
  书写一个工具类，类名为SampleUtils,
  书写一个工具方法，方法名为conversion,
  要求此方法能将传入的整型数字参数进行处理，将处理后得到的字符串返回给此方法;
  处理方式为:
    例如：传入整型数字为: 12345
    要求处理后为: 一万二千三百四十五
    即 将阿拉伯数字转换为中文显示方式
提示:
  1. 通常工具类中工具的方法都为公有静态方法
  2. [0123456789]分别对应[零一二三四五六七八九]
  3. 中文的标准位数: 十百千万
  4. 数字判断只需要做到5位数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conversion(40030));
	}
	public static String conversion(int x) {
		String snum = "零一二三四五六七八九";
		String s = "万千百十 ";
		String s1 = x + "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == '0') {
				sb.append("零");
			}else {
				sb.append(snum.charAt(Integer.parseInt(s1.charAt(i) + "")))
				.append(s.charAt(i));
			}
		}
		return sb.toString().trim();
	}
}
