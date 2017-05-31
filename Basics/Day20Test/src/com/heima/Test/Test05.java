package com.heima.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test05 {

	/**
	 * 用今天所学的知识, 写一个程序, 把一个大文件切割成多个小文件(提示:小文件的大小就是小数组的大小)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int name=0;
		InputStreamReader isr=new InputStreamReader(new FileInputStream("zzz.txt"),"gbk");
		
		
		char [] ch=new char[1024];
		int c;
		while((c=isr.read(ch))!=-1){
			name++;
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(name+".txt",true), "utf-8");
			osw.write(ch, 0, c);
			osw.close();
		}
		isr.close();
		
	}

}
