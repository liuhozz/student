package com.itheima.test;

public class sum28_class {

	/**
	 9.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名sum28;
  给定一个整型数组，如果数组中所有2的总和为8，则返回true。
提示:
方法调用	期望值
sum28([2,3,2,2,4,2])	true
sum28([2,3,2,2,4,2,2])	false
sum28([1,2,3,4])	false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean sum28(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2){
				sum+=arr[i];
			}
		}
		if(sum==8){
			return true;
		}else{
			return false;
		}
			
	}

}
