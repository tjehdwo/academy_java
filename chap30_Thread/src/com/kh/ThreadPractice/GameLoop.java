package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameLoop {
	private static boolean gameLoops = false;
	public static void main(String[] args) {
		GameLoop gm = new GameLoop();
		
		Thread gt = new Thread(gm.new Gm());
		gt.start();
		
		try {
			System.in.read();
			
			gameLoops = true;
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	class Gm implements Runnable{
		@Override
		public void run() {
			while(!gameLoops) {
				int randomValue = new Random().nextInt(10);
				System.out.println("임의의 숫자 : " + randomValue);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("게임을 종료하려면 Enter키를 누르세요.");
			}
		}
	}

}
