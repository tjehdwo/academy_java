package com.kh.finalSample;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception{
	int port = 3333;
	
	ServerSocket server;
	
	server = new ServerSocket(3333);
	System.out.println(port);
	System.out.println("���� �����");
	while(true) {
		Socket client = server.accept();
		System.out.println(client.getInetAddress());
		System.out.println("Ŭ���̾�Ʈ ����");
	}
	

}
}
