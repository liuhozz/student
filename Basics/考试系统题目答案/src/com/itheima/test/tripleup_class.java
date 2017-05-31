package com.itheima.test;

public class tripleup_class {

	/**
	 题目描述:
  57.书写一个类，类名为Itheima;
  类中有一个方法，方法名tripleUp;
  给定一个整型的数组，如果某索引有三个相邻的递增的自然数，就返回true
例如：{...4,5,6...}或{...23,24,25}等等。
提示:
方法调用	期望值
tripleUp([1,4,5,6,2])	true
tripleUp([1,2,3])	true
tripleUp([1,2,4])	false
	 */
	public static void main(String[] args) {
		// TO	DO Auto-generated method stub
		System.out.println(tripleUp(new int[]{1,2,4}));
	}
	
	public static boolean tripleUp(int[] arr){
		for (int i = 1; i < arr.length-2; i++) {
			if(arr[i]==arr[i+1]-1&&arr[i]==arr[i+2]-2){
				return true;
			}
		}
		return false;
	}

}
