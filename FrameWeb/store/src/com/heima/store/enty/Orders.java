package com.heima.store.enty;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Orders {

	private String oid;
	private Date ordertime;//下订单时间
	private Double total;  //总计
	private Integer state;
	private String address;
	private String name;
	private String telephone;
	
	private User user;

	Set<OrderItem> orderitem=new HashSet<OrderItem>();
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String oid, Date ordertime, Double total, Integer state, String address, String name,
			String telephone, User user, Set<OrderItem> list) {
		super();
		this.oid = oid;
		this.ordertime = ordertime;
		this.total = total;
		this.state = state;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
		this.user = user;
		this.orderitem = list;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderItem> getList() {
		return orderitem;
	}

	public void setList(Set<OrderItem> list) {
		this.orderitem = list;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", ordertime=" + ordertime + ", total=" + total + ", state=" + state
				+ ", address=" + address + ", name=" + name + ", telephone=" + telephone + ", user=" + user + ", list="
				+ orderitem + "]";
	}

	

	
	
	
}
