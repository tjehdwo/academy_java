package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();

		
		
		player1.setName("KH");
		player1.setHealth(100);
		player1.ValidHealth();
		player1.setAttackPower(30);
		
		player1.displayInfo();
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("ㅎㅎㅎ");
		player2.setHealth(100);
		player2.setAttackPower(20);
		
		player2.displayInfo();
		System.out.println();
		System.out.println("attack!!!!");
		
		player1.attack(player2);
	  //  player2.attack(player1);
	}

}
