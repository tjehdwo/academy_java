package com.kh.whileExample;

import java.util.Scanner;

public class while05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;//sum은 0인 상태
        
        System.out.println("5이하의 정수를 입력해주세요.");
        int num = sc.nextInt();//아직 어떤 값을 받을지는 모름
       
        while(sum <= 10) {
        	sum += num;
        	num = num +1;
        	System.out.println("num :"+ num);
        	System.out.println("sum :"+ sum);
        	
        }

	}

}
