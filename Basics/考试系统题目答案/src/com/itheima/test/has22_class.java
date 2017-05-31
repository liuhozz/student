package com.itheima.test;

public class has22_class {

	/**
	 5.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名has22;
  给定一个整型数组，如果数组中出现两个相邻的索引中的元素都是2，则返回true
提示:
方法调用	期望值
has22([1,2,2])	true
has22([1,2,1,2])	false
has22([2,1,2])	false
	 */
	public static void main(String[] args) {
		System.out.println(has22(new int[]{4, 2, 4, 2, 2, 5}));

	}
	
	public static boolean has22(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==2&&arr[i+1]==2){
				return true;
			}
		}
		return false;
	}

}
