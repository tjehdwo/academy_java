package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("문자열을 입력하세요. :");
    String s = sc.next();
    
    char a = s.charAt(0);
    System.out.println("index 0번째 자리"+a);
    
    char p = s.charAt(1);
    System.out.println("index 1번째 자리 :"+p);
	
    char p2 = s.charAt(2);
    System.out.println("index 2번째 자리 :"+p2);
    }

}
