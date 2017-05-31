package com.heima.xm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class T01 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.setSize(480, 150);
		frame.setLocation(450, 300);// 设置出现位置

		frame.setVisible(true);
		frame.setResizable(false);	
		final Label text = new Label();

		frame.add(text);

		final Random r = new Random();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					text.setForeground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
					text.setFont(new Font("", Font.PLAIN, 40));
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					String time = sdf.format(new Date());
					text.setText(time);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		

	}

}


/*class myListener extends WindowAdapter{


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}*/