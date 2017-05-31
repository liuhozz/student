package com.itheima.test;

public class makeChocolate_class {

	/**
	 
	 */
	public static void main(String[] args) {
		System.out.println(show(2,4,18));
	}
	
	public static int show(int xiao,int da,int zl){
		int sum = xiao+da*5;
		if(sum>=zl){
			if(da*5>=zl){
				zl = zl%5;
			}else{
				zl= zl-(da*5);
			}
			for (int i = 0; i <=xiao ; i++) {
				if(zl<=0){
					return i;
				}else{
					zl = zl-1;
				}
			}
		}
		return -1;
	}
	public static int makeChocolate(int xiao, int da, int zl) {
		int sum = xiao + da * 5;
		if (zl <= sum) {
			if (zl <= da * 5)
				zl = zl % 5;
			else
				zl -= da * 5;
			
			for (int i = 0; i <= xiao; i++) {
				if (zl <= 0)
					return i;
				zl -= 1;
			}
		}
		return -1;
	}
}
