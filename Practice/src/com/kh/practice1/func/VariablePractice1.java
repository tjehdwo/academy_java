package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요. :");
		String name = sc.next();
		System.out.println("성별을 입력하세요.(남/여) :");
        String gender = sc.next();
		System.out.println("나이를 입력하세요. :");
		int age = sc.nextInt();
		System.out.println("키를입력하세요(cm) :");
		double height = sc.nextDouble();
		System.out.println("키 :"+ height + "인"+"나이 :"+ age +"성별:"+gender + "이름 :"+name+"입니다");
		

	}

}
