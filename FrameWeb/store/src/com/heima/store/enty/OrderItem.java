package com.heima.store.enty;

public class OrderItem {

	private String itemid;
	private Double quantity;
	private Product product;
	private Orders orders;
	
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(String itemid, double quantity, Product product, Orders orders) {
		super();
		this.itemid = itemid;
		this.quantity = quantity;
		this.product = product;
		this.orders = orders;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	public double getTotal() {
		
		return (quantity*product.getShop_price());
	}
	@Override
	public String toString() {
		return "OrderItem [itemid=" + itemid + ", quantity=" + quantity + ", product=" + product + ", orders=" + orders
				+ "]";
	}
	
	
}
