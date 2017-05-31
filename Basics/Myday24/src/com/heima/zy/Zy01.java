package com.heima.zy;

public class Zy01 {

	/**
	 * 写一个程序,模拟迅雷下载进度,开启两个线程,模拟下载同一个文件, 每个线程对文件下载进度加10,耗时1秒钟, 当进度为100时,程序停止.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Z();
		Thread t=new Thread(z);
		t.start();
		
		Thread t1=new Thread(z);
		t1.start();
	}

}

class Z implements Runnable {
	private int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (count = 0; count < 100; count++) {
			
			if(count%10==0)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName() + "迅雷下载了" + count
					+ "%");
		}
	}

}

/*
 * new Thread(new Runnable() { private int count=100; public void run() { for
 * (int i = 0; i <= 100; i++) {
 * 
 * System.out.println(Thread.currentThread().getName()+"迅雷下载了"+i+"%"); } }
 * }).start();
 * 
 * new Thread(new Runnable() { public void run() { for (int i = 0; i <= 100;
 * i++) { System.out.println(Thread.currentThread().getName()+"迅雷下载了"+i+"%"); }
 * } }).start();
 */