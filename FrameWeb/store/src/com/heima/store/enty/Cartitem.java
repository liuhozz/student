package com.heima.store.enty;

public class Cartitem {

	Product product;
	
	Integer num;
	
	Double totle;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getTotle() {
		return product.getShop_price()*num;
	}

	public void setTotle(double totle) {
		this.totle = totle;
	}

	public Cartitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cartitem(Product product, int num, double totle) {
		super();
		this.product = product;
		this.num = num;
		this.totle = totle;
	}

	@Override
	public String toString() {
		return "Cartitem [product=" + product + ", num=" + num + ", totle=" + totle + "]";
	}
	
	
}
