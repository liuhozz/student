package com.heima.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test05 {

	/**
	 * �û��ڿ���̨������5�����֣����ս�����뵽��D:\\number.txt����	
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��5������:");
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
