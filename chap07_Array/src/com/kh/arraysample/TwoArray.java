package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		//이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple","banana","cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi"}
		};
		System.out.println("fruits.length : "+ fruits.length);
		System.out.println("fruits[0].length : "+ fruits[0].length);
		System.out.println("fruits[1].length : "+ fruits[1].length);
		System.out.println("fruits[2].length : "+ fruits[2].length);
		for (int i = 0; i<fruits.length;i++) {
			//System.out.println("첫번째 포문 :"+ i);
			for(int a = 0;a <fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				//System.out.println("두번째 포문 : "+a);
			}
			System.out.println();//다음행으로 이동할 수 있게 enter 용 출력 메서드 입력
		}
	}

}
