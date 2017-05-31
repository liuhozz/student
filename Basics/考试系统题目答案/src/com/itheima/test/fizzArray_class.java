package com.itheima.test;

import java.util.Arrays;

public class fizzArray_class {

	/**
	 题目描述:
	  书写一个类，类名为Itheima;

	  类中有一个方法，方法名fizzArray;

	  给一个任意的数字，返回创建一个长度是该数字的整型数组，该数组中的元素按自然顺序递增，
	例如数字是7，那么返回长度为7的整型数组，数组的元素为{0，1，2，3，4，5，6}

	提示:
	方法调用 期望值 
	fizzArray(4) [0,1,2,3] 
	fizzArray(1) [0] 
	fizzArray(10) [0,1,2,3,4,5,6,7,8,9] 
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fizzArray(7)));
		
	}
	public static int[] fizzArray(int num){
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i]=i;
		}
		return arr;
	}
}
