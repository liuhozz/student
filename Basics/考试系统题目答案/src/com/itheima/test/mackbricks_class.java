package com.itheima.test;

public class mackbricks_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeBricks(17,1,17));
	}
	
	public static boolean makeBricks(int xiao,int da,int len){
		int a = len%5;
		int b = len/5;
		if(da>=b){
			if(da*5+xiao>=len){
				return true;
			}else{
				return false;
			}
		}else{
			if(a>=xiao){
				return false;
			}else{
				return true;
			}
		}
	}
}
