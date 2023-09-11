package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//      String
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		//���� �����ϴ� ���� �Է�����
		view.displayGuessPromt();
		int guess = sc.nextInt();
		//boolean isTrue = true;
		//��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		//while(true) {//false�� �� �� ���� �ݺ�
		if(model.inCorrectGuess(guess)){
		view.displayCorrectGuess();
		//break;
		} else {//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
			view.displayInCorrectGuess();
			view.displayAttempts(model.getAttempts());
			//isTrue = false;
			view.displayGameOver();
		}
		}

			
		
		
			
	//}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
		}
}
