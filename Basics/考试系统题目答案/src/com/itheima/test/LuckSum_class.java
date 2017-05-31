package com.itheima.test;

public class LuckSum_class {

	/**
	 25.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名luckySum;
  给定3个int值，A B C，返回他们的总和，然而，如果其中有一个值为13，则13和其右边的数都不参与运算。
举例来说，如果B是13，那么B和C都不算。
提示:
方法调用	期望值
luckySum(1,2,3)	6
luckySum(1,2,13)	3
luckySum(1,13,3)	1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(luckySum(1,13,3));
	}
	
	
	public static int luckySum(int a,int b,int c){
		if(a==13){
			return 0;
		}
		if(b==13){
			return a;
		}
		if(c==13){
			return a+b;
		}
		return a+b+c;
	}

}
