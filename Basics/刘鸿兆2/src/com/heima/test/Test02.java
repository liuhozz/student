package com.heima.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {

	/**
	 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼������:");
		String s=sc.nextLine();
		BufferedWriter bos=new BufferedWriter(new FileWriter("text.txt"));
		bos.write(s);
		bos.close();
	}

}
