package com.kh.pracitce3.userScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		
		int[] numbers = new int[5];
		
		//배열에다가 5개의 정수를 입력하는 포문
		for(int i = 0; i<=4; i++) {
			System.out.println("정수 index "+(i)+ " : ");
			//System.out.println("정수 자리값 "+(i+1)+ " : ");
			numbers[i] = sc.nextInt();
			//ArrayList 경우 colors.get(0)
			//배열은 [] 안에 넣음
			/*근데 배열의 자리가 없네? 배열의 자리 먼저 만들어줘야겠다
			어떻게?
			바깥에다가 int numbers 이녀석의 배열을 만들어줘야지!
			포문이 시작하기전에 전체적인 장바구니는 만들어줘야하잖아
			*/
			
			//또는 기본 for문을 사용하고 싶다면 length 이용해서 출력 가능
			
		}
		//배열의 모든 요소를 더한 결과 출력
		//조건이 최종까지 더하는 것익시 때문에 향상된 for 문 사용
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//합산된 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : "+ sum);
	}

}
