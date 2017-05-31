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
		tm.put(0, "��");
		tm.put(1, "һ");
		tm.put(2, "��");
		tm.put(3, "��");
		tm.put(4, "��");
		tm.put(5, "��");
		tm.put(6, "��");
		tm.put(7, "��");
		tm.put(8, "��");
		tm.put(9, "��");

		StringBuilder sb = new StringBuilder();
		sb.append(a / 10000 == 0 ? "" : tm.get(a / 10000 % 10) + "��");
		sb.append(a / 1000 == 0 ? "" : tm.get(a / 1000 % 10) + "ǧ");
		sb.append(a / 100 == 0 ? "" : tm.get(a / 100 % 10) + "��");
		sb.append(a / 10 == 0 ? "" : tm.get(a / 10 % 10) + "ʮ");
		sb.append(a / 1 == 0 ? "" : tm.get(a / 1 % 10) + "");
		return sb.toString();
	}
}
