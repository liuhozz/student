package com.heima.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

	/**
	 * �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������·��:");
		String s=sc.nextLine();
		
		FileInputStream fis=new FileInputStream(s);
		FileOutputStream fos=new FileOutputStream("1.txt");
		int c;
		while ((c=fis.read())!=-1){
			fos.write(c);
		}
		fis.close();
		fos.close();
	}

}
