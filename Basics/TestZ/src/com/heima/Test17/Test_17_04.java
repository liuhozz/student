package com.heima.Test17;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.enty.Phone;

public class Test_17_04 {

	/**
	 * 4.定义一个手机类(Phone),有这些属性: 品牌(brand),价格(price)
		定义一个测试类,创建5个手机的对象并存储到集合中,要求按照价格的从高到低进行排序,结果输出到控制台.
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
		
		ts.add(new Phone("三星",12));
		ts.add(new Phone("华为",22));
		ts.add(new Phone("苹果",32));
		ts.add(new Phone("小米",12));
		ts.add(new Phone("小灵通",42));
		
		System.out.println(ts);
	}

}
