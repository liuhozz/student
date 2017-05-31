package com.heima.JPG;

public class TT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeChocolate(60, 100, 550));
	}
	public static int makeChocolate(int a, int b, int c) {
		for(int i=1;i<=b;i++){
			
			System.out.println(c+"  b");
			if(c<5)
					break;
			c=c-5;
		}
		if(c<0)
			c=c+5;
		if(c>a)
			return -1;
		return c;
	}

}
