package com.heima.springmvc.pojo;

import java.util.List;

public class QueryVo {

	private List<Integer> ids;
	
	private List<Item> items;
	
	private Item item;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
