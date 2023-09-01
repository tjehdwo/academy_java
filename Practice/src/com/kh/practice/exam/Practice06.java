package com.kh.practice.exam;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 두 개의 값을 입력 받아
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int start = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력해주세요 :");
		int end = sc.nextInt();
		
		//그 사이의 숫자를 모두 출력
		System.out.println(start + "부터"+ end + "까지 숫자");
		for (int i = start; i<= end;i++){
			System.out.println(i);
		}
		

	}

}
