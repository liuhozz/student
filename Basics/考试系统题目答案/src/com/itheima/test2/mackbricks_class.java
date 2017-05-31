package com.itheima.test2;

public class mackbricks_class {

	/**
	��שСש
	 */
	public static void main(String[] args) {
		System.out.println(makeBricks(3,2,18));
	}
	public static boolean makeBricks(int xiao,int da,int len){//1,4,18
		int big = len/5;
		int small = len%5;
		if(big>da){//说明大的不够
			if(xiao+da*5>=len){
				return true;
			}else{
				return false;
			}
		}else{//说明大的够了
			if(xiao<small){
				return false;
			}else{
				return true;
			}
		}
	}
}
