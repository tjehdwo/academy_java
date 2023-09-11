package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = "숫자 맞추기 게임을 시작합니다.";
	private String NextMsg ="1에서 100 사이의 숫자를 맞춰보세요!";
	private String NextMsg2 ="추측한 숫자를 입력하세요.";
	private String NextMsg3 ="숫자를 맞췄습니다.";
	private String NextMsg4 ="틀렸습니다. 다시 시도하세요.";
	private String NextMsg5 ="시도횟수 : " ;
	private String NextMsg6 ="게임 종료!";
	
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println(NextMsg);
	}
	//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임종료
	
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
