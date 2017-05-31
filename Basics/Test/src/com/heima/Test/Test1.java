package com.heima.Test;

import java.util.ArrayList;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] arr={11,22,33,44,55,66,77};
		for (int i : arr) {
			System.out.print(i+",");
		}*/
		
		ArrayList<String> list= new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String str : list) {
			System.out.print(str);
		}
	}

}
