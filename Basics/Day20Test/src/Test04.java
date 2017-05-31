

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Test04 {

	/**
	 * @param args
	 *            操作IO流时尽量晚开早关
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Dome1();
		// Dome2();
		// Dome3();
		// Dome4();
		//Demo5__TransIO();
		//获取一个文本上每个字符出现的次数,将其写入TXT文件
		/*
		 * 分析
		 * 	1.创建带缓冲的输入流对象
		 * 	2.创建TreeMap
		 * 	3.存入TreeMap
		 * 	4.关闭输入流
		 * 	5.创建输出流对象
		 * 	6.遍历集合    将内容写入TXT文件
		 * 	7.关闭输出流
		 */
		
		
	}

	public static void Demo5__TransIO() throws UnsupportedEncodingException,
			FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(""),
				"utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream(""), "gbk");
		int c;
		while ((c = isr.read()) != -1)
			osw.write(c);
		isr.close();
		osw.close();
	}

	public static void Dome4() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(""));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter(""));
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}

		bw.close();
	}

	public static void Dome3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("");
		FileWriter fw = new FileWriter("");
		char arr[] = new char[1024 * 9];
		int len;
		while ((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		fr.close();
		fw.close();
	}

	public static void Dome2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("");
		FileWriter fw = new FileWriter("");
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}

		fr.close();
		fw.close();
	}

	public static void Dome1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("");

		int c = fr.read();

		char a = (char) c;
		fr.close();
	}

}