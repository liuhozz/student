package com.itheima.test2;

public class Luck13_class {

	/**
	 	 6.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名lucky13;
  给定一个整型数组，如果数组不包含1或3，则返回true。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean lucky13(int[] arr){
		boolean b=true;
		for (int i : arr) {
			if(arr[i]!=1){
				if(arr[i]!=3){
					continue;
				}else{
					b=false;
					break;
				}
			}else{
				b=false;
				break;
			}
		}
		return b;
		
	}
}
