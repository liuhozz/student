package com.itheima.test;

import java.util.ArrayList;

public class no14_class {

	/**
	 7.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名no14;
  给定一个整型数组，如果它同时包含1和4, 返回false,否则返回true;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(no14(new int[]{1,3,4}));
	}
	public static boolean no14(int[] arr){
		boolean b=true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==1){
					if(arr[j]==4){
						b=false;
					}
				}
			}
		}
		return b;
	}
	public static boolean no141(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : arr){
			list.add(i);
		}
		if(list.contains(1) && list.contains(4)){
			return false;
		}
		return true;
	}
}
