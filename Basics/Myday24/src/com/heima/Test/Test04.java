package com.heima.Test;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}

class MyTicket implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				if (ticket == 0)             
					break;
				/*try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				System.out.println(Thread.currentThread().getName() + "这是第"
						+ ticket-- + "号票");
			}
		}
	}

}