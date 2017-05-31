package com.heima.enty;

/*
 * 定义一个手机类(Phone),有这些属性: 品牌(brand),价格(price)
		定义一个测试类,创建5个手机的对象并存储到集合中,要求按照价格的从高到低进行排序,结果输出到控制台.
 */
public class Phone {
	private String brand;
	private int price;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
