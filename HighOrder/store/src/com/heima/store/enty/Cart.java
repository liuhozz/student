package com.heima.store.enty;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	//总计 , user(如果用户没有的登陆则不能看购物车)map<String(存放pid),cartitem>
	private double total;  //总计
	private Map<String, Cartitem> map=new HashMap<String, Cartitem>();;
	
	//添加购物项 到 购物车
	public void addcartitem(Cartitem cartitem){
		String pid=cartitem.getProduct().getPid();
		
		//map.containsKey(pid)?cartitem.setNum(cartitem.getNum()+cartitem.getNum()):map.put(pid, cartitem);
		
		if(map.containsKey(pid)){
			//cartitem.setNum(map.get(pid).getNum()+cartitem.getNum());
			Cartitem oldItem=map.get(pid);
			oldItem.setNum(oldItem.getNum()+cartitem.getNum());
		}else{
			map.put(pid, cartitem);
		}
		
		/*if(map.containsKey(pid)){
			//获取到原先的购物项
			CartItem oldItem=map.get(pid);
			oldItem.setNum(oldItem.getNum()+cartItem.getNum());
			
		}else{
			map.put(pid, cartItem);
		}*/
	}
	//获取所有的购物项
	
	
	//删除购物项
	public void remove(String pid){
		map.remove(pid);
	}
	
	//清空购物车
	public void clearcart(){
		map.clear();
	}

	public Collection<Cartitem> getCartItemAll(){
		return map.values();
	}
	
	
	public double getTotal() {
		total=0;
		//获取到Map中所有的购物项
		Collection<Cartitem> values = map.values();
		
		//遍历所有的购物项,将购物项上的小计相加
		for (Cartitem cartItem : values) {
			total+=cartItem.getTotle();
		}
		
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Map<String, Cartitem> getMap() {
		return map;
	}

	public void setMap(Map<String, Cartitem> map) {
		this.map = map;
	}

	
	
	
}
