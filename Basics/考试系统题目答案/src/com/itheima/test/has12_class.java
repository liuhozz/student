package com.itheima.test;

public class has12_class {

	/**
	33.题目描述:
		  书写一个类，类名为Itheima;
		  类中有一个方法，方法名has12;
		  给定一个整型数组，如果数组中有1元素, 并且在1元素后面的元素中还有2元素, 
		则返回true, 否则返回false.
		提示:
		方法调用	期望值
		has12([1,3,2])	true
		has12([3,1,2])	true
		has12([3,1,4,5,2])	true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(has12(new int[]{3,6,1,5,6,7,2,2}));
	}
	
	public static boolean ha121(int[] arr){
		String str="";
		for (int i : arr) {
			str+=i;
		}
		int index = str.indexOf("1");
		return str.substring(index).contains("2");
	}
	
	public static boolean has12(int[] arr){
		
		boolean b= false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1){
				for (int j = 1; j < arr.length; j++) {
					if(arr[i]==1 && arr[j]==2){
						b = true;
					}
				}
			}
		}
		return b;
	}
}
