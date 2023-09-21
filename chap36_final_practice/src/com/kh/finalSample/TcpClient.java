package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	
	public static void main(String[] args) {
		int port =3333;
		String serverIP; // 내 아이피 주소
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println("serverIP");
		Socket socket = new Socket(serverIP, 3333);
		System.out.println("sever connect");
		
		//클라이언트와 통신을 위한 입 출력 스트림 설정
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream os = socket.getOutputStream();
		
		//클라이언트에서 서버로 메세지 전송
		String msg = "hi . server";
		os.write(msg.getBytes());
		os.flush();
		
		socket.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}