package com.kh.finalSample;

import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	
	public static void main(String[] args) {
		int port =3333;
		String serverIP;
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP, 3333);
		System.out.println("서버 연결");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}