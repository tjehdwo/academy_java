package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("���ڿ��� �Է��ϼ���. :");
    String s = sc.next();
    
    char a = s.charAt(0);
    System.out.println("index 0��° �ڸ�"+a);
    
    char p = s.charAt(1);
    System.out.println("index 1��° �ڸ� :"+p);
	
    char p2 = s.charAt(2);
    System.out.println("index 2��° �ڸ� :"+p2);
    }

}
