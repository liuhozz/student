package com.heima.store.enty;

import java.util.HashSet;
import java.util.Set;

public class Category {

	private String cid;
	private String cname;
	private Set<Product> product=new HashSet<>();
	
	
	public Category(String cid, String cname, Set<Product> product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", product=" + product + "]";
	}
	
	
	
}
