package com.heima.Test;

import java.io.File;
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		String line = sc.nextLine();
		File dir=Test01.getDir(line);
		
		DelDir(dir);
	}

	public static void DelDir(File dir) {
		// TODO Auto-generated method stub
		File [] subfile=dir.listFiles();
		for (File file : subfile) {
			if(file.isFile())
				file.delete();
			else{
				DelDir(file);
			}
		}
		dir.delete();
	}
	
	

}
