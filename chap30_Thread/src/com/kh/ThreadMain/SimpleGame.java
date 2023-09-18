package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		// �ܺ� Ŭ������ �ν��Ͻ��� ����
		SimpleGame s = new SimpleGame();
		// ���� ���� ������ ����
		Thread gameThread = new Thread(s.new Gm());
		gameThread.start();
		
		//���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			System.in.read();
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class Gm implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("������ �����Ϸ��� EnterŰ�� ��������.");
				
			}
		}
	}

	class GameLoops implements Runnable{
		
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);//������ ���� ����
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000); //1�� ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� ����.");
			}
		}

	}
}

