package com.heima.LX;


public class Test03 {

	/**
	 * 给定一个字符串，返回该字符串中连续出现个数最多的字符的数量
	 * 
	 * 先判断是不是重复 是的话 count++ 然后在定义一个新变量 与count比较 看是不是比新变量大?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hoooplaoodsfseoodoooooddhdjdoooooo";
		// a
		int b = 0;
		//int arr[] = new int[s.length()];
		for (int i = 0; i < s.length() ; i++) {
			// s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					if (s.charAt(i) == s.charAt(j)) {

						count++;
					} 
					
				} else {
					count = 0;
				}
				if(b<count)
					b=count;
			}
			// System.out.println(count);
			//arr[i] = count;
			//System.out.print(arr[i]);
			
			
		}
		System.out.print("|"+b);
		//Arrays.sort(arr);

	}
}
