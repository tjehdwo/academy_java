package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 :");
		int num = sc.nextInt();
		boolean isTrue = true;//1. 조건 값 만들기 boolean 변수 = true of false;
		while(isTrue) {//2. 조건 추가하기
			if(num < 1) {//만일 1 미만의 숫자가 입력
				System.out.println("1 이상의 숫자를 입력해주세요.");
			
		
		} else {//1 이상인 숫자들
			for (int i = 1; i<=num; i++) {
				System.out.println(i);
}//3.false 만들기
			isTrue = false;
			break;//if나 switch에서 사용 할 수 있다.
			}
			}
		}
	}