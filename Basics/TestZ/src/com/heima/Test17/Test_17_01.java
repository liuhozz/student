package com.heima.Test17;

import java.util.HashSet;

import com.heima.enty.Worker;

public class Test_17_01 {

	/**
	 * ����һ��Ա����(Worker),Ҫ��Ҫ����Щ����: ����(name),����(age),����(salary)
		  ��дhashCode������equals����
		  �ٶ���һ��������,����һ������,�洢���Ա������, ����.����.���ʶ���ͬ����Ϊ��ͬһ������, 
		  Ҫ�󼯺��е�Ԫ��Ҫ��֤Ψһ��.������������̨��.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Worker> hs=new HashSet<>();
		hs.add(new Worker("asf", 12, 123654));
		hs.add(new Worker("asf", 12, 123654));
		hs.add(new Worker("����", 12, 123654));
		hs.add(new Worker("����", 12, 12365));
		hs.add(new Worker("����", 22, 123654));
		
		System.out.println(hs);
	}

}
