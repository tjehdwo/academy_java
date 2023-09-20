package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws  IOException {
		//������ �����ϱ� ���� ���� ����
		Socket socket = new Socket("localhost",12345);
		
		//������ �����͸� ������ ���� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		//������ ���� �����͸� �ޱ� ���� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����κ��� �Է� �ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		System.out.println("������ ��ȭ�� �����մϴ�. �����Ϸ��� 'exit'�� �Է��ϼ���.");
		while((userInputString = userInput.readLine())!= null) {
			out.println(userInputString);
			
			//�����κ��� ���� ���� ���
			String serverResponse = in.readLine();
			System.out.println("���� ���� ������ : " + serverResponse);
			
			// ����ڰ� 'exit'�� �Է��ϸ� ��ȭ ����
            if ("exit".equalsIgnoreCase(userInputString)) {
                break;
			
		}
		//���� �� �Է� ��Ʈ�� �ݱ�
		socket.close();
		userInput.close();
	
	
		}
	}
}
