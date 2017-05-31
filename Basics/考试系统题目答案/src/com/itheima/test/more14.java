package com.itheima.test;

public class more14 {

	/**
	 15.题目描述:
	  书写一个类，类名为Itheima;
	  类中有一个方法，方法名more14;
	  给定一个整型数组，如果1的出现次数大于4出现的次数，则返回true
	提示:
	方法调用	期望值
	more14([1,4,1])	true
	more14([1,4,1,4])	false
	more14([1,1])	true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean more14_method(int[] arr){
		int count1=0;
		int count4=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1){
				count1++;
			}
			if(arr[i]==4){
				count4++;
			}
		}
		if(count1>count4){
			return true;
		}else{
			return false;
		}
	}

}
