package com.itheima.test;

public class only14_class {

	/**
	 }目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名only14;
  给定一个整型数组，如果有元素都是1和4或者其中之一，就返回true。
提示:
方法调用	期望值
only14([1,4,1,4])	true
only14([1,4,2,4])	false
only14([1,1])	true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(only14(new int[]{1,1}));
	}
	
	public static boolean only14(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=1 && arr[i]!=4){
				return false;
			}
		}
		return true;
	}
}
