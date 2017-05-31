package com.heima.Test;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		int g=num%10;
		int s=num/10;
		if(g>=5){
			s=s+1;
			num=s*10;
		}
		else
			num=num-g;
		System.out.println(num);
	}

}


/*
 * 单例设计模式
 */

//饿汉式
/*class X {
	private X(){}
	private static X x=new X();
	public static X getX() {
		return x;
	}
	
}
*/

//改编饿汉式
/*class X {
	private X(){}
	public final static X x=new X();
	
}*/


//懒汉式



















