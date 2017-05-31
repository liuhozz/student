package com.itheima.test;

import java.util.TreeMap;

public class Cast_class {

	/**

	 */
	public static void main(String[] args) {
		System.out.println(conversion(12000));
	}

	public static String conversion(int a) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(0, "零");
		tm.put(1, "一");
		tm.put(2, "二");
		tm.put(3, "三");
		tm.put(4, "四");
		tm.put(5, "五");
		tm.put(6, "六");
		tm.put(7, "七");
		tm.put(8, "八");
		tm.put(9, "九");

		StringBuilder sb = new StringBuilder();
		sb.append(a / 10000 == 0 ? "" : tm.get(a / 10000 % 10) + "万");
		sb.append(a / 1000 == 0 ? "" : tm.get(a / 1000 % 10) + "千");
		sb.append(a / 100 == 0 ? "" : tm.get(a / 100 % 10) + "百");
		sb.append(a / 10 == 0 ? "" : tm.get(a / 10 % 10) + "十");
		sb.append(a / 1 == 0 ? "" : tm.get(a / 1 % 10) + "");
		return sb.toString();
	}
}
