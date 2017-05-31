package com.heima.Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Scanner;

public class Chat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DatagramSocket socket=new DatagramSocket();
		Packet p=new Packet();
		Socket s=new Socket();
		//new Thread(p).start();
		new Thread(s).start();
		
	}

}

class Packet implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			DatagramSocket socket = new DatagramSocket(7788);
			DatagramPacket packet =new DatagramPacket(new byte[1024], 1024);
			while(true){
			
			socket.receive(packet);
			byte[] s = packet.getData();
			int l=packet.getLength();
			
			System.out.println(new String (s,0,l)+":"+packet.getAddress().getHostAddress());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Socket implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String str;
				str = sc.next();
				if(str.equals("quit"))
					break;
				DatagramSocket socket = new DatagramSocket();
				DatagramPacket packet = new DatagramPacket(str.getBytes(),
						str.getBytes().length,
						InetAddress.getByName("192.168.39.32"), 7788);
				socket.send(packet);
				socket.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}