package com.heima.Test;

import java.util.Arrays;

public class Test06 {
	
	public static void main(String[] args) {
		int[] arr={1,10,5,3,6,8,10,23,20};
		System.out.println(Arrays.toString(tenRun(arr)) );
	}
	public static int [] tenRun(int [] arr){
		for (int i=0;i<arr.length-1;i++) {
			if(arr[i]%10==0)
				if(arr[i+1]%10!=0)
				arr[i+1]=arr[i];
		}
		
		
		return arr;
	}
}
