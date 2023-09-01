package com.kh.practice.exam;

import java.util.Scanner;

public class Practice1 {
	/*사용자로부터 한 개의 값을 입력받아 1부터 그숫자까지의 숫자들을 출력하세요
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");//한 개의 값을 입력 받는다
		int num = sc.nextInt();//사용자로부터 입력받을 수 있는 공간
		
		if(num<1) {//1미만 숫자 입력 "1 이상의 숫자를 입력해주세요." 출력
		System.out.println("1 이상의 숫자를 입력해주세요.");	
		} else {//1 이상인 숫자만 들어온다.
			//1부터 그숫자까지의 숫자들을 모두 출력하세요.
			int i = 0;
			for (i = 1; i<=num; i++);{
				System.out.println(i);

			}

		}
		

	}

}
