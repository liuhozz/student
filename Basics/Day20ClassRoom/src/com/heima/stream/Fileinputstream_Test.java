package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinputstream_Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("122.txt");
		fos.write(99);
		fos.write(95);
		fos.write(96);
		fos.write(111);
		fos.write(200013);
		FileInputStream fis=new FileInputStream("122.txt");
		//int x=fis.read();					//��һ���ֽ�    ÿreadһ��  ָ������һ�� �ļ��Ľ��������-1 -1������Ч���ֽ�
		int x;
		while((x=fis.read()) != -1)
		System.out.println(x);
		
		fis.close();
	}

}