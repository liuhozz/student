package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassRoomTest01 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Dome1_copy();
		// Dome2_copy();
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");

		byte[] arr = new byte[1024*9];   //1024的整数倍
		int len;
		while ((len = fis.read(arr)) != -1) {	//这里的len为read读到的有效的字节数
			fos.write(arr);
		}

		fis.close();
		fos.close();
	}

	public static void Dome2_copy() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");

		int len = fis.available();

		byte[] arr = new byte[len];
		fis.read(arr);
		fos.write(arr);

		fis.close();
		fos.close();
	}

	public static void Dome1_copy() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");

		int a;
		while ((a = fis.read()) != -1) {
			fos.write(a);
		}

		fis.close();
		fos.close();
	}

}
