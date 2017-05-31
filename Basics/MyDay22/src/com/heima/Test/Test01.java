package com.heima.Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;

import javax.security.sasl.SaslClient;

import com.heima.enty.Car;
import com.heima.enty.Engine;

public class Test01 {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * 定义一个方法,接收两个参数:①源文件, ②文件切割大小size
		 * 该方法的功能是把源文件切割成size指定的大小,存储到当前项目下的xxx文件夹中,
		 * 然后把该文件的切割信息存储到xxx文件夹中的info.properties文件中,信息包括 以下内容: 举例: ①原文件名:(name)
		 * yyy.jpg ②文件切割个数(count) 5 ③原文件大小(length) 123456678 ④文件切割大小(size) 1024
		 * 
		 * 分析 用小数组读写的方式实现文件切割 在循环里面获取小文件的信息 通过properties类的store方法写入info文件中
		 */

		File file = new File("xxx");
		/*
		 * file.mkdir(); System.out.println("请输入size"); Scanner sc = new
		 * Scanner(System.in); int size = sc.nextInt(); sqilt(getDir(), size);
		 */
		// Scanner sc = new Scanner(System.in);
		File[] filelist = file.listFiles();
		Vector<FileInputStream> v = new Vector<>();
		for (File file2 : filelist) {
			v.add(new FileInputStream(file2));
		}
		Enumeration<FileInputStream> elements = v.elements();
		SequenceInputStream sis = new SequenceInputStream(elements);
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("xxx/a.txt"));
		int c;
		while ((c = sis.read()) != -1) {
			bos.write(c);
		}
		sis.close();
		bos.close();
		/*
		 * 定义一个引擎类(Engine),该类中有一个方法(start),该方法在控制台中输出"引擎启动了!"
		 * 再定义一个汽车类(Car),该类中有以下属性: 颜色(color),轮子个数(num), 引擎(engine)
		 * 这三个属性都有set和get方法,空参和有参构造方法. 定义一个方法(run),在这个方法中显示颜色和轮子个数,
		 * 调用引擎(engine)的start方法. 要求:
		 * 创建三个汽车对象,设置三个属性的值,把汽车对象存储到集合中,然后通过对象输出流,写到obj.txt文件中.
		 * 通过对象输入流,把第四题中的obj.txt中的对象读取出来, 调用所有汽车对象中的run方法.
		 */
		 //Dome2();
		/*
		 * 键盘录入数据,把录入的数据用打印流输出到当前项目下的log.txt文件中, 当输入"quit"时,程序结束.
		 */
		// Dome1();
	}

	// ①原文件名:(name)yyy.jpg ②文件切割个数(count) 5 ③原文件大小(length) 123456678
	// ④文件切割大小(size) 1024
	public static void sqilt(File file, int size) throws IOException {
		// TODO Auto-generated method stub
		int count = 1;
		byte[] arr = new byte[size];
		int c;
		FileInputStream fis = new FileInputStream(file);
		while ((c = fis.read(arr)) != -1) {
			FileOutputStream fos = new FileOutputStream("xxx/" + count + ".txt");
			count++;
			fos.write(arr, 0, c);

			fos.close();
		}

		Properties pro = new Properties();
		pro.setProperty("name", file.getName());// .toString()
		pro.setProperty("count", count - 1 + "");
		pro.setProperty("length", file.length() + "    bytes");
		pro.setProperty("size", size + "    bytes");
		pro.store(new FileOutputStream("info.properties"), null);

		fis.close();
	}

	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径");
		while (true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if (!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在");
			} else if (dir.isDirectory()) {
				System.out.println("您录入的路径不是文件路径");
			} else {
				return dir;
			}
		}
	}

	public static void Dome2() throws IOException, FileNotFoundException, ClassNotFoundException {
		// 将对象输出到object.txt
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"obj.txt"));
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("红", 12, new Engine()));
		list.add(new Car("绿", 13, new Engine()));
		list.add(new Car("蓝", 14, new Engine()));

		oos.writeObject(list);

		oos.close();
		// 将object中的对象打印到控制台

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"obj.txt"));
		ArrayList<Car> c = (ArrayList<Car>) ois.readObject();
		for (Car car : c) {
			car.run();
		}
		ois.close();

	}

	public static void Dome1() throws FileNotFoundException,
			UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		System.setOut(new PrintStream(new File("log.txt"), "GBK"));

		PrintStream pw = System.out;
		while (true) {
			String line = sc.nextLine();
			if (line.equals("quit"))
				break;
			else {
				pw.println(line);
			}
		}
		pw.close();
	}

}
