package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(6789);
			System.out.println("Server waiting");
			
			
			//���࿡ Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ� �ۼ�
			while(true) {
				Socket client = serverSocket.accept();
				System.out.println("connect Client");
				
				//�о�� �� �ڵ�
				InputStream inStream = client.getInputStream();
				Scanner sc = new Scanner(inStream);
				System.out.println("Server | Client : " + sc.nextLine());
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				printStream.print(" Hi Client");
				System.out.println("Server | Client");
				printStream.flush(); //������ �����͸� �ѹ��� ��Ƴ�
				
				client.close();
				System.out.println("Server " + client.getInetAddress().getHostAddress());
				
				//���� ������ ���Ѵ�� ������ �Ǿ�� �ϳ�
				//���� ������ �ְ� ���� ��
				int count = 0;
				if (count > 7) {
					serverSocket.close(); //������ ����
					System.out.println("Server Close");
				}
				count +=1;
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
