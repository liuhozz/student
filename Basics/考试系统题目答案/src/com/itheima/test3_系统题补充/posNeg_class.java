package com.itheima.test3_ÏµÍ³Ìâ²¹³ä;

public class posNeg_class {

	/**
	(1, -1, false) -> true
(-1, 1, false) -> true
(-4, -5, true) -> true	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(posNeg(1, -1, false));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-4, -5, true));
		System.out.println(posNeg(-1, -1, false));
	}
	public static boolean posNeg(int a,int b,boolean flag){
		boolean fla= false;
		if(a<0&b>0&flag==false){
			fla= true;
		}
		if(b<0&a>0&flag==false){
			fla= true;
		}
		if(b<0&a<0&flag==true){
			fla= true;
		}
		return fla;
	}

}
