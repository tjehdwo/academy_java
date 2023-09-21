package com.kh.finalSample;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	public static void main(String[] args) throws Exception{
	int port = 3333;
	
	ServerSocket server;
	
	server = new ServerSocket(3333);
	System.out.println("서버가 포트" + port + "에서 실행 중입니다.");
	while(true) {
		Socket client = server.accept();
		System.out.println("클라이언트 접속 : " + client.getInetAddress());
		
		InputStream is = client.getInputStream();
		Scanner sc = new Scanner(is);
	
		OutputStream os = client.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.print("hi client");
		ps.flush();
		System.out.println("클라이언트 연결");
	}
	

}
}
