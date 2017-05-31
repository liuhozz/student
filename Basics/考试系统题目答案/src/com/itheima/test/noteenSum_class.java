package com.itheima.test;

public class noteenSum_class {

	/**
	 题目描述:   书写一个类，类名为Itheima;   类中有一个方法，方法名noTeenSum;   给定3个int值，A B
	 * C，返回他们的总和。然而，如果有任何一个值是青值，则不参与运算， 青值的范围是13～19之间且不包含15和16；
	 * 可以定义一个公共的方法fixteen（int n），接受一个int类型的值，并判断是否为青值；这样就避免写三次判断的代码， 提示: 方法调用
	 * 期望值 noTeenSum(1,2,3) 6 noTeenSum(2,13,1) 3 noTeenSum(2,1,14) 3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(noTeenSum(2,13,1));
	}
	public static int noTeenSum(int A,int B,int C){
		
		boolean a = fixteen(A);
		boolean b = fixteen(B);
		boolean c = fixteen(C);
		return (a==true?0:A)+(b==true?0:B)+(c==true?0:C);
		
	}
	
	public static boolean fixteen(int num){
		if(num>=13&num<=19&num!=15&num!=16){
			return true;
		}
		return false;
	}
}
