package com.heima.classroom;

import java.util.HashMap;
import java.util.Map.Entry;

public class Dome1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("张三", 43);
		hm.put("李四", 32);
		hm.put("王五", 22);
		hm.put("赵六", 12);
		
		//dome1(hm);
		/*Set<Map.Entry<String, Integer>> hms=hm.entrySet();
		for (Entry<String, Integer> entry : hms) {
			System.out.println(entry);
		}*/
		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}
	}

	public static void dome1(HashMap<String, Integer> hm) {
		for (String string : hm.keySet()) {
			 System.out.println(string+"="+hm.get(string));
		}
	}

}
