package com.heima.enty;

import java.util.List;

public class Page {

	//currently当前
	//all总共
	//num记录数
	//allnum总记录数
	int currentlypage;
	int allpage;
	int num;
	int allnum;
	List<Student> list;
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Page(int currentlypage, int allpage, int num, int allnum, List<Student> list) {
		super();
		this.currentlypage = currentlypage;
		this.allpage = allpage;
		this.num = num;
		this.allnum = allnum;
		this.list = list;
	}
	public int getCurrentlypage() {
		return currentlypage;
	}
	public void setCurrentlypage(int currentlypage) {
		this.currentlypage = currentlypage;
	}
	public int getAllpage() {
		return allpage;
	}
	public void setAllpage(int allpage) {
		this.allpage = allpage;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAllnum() {
		return allnum;
	}
	public void setAllnum(int allnum) {
		this.allnum = allnum;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	
}
