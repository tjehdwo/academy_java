package com.kh.practice.exam;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 두 개의 값을 입력 받아
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int start = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요 :");
		int end = sc.nextInt();
		
		/*Scanner sc = new Scanner(System.in);
		//사용자로부터 두 개의 값을 입력 받아
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int firstNumber = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요 :");
		int secondNumber = sc.nextInt();
		
		int start = Math.min(firstNumber, secondNumber);
		int end =Math.max(firstNumber, secondNumber);*/
		
		//math 자바의 내장 클래스
		//min (가장 작은 값) 주어진 두개의 숫자 중에서 더 작은 값을 반환
		//max (가장 큰 값) 주어진 두개의 숫자 중에서 더 큰 값을 반환
		int a = 5;
		int b = 8;
		int minValue = Math.min(a,b);
		System.out.println(minValue);
		int maxValue = Math.max(a,b);
		System.out.println(maxValue);
		
		int reStart = end;//end가 start보다 작을 때 reStart로 넣어준다
		int reEnd = start;//start가 end보다 클 때 reEnd로 넣어준다
		System.out.println(start + "부터"+ end + "까지 숫자");
		
		if (reEnd < reStart) {
		
			for (int i = start; i<=end;i++) {
				System.out.println(i);
			}
		}else if (reStart < reEnd) {
			for(int i = reStart; i<= reEnd; i++) {
				System.out.println(i);
			}
			
		}
	}

}
