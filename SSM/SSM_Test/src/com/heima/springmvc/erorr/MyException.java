package com.heima.springmvc.erorr;

public class MyException extends Exception {

	private String msg;
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
}
