package com.itheima.test;

import java.util.Arrays;

public class shitfleft_class {

	/**
	 24.题目描述:
  类中有一个方法，方法名shiftleft;
  给一个整型的数组，将数组的元素左移一位后返回一个新的数组，
例如{6,2,5,3}返回{2,5,3,6}
提示:
方法调用	期望值
shiftleft([6,2,5,3])	[2,5,3,6]
shiftleft([1,2])	[2,1]
shiftleft([1])	[1]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(shiftleft(new int[]{6,2,5,3})));
	}
	public static int[] shiftleft(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1]=temp;
		}
		return arr;
	}

}
