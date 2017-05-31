package com.heima.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

	/**
	 * 4.从键盘录入一个文件夹路径,再录入一个文件后缀名, 然后在控制台中输出该文件夹下的指定文件后缀名的所有文件.
		例如:1.输入:c:\xxx
			2.输入: .jpg
			在控制台中输出的是c:\xxx文件夹下的所有.jpg文件的文件名
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("亲输入一个个文件夹路径:");
		
		String line=sc.nextLine();
		
		System.out.println("请输入一个文件名后缀:");
		
		final String suffix=sc.nextLine();
		
		File dir =new File(line);
		
		String [] arr=dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File f=new File(dir,name);
				return f.isFile()&&name.endsWith(suffix);
			}
		});
		
		
		
	}

}
