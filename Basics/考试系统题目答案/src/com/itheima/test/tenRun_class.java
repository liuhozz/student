package com.itheima.test;

import java.util.Arrays;

public class tenRun_class {

	/**
	 14.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名tenRun;
  有一个整型的数组，如果数组的元素是10的倍数，将其后面的所有值改为10的倍数
直到遇到下一个10的倍数的元素，因此{2，10，3，4，20，5} 改为{2,10,10,10,20,20}
提示:
方法调用	期望值
tenRun([2,10,3,4,20,5])	[2,10,10,10,20,20]
tenRun([10,1,20,2])	[10,10,20,20]
tenRun([10,1,9,20])	[10,10,10,20]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(tenRun(new int[]{10,1,20,2})));
	}
	
	public static int[] tenRun(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]%10==0&arr[i+1]%10!=0){
				arr[i+1]=arr[i];
			}
		}
		return arr;
	}

}
