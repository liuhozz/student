package com.heima.LX;




public class Test04 {

	/**
	 *  书写一个类，类名为Itheima;
		 类中有一个方法，方法名evenlySpaced;
		 给定三个int，a b c，其中一个是小的，一个是中等，一个大。
		如果三个值均匀分布，就是小和中值之间的差异与中和大之间的差异相同，则返回true，
		
		提示:
		方法调用 期望值 
		evenlySpaced(2,4,6) true 
		evenlySpaced(4,6,2) true 
		evenlySpaced(4,6,3) false 





		书写一个类，类名为Itheima;

		  类中有一个方法，方法名makeChocolate;
		
		  我们要做一包规定质量的巧克力，有每个一公斤和每个五公斤的巧克力棒，
		方法中有三个参数，第一个是小巧克力棒的个数，第二个是大巧克力棒的个数，第三个是规定的质量。
		假设我们总在使用小巧克力棒之前使用大巧克力棒，返回要使用多少个小巧克力棒才能完成规定的质量，如果不能完成则返回-1；
		
		
		提示:
		方法调用 期望值 
		makeChocolate(4,1,9) 4 
		makeChocolate(4,1,10) -1 
		makeChocolate(4,1,7) 2 
		
		
		
		书写一个类，类名为Itheima;

		  类中有一个方法，方法名makeBricks;
		
		  我们想做一排砖（长度自己定），我们有一些小砖（每块1英寸）和大砖（每块5英寸），
		如果用我们选择的砖块的数量能够拼接成功，则返回true；否则返回false，
		例如：makeBricks(3, 1, 8) → true
		
		提示:
		方法调用 期望值 
		makeBricks(3,1,8) true 
		makeBricks(3,1,9) false 
		makeBricks(3,2,10) true 

	 */
	public static void main(String[] args) {
		String s="xavaXYZjava";
		String p=s;
		for (int i = 1; i <= s.length()/2; i++) {
			//if(s.charAt(i)!=s.charAt(s.length()-1-i))
			 if(s.endsWith(s.substring(0,i))){
				 p=s.substring(0,i);
				 System.out.println("111");
			 }
		}
		System.out.println(p);
	}

}

