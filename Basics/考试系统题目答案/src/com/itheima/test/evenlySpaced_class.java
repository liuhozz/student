package com.itheima.test;

import java.util.Arrays;

public class evenlySpaced_class {

	/**
30题目描述:
书写一个类，类名为Itheima;
类中有一个方法，方法名evenlySpaced;
给定三个int，a b c，其中一个是小的，一个是中等，一个大。
如果三个值均匀分布，就是小和中值之间的差异与中和大之间的差异相同，则返回true，
提示:
方法调用 期望值 
evenlySpaced(2,4,6) true 
evenlySpaced(4,6,2) true 
evenlySpaced(4,6,3) false */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenlySpaced(6,8,7));
	}
	public static boolean evenlySpaced(int a,int b,int c){
		if(b-a == c-b){
			return true;
		}else if(b-c == a-b){
			return true;
		}else if(a-b == c-a){
			return true;
		}else if(a-c == b-a){
			return true;
		}else if(c-a == b-c){
			return true;
		}else if(c-b == a-c){
			return true;
		}
		return false;
	}
	public static boolean evenlySpaced2(int a,int b,int c){
		int[] arr = {a,b,c};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]+1==arr[i+1]&arr[i+1]==arr[i+2]-1){
				return true;
			}
		}
		return false;
	}

}
