package com.heima.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test03 {

	/**
	 * ���������ָ�����ܣ���Ŀ���£�
		����:����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ts=new ArrayList<>();
		while(true){
			String input =sc.next();
			if(input.equals("quit"))
				break;
			else{
				Integer i=Integer.parseInt(input);
				ts.add(i);
			}
		}
		
		Collections.sort(ts);
		for(int i=ts.size()-1;i>=0;i--){
			System.out.println(ts.get(i));
		}
		



		
	
		
	}

}
