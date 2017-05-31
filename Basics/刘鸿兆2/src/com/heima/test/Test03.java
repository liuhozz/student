package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test03 {

	/**
	 * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		ArrayList<String> list=new ArrayList<>();
		String s;
		while((s=br.readLine())!=null){
			list.add(s);
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("retext.txt"));
		for (int i=list.size()-1;i>=0;i--) {
			bw.write(list.get(i));
		}
		bw.close();
	}

}
