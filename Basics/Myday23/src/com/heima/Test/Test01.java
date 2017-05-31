package com.heima.Test;

import java.io.File;
import java.util.Scanner;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		String line = sc.nextLine();
		System.out.println(getFileLength(getDir(line))); // 文件夹大小的练习
	}

	/*
	 * 通过递归 求文件夹的大小
	 */

	public static long getFileLength(File dir) {
		long len = 0;

		File[] subFile = dir.listFiles();
		for (File subfile : subFile) {
			if (subfile.isFile()) {
				len += subfile.length();
			} else {
				len += getFileLength(subfile);
			}
		}

		/*File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				len += file.length();
			} else {
				len += getFileLength(file);
			}
		}*/

		return len;
	}

	/*
	 * 获取文件夹路径
	 */
	public static File getDir(String line) {

		while (true) {

			File dir = new File(line);
			if (!dir.exists()) {
				//System.out.println(dir);
				System.out.println("您录入的文件夹路径不存在");
			} else if (dir.isFile()) {
				System.out.println("您录入的路径不是文件夹路径");
			} else {
				return dir;
			}
		}
	}
}
