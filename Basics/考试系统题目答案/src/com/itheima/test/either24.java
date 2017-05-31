package com.itheima.test;

public class either24 {

	/**
	 * 题目描述: 书写一个类，类名为Itheima; 类中有一个方法，方法名either24;
	 * 给定一个整型数组，如果数组中含有两个相邻的数字2，或者是数字4，就返回true，
	 * 否则返回false，如果数组既含有两个相邻的数字2又含有两个相邻的数字4，就返回false。 例如：([1, 2, 3, 2, 2, 4, 4])
	 * -> false 提示: 方法调用 期望值 either24([1,2,2]) true either24([4,4,1]) true
	 * either24([4,4,1,2,2]) false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(either24(new int[] {1, 2, 2 ,2}));
	}

	public static boolean either24(int[] arr) {
		boolean a = false;
		boolean b = false;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==2&&arr[i+1]==2){
				a=true;
			}
			if(arr[i]==4&&arr[i+1]==4){
				b=true;
			}
		}
		if(a==false&&b==false){
			return false;
		}else if(a==true&&b==true){
			return false;
		}else{
			return true;
		}
	}
}
