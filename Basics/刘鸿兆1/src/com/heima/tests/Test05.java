package com.heima.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.heima.enty.Person;

public class Test05 {

	/**
	 *  1���Ӽ�����¼��3���˵���Ϣ�����������䡢�Ա𡢵绰��סַ��
		2������һ������������¼�����Ϣ��װ��Person���󣬰Ѷ���洢�ڼ����С�
		3��ʹ�����ֱ�����ʽ������ӡ�����еĶ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("��¼����Ϣ:   (��ʽΪ:����,����,�Ա�,�绰,סַ;�Իس�Ϊ�ָ�;quit����)");
		
		ArrayList<Person> per=new ArrayList<>();
		
		while(true){
			String input=sc.next();
			if(!input.equals("quit")){
			String [] s=input.split(",");
			per.add(new Person(s[0], s[2], s[3], s[4], Integer.parseInt(s[1])));
			
			}
			else{
				break;
			}
		}
		
		for (Person person : per) {
			System.out.println(person);
		}
		System.out.println("-------------------------------------------");
		
		Iterator<Person> it=per.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
