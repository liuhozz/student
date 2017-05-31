package com.heima.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {

	/**
	 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入数据:");
		String s=sc.nextLine();
		BufferedWriter bos=new BufferedWriter(new FileWriter("text.txt"));
		bos.write(s);
		bos.close();
	}

}
