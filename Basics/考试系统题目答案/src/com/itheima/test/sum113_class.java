package com.itheima.test;

public class sum113_class {

/**
题目描述:
 书写一个类，类名为Itheima;

 类中有一个方法，方法名sum13;

 有一个整型数组，返回的结果是数组所有元素的总和，如果数组中出现整型数13的时候，
 那么元素13和13后面的一个元素也不计入总和里面。

 提示:
 方法调用 期望值 
 sum13([1,2,2,1]) 6 
 sum13([1,1]) 2 
 sum13([1,2,2,1,13]) 6 
	 */
	public static void main(String[] args) {
		System.out.println(sum13(new int[]{1,2,2,1,13}));
	}
	
	public static int sum13(int[] arr){
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=13){
				sum+=arr[j];
			}else{
				j=j+1;
			}
		}
		return sum;
	}
}
