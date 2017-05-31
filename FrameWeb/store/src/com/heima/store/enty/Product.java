package com.heima.store.enty;

import java.util.Date;

public class Product {

	private String pid;
	private String pname;
	private Double market_price;
	private Double shop_price;
	private String pimage;
	private Date pdate;
	private Integer is_hot;	
	private String pdesc;
	private String pflag;
	private Category category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Product(String pid, String pname, double market_price, double shop_price, String pimage, Date pdate,
			int is_hot, String pdesc, String pflag, Category category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.market_price = market_price;
		this.shop_price = shop_price;
		this.pimage = pimage;
		this.pdate = pdate;
		this.is_hot = is_hot;
		this.pdesc = pdesc;
		this.pflag = pflag;
		this.category = category;
	}



	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getMarket_price() {
		return market_price;
	}

	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}

	public double getShop_price() {
		return shop_price;
	}

	public void setShop_price(double shop_price) {
		this.shop_price = shop_price;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public int getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getPflag() {
		return pflag;
	}

	public void setPflag(String pflag) {
		this.pflag = pflag;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", market_price=" + market_price + ", shop_price="
				+ shop_price + ", pimage=" + pimage + ", pdate=" + pdate + ", is_hot=" + is_hot + ", pdesc=" + pdesc
				+ ", pflag=" + pflag + ", category=" + category + "]";
	}
	
	
	
	
	
	
	
}
