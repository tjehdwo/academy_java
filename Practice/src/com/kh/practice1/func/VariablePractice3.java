package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    //가로길이,세로길이
    double width, height;
    
    System.out.println("가로길이 :");
    width = sc.nextDouble();
    System.out.println("세로길이: ");
    height = sc.nextDouble();
    
    double area = width * height;
    double round = (width + height)*2;
    System.out.println("면적 :"+ area);
    System.out.println("둘레 :"+round);
	}

}
