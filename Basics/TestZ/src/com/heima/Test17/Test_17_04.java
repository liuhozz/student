package com.heima.Test17;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.enty.Phone;

public class Test_17_04 {

	/**
	 * 4.����һ���ֻ���(Phone),����Щ����: Ʒ��(brand),�۸�(price)
		����һ��������,����5���ֻ��Ķ��󲢴洢��������,Ҫ���ռ۸�ĴӸߵ��ͽ�������,������������̨.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Phone> ts=new TreeSet<>(new Comparator<Phone>() {

			@Override
			public int compare(Phone o1, Phone o2) {
				// TODO Auto-generated method stub
				int num=o1.getPrice()-o2.getPrice();
				return num==0?o1.getBrand().compareTo(o2.getBrand()):num;
			}
		});
		
		ts.add(new Phone("����",12));
		ts.add(new Phone("��Ϊ",22));
		ts.add(new Phone("ƻ��",32));
		ts.add(new Phone("С��",12));
		ts.add(new Phone("С��ͨ",42));
		
		System.out.println(ts);
	}

}
