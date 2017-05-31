package com.heima.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test05 {

	/**
	 * 用户在控制台上输入5个数字，按照降序存入到“D:\\number.txt”中	
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入5个整数:");
		TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int num=o2-o1;
				return num;
			}
		});
		for(int i=0;i<5;i++){
			ts.add(sc.nextInt());
		}
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\number.txt"));
		for (Integer integer : ts) {
			bw.write(integer+"\r\n");
		}
		bw.close();
	}

}
