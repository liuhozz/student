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
	 * 分析:
	 * 	1.两个String数组    一个放花色   一个放数字
	 * 	2.将两个数组组成完整的扑克牌放到HashMap集合中   Key是索引  value是扑克牌
	 * 	3.将索引拿出来为一个新的ArrayList  对其进行洗牌(即随机排序)
	 * 	4.根据Key获取值得到每个人的牌
	 */
	public static void main(String[] args) {
		String [] s1={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String [] s2={"红心","方块","梅花","黑桃"};
		
		TreeSet<Integer> ni=new TreeSet<>();
		TreeSet<Integer> wo=new TreeSet<>();
		TreeSet<Integer> ta=new TreeSet<>();
		TreeSet<Integer> dp=new TreeSet<>();
		
		ArrayList<Integer> in=new ArrayList<>();
		HashMap<Integer, String> hm=new HashMap<>();
		
		int index=0;
		//拼接扑克   并将索引存储在HM中
		for(String num:s1){
			for(String clo:s2){
				hm.put(index, clo.concat(num));
				index++;
				in.add(index);
				
			}
		}
		
		hm.put(index, "小王");
		index++;
		hm.put(index, "大王");
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
		
		look(hm, ni,"你");
		look(hm, wo,"我");
		look(hm, ta,"他");
		look(hm, dp,"底牌");
		
	}

	public static void look(HashMap<Integer, String> hm, TreeSet<Integer> ni ,String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"的牌是:");
		
		for(Integer i: ni){
			System.out.print(hm.get(i)+"  ");
		}
		System.out.println("");
	}

}
