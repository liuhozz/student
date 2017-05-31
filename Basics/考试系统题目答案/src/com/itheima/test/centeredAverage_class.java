package com.itheima.test;

public class centeredAverage_class {

	/**
		题目描述:
	  书写一个类，类名为Itheima;
	  类中有一个方法，方法名centeredAverage;
	  给定一个整型数组，去掉数组中最大和最小的值, 返回其他元素的平均值
	提示:
	方法调用	期望值
	centeredAverage([1,2,3,4,100])	3
	centeredAverage([1,1,5,5,10,8,7])	5
	centeredAverage([-10,-4,-2,-4,-2,0])	-3
	 */
	public static void main(String[] args) {
		System.out.println(centeredAverage(new int[]{1,2,3,4,100}));
	}
	
	public static int centeredAverage(int[] arr){
		int sum = 0;
		//排序
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr[0]+":"+arr[arr.length-1]);
		for (int i = 1; i < arr.length-1; i++) {
			sum+=arr[i];
		}
		return sum/(arr.length-2);
	}
}
