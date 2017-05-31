package com.itheima.test;

public class loneSum_class {

	/**
	 4.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名loneSum;
  给定3个int值，A B C，返回他们的总和。然而，如果其中一个值与另一个值相同，则它们不参与求和。
提示:
方法调用	期望值
loneSum(1,2,3)	6
loneSum(3,2,3)	2
loneSum(3,3,3)	0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(loneSum(3,3,7));
	}
	public static int loneSum1(int A ,int B,int C){
		if (A==B&&A!=C) {
			return C;
		}
		if (A==C&&A!=B) {
			return B;
		}
		if (B==C&&A!=B) {
			return A;
		}
		if (A!=B&&A!=C&&B!=C) {
			return A+B+C;
		}
		return 0;
	}
	public static int loneSum(int a,int b,int c){
		if(a==b&b!=c){
			return c;
		}else if(b==c&c!=a){
			return a;
		}else if(a==c&c!=b){
			return b;
		}else if(a!=b&b!=c&c!=a){
			return a+b+c;
		}else{
			return 0;
		}
	}
}
