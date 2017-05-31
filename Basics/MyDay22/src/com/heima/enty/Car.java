package com.heima.enty;

import java.io.Serializable;

/*
 *   再定义一个汽车类(Car),该类中有以下属性: 颜色(color),轮子个数(num), 引擎(engine)
 *   这三个属性都有set和get方法,空参和有参构造方法.
	 定义一个方法(run),在这个方法中显示颜色和轮子个数, 调用引擎(engine)的start方法.
 */
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String color;
	private int num;
	private Engine engine;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String color, int num, Engine engine) {
		super();
		this.color = color;
		this.num = num;
		this.engine = engine;
	}
	
	public void run(){
		System.out.println(this.color+"\t"+this.num);
		engine.start();
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", num=" + num + ", engine=" + engine
				+ "]";
	}
	
}