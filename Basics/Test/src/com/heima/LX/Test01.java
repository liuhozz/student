package com.heima.LX;

import java.util.ArrayList;


public class Test01 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Itheima().stringE("heelele"));
		ArrayList list =new ArrayList<>();
		list.add("100");
		list.add(100);
		list.add(new Object());
		list.add(new User());
		Thread t=new Thread(new User());
		t.start();
		
	}

}

class Itheima {

	public boolean stringE(String s) {
		boolean b = false;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.contains("e")) {
				s=s.substring(s.indexOf('e')+1);
				count++;
				//System.out.println(count);
			}
			
		}
		if (count > 0 && count <= 3) {
			b = true;
			System.out.println(count);
		} else {
			b = false;
			// return b;
		}
		return b;

	}

}


/*if (count > 0 && count <= 3) {
	b = true;
	System.out.println(count);
} else {
	b = false;
	// return b;
}*/