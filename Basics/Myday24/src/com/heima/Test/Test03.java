package com.heima.Test;

public class Test03 {

	/**
	 *四个窗口买完100章火车票
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}


class Ticket extends Thread{
	private static int ticket=300;
	public void run(){
		while(true){
			if(ticket==0)
				break;
			
			System.out.println(getName()+"这是第"+ticket--+"号票");
		}
	}
}