package com.heima.JPG;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JPGCon {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String regex="http://";
		
	}

	public static void JPG_Url(String Url) throws MalformedURLException, IOException,
			FileNotFoundException {
		URL url = new URL(Url);
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		
		InputStream is = conn.getInputStream();
		
		FileOutputStream fos=new FileOutputStream("");
		
		byte [] arr =new byte[8192];
		int len;
		
		while((len=is.read(arr))!=-1){
			fos.write(arr,0,len);
		}
		is.close();
		fos.close();
	}

}
