package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = "���� ���߱� ������ �����մϴ�.";
	private String NextMsg ="1���� 100 ������ ���ڸ� ���纸����!";
	private String NextMsg2 ="������ ���ڸ� �Է��ϼ���.";
	private String NextMsg3 ="���ڸ� ������ϴ�.";
	private String NextMsg4 ="Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	private String NextMsg5 ="�õ�Ƚ�� : " ;
	private String NextMsg6 ="���� ����!";
	
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println(NextMsg);
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������
	
	public void displayGuessPromt() {
		System.out.println(NextMsg2);
	}
	
	public void displayCorrectGuess() {
		System.out.println(NextMsg3);
	}
	
	public void displayInCorrectGuess() {
		System.out.println(NextMsg4);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println(NextMsg5 + attempts);
	}
	
	public void displayGameOver() {
		System.out.println(NextMsg6);
	}

}
