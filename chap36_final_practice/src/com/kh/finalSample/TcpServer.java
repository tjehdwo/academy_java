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
	System.out.println("������ ��Ʈ" + port + "���� ���� ���Դϴ�.");
	while(true) {
		Socket client = server.accept();
		System.out.println("Ŭ���̾�Ʈ ���� : " + client.getInetAddress());
		
		InputStream is = client.getInputStream();
		Scanner sc = new Scanner(is);
	
		OutputStream os = client.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.print("hi client");
		ps.flush();
		System.out.println("Ŭ���̾�Ʈ ����");
	}
	

}
}
