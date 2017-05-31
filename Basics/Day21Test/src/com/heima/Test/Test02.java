package com.heima.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test02 {

	/**
	 * 鍦ㄨ鍫備笂鐨勬枃鏈枃浠朵腑鐨勬瘡涓�鍙嶈浆鐨勫熀纭�笂,瀵规瘡涓�鐨勫唴瀹逛篃杩涜鍙嶈浆!
			渚嬪,鍘熸枃鏈殑鍐呭鏄�abc
								def
								hjk
			鍙嶈浆鍚庣殑鍐呭鏄�kjh
						   fed
						   cba
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("1.txt"));
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(new StringBuilder(list.get(i)).reverse().toString());//list.get(i)
			bw.newLine();
		}

		bw.close();
	}

}
