package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num < 1) {//만일 1 미만의 숫자가 입력
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {//1 이상인 숫자들
			for (int i = num;i>=1 ;i--) {//for문 안에 완성하기
				System.out.println(i);
			}
		}
	}

}
		 /*사용자로부터 한개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 거꾸로 출력하세요.
		  */


