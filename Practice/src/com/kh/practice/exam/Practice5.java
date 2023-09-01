package com.kh.practice.exam;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			sum += i;
			System.out.println("1부터"+num + "까지의 정수들의 합은"+sum);
		}

	}

}
