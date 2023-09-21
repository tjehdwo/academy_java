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
		String serverIP; // �� ������ �ּ�
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println("serverIP");
		Socket socket = new Socket(serverIP, 3333);
		System.out.println("sever connect");
		
		//Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream os = socket.getOutputStream();
		
		//Ŭ���̾�Ʈ���� ������ �޼��� ����
		String msg = "hi . server";
		os.write(msg.getBytes());
		os.flush();
		
		socket.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}