package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    //���α���,���α���
    double width, height;
    
    System.out.println("���α��� :");
    width = sc.nextDouble();
    System.out.println("���α���: ");
    height = sc.nextDouble();
    
    double area = width * height;
    double round = (width + height)*2;
    System.out.println("���� :"+ area);
    System.out.println("�ѷ� :"+round);
	}

}
