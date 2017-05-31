package com.heima.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	/**
	 * @param args
	 *            定义一个方法(copyFile2Dir),接收两个参数,第一个参数是一个文件,第二个参数是一个文件夹
	 *            方法的作用是把文件复制到文件夹中,文件名与原来的文件相同即可 例如,第一个参数为: c:\1.jpg 第二个参数是:
	 *            D:\abc 那么就是把C盘下的1.jpg文件复制到D盘下的abc文件夹中,文件名还是1.jpg
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("d:\\test\\1.jpg");

		File file1 = new File("e:\\test");
		file1.mkdir();
		
		copyFile2Dir(file, file1.getAbsolutePath());
	}

	private static void copyFile2Dir(File file, String file2) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file2+"\\1.jpg"));
		int len;
		while((len=bis.read()) != -1){
			bos.write(len);
		}
		
		bos.close();
	}

}
