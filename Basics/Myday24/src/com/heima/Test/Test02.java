package com.heima.Test;

public class Test02 {

	/**
	 	我们要做一包规定质量的巧克力，有每个一公斤和每个五公斤的巧克力棒，
		方法中有三个参数，第一个是小巧克力棒的个数，第二个是大巧克力棒的个数，第三个是规定的质量。
		假设我们总在使用小巧克力棒之前使用大巧克力棒，返回要使用多少个小巧克力棒才能完成规定的质量，如果不能完成则返回-1；
		
		分析
			c>(b*5)+a;
			return -1;
			
			c<(b*5)+a
			b*5 > c 
			循环遍历b看在第几个的时候是大于c的
			
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
