package com.kh.hw.person;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		student.information();
		Scanner sc = new Scanner(System.in);
		System.out.println("계속 입력 하시겠습니까?(y/n)");
		sc.next();
		
		
	
	}

}
