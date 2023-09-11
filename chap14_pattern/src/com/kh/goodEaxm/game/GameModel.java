package com.kh.goodEaxm.game;
//���� ���ڸ��߱� ���� ��
public class GameModel {
	private int secretNumber; //������ ��ȣ
	private int attempts;     //�� �� �õ� �ߴ°�

	public GameModel() {
		//1~100 ������ ������ ���� �����ϱ�
		secretNumber = (int)(Math.random()*100)+1;
		attempts = 0;
	}
	//1���� 100���� �� ��ǻ�Ͱ� �������� ������ ���� 1��
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementAttempts();
		//guess�� ���� �Է��߱� ������ ���� �޼ҵ带 �߰�
		return guess == secretNumber;
	}
}
