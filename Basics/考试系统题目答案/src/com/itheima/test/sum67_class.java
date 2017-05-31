package com.itheima.test;

public class sum67_class {

	/**
	 55.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名sum67;
  有一个整型数组，返回数组中的数字的总和，如果数组含有数6和7
那么忽略不计入从6开始并延伸到有7的数字段（每6个将跟随至少一个7）。
返回0表示没有数字。
提示:
方法调用	期望值
sum67([1,2,2])	5
sum67([1,2,2,6,99,99,7])	5
sum67([1,1,6,7,2])	4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum67(new int[]{1,2,2,6,99,99,7,8}));
	}
	
	public static int sum67(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=6){
				sum+=arr[i];
			}else{
				i++;
				while(true){
					if(arr[i]==7){
						break;
					}
					i++;
				}
			}
		}
		return sum;
	}
}
