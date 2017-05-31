package com.heima.LX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;



public class Test02 {

	/**
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File[] file=new File("E:\\bj").listFiles();
		Vector<InputStream> v=new Vector<>();
		for (File file2 : file) {
			v.add(new FileInputStream(file2));
		}
		Enumeration<InputStream> e = v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		FileOutputStream fos=new FileOutputStream("зм.txt");
		byte [] arr=new byte[8192];
		int len;
		while((len=sis.read(arr)) != -1){
			fos.write(arr, 0, len);
		}
			
		sis.close();
		fos.close();
		
	}

}

