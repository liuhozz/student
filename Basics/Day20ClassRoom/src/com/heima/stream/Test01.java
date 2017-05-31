package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int a;
		while ((a = bis.read()) != -1) {
			bos.write(a ^1254);
		}
		
		fis.close();
		fos.close();
	}

}
