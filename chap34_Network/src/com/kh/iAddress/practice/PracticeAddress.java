package com.kh.iAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		PracticeAddress pa = new PracticeAddress();
	}
	
	public void practiceInet() {
		try {
			InetAddress ad = InetAddress.getByName("www.daum.net");
			
			System.out.println("Host Name : " + ad.getHostName());
			System.out.println("IP Address : " + ad.getHostAddress());
			
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
