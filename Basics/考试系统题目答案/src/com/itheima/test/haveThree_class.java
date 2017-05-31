package com.itheima.test;

public class haveThree_class {

	/**
	 * 书写一个类，类名为Itheima;   类中有一个方法，方法名haveThree;
	 *   给定一个整型数组，如果元素3在数组中，间隔的恰好出现3次，就返回true。 提示: 方法调用 期望值
	 * haveThree([3,1,3,1,3]) true haveThree([3,1,3,3]) false
	 * haveThree([3,4,3,3,4]) false
	 */
	public static void main(String[] args) {
//		System.out.println(haveThree(new int[] { 4, 3, 4, 3, 4 }));
		System.out.println(haveThree(new int[] { 3,4,3,4,3 }));
	}

	// 长度至少有[3,1,3,1,3]，5
	public static boolean haveThree(int[] arr) {
		int count=0;
		if(arr==null||arr.length<5){
			return false;
		}
		if(arr[0]==3&&arr[1]!=3){
			count++;
		}
		if(arr[arr.length-2]!=3&&arr[arr.length-1]==3){
			count++;
		}
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i-1]!=3&arr[i]==3&arr[i+1]!=3){
				count++;
			}
		}
		if(count==3){
			return true;
		}else{
			return false;
		}
	}
}
