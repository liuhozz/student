package com.heima.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Pocker {

	/**
	 * ����:
	 * 	1.����String����    һ���Ż�ɫ   һ��������
	 * 	2.��������������������˿��Ʒŵ�HashMap������   Key������  value���˿���
	 * 	3.�������ó���Ϊһ���µ�ArrayList  �������ϴ��(���������)
	 * 	4.����Key��ȡֵ�õ�ÿ���˵���
	 */
	public static void main(String[] args) {
		String [] s1={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String [] s2={"����","����","÷��","����"};
		
		TreeSet<Integer> ni=new TreeSet<>();
		TreeSet<Integer> wo=new TreeSet<>();
		TreeSet<Integer> ta=new TreeSet<>();
		TreeSet<Integer> dp=new TreeSet<>();
		
		ArrayList<Integer> in=new ArrayList<>();
		HashMap<Integer, String> hm=new HashMap<>();
		
		int index=0;
		//ƴ���˿�   ���������洢��HM��
		for(String num:s1){
			for(String clo:s2){
				hm.put(index, clo.concat(num));
				index++;
				in.add(index);
				
			}
		}
		
		hm.put(index, "С��");
		index++;
		hm.put(index, "����");
		in.add(index);
		
		Collections.shuffle(in);
		
		for(int i=0 ;i<in.size();i++){
			if(in.size()-i<=3)
				dp.add(in.get(i));
			else if(i%3==0)
				ni.add(in.get(i));
			else if(i%3==1)
				wo.add(in.get(i));
			else{
				ta.add(in.get(i));
			}
		}
		
		look(hm, ni,"��");
		look(hm, wo,"��");
		look(hm, ta,"��");
		look(hm, dp,"����");
		
	}

	public static void look(HashMap<Integer, String> hm, TreeSet<Integer> ni ,String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"������:");
		
		for(Integer i: ni){
			System.out.print(hm.get(i)+"  ");
		}
		System.out.println("");
	}

}
