package com.heima.Test;

public class Test01 {
	public static void main(String[] args) {
		//xx x=new xx();
		Thread t=new Thread(new xx());
		t.start();
		//匿名内部类实现多线程
		/*new Thread(){
			public void run(){
			}
		}.start();
		Thread th=new Thread( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		th.start();*/
		
		
		//当前线程的引用		Thread.currentThread();
		//使当前线程休眠		Thread.sleep();
		//守护线程			t.setDaemon(true);  这句代码要写在t.start前面不然没有作用
		//加入线程 (当前线程暂停   执行完调用该方法线程  当前线程在继续执行     通俗来说就是插队)  t1.join();
		//礼让线程 			yield
		//设置线程的优先级     	setpriority()最大值为10最小值为1默认为5
		//同步代码块		synchronized(锁对象){被锁住的代码块}  所对象不能用匿名对象
		//同步方法			synchronized声明在方法上  非静态的方法同步锁为this	静态方法的所对象为类的字节码对象
		
		
	}
}


class xx implements Runnable{
	public void run(){						//重写run方法方法体内些将要执行的代码写在方法中
		yy y= new yy();
		y.a();
	}
}


class yy {
	public void a(){
		System.out.println("aaaaaaa");
	}
}