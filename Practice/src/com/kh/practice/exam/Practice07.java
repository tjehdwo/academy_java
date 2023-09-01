package com.kh.practice.exam;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단 입력하세요.");
		int num = sc.nextInt();
		
		System.out.println(num+ "단");//키보드로 입력한 숫자가 들어가게 함
		for(int i =1; i<= 9; i++) {
			int result = num *i;
			System.out.println(i+"일때"+result);
		}

	}

}
