package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("국어 점수를 입력해 주세요. :");
	    double kor = sc.nextDouble();
	    System.out.println("영어 점수를 입력해 주세요. :");
	    double eng = sc.nextDouble();
	    System.out.println("수학 점수를 입력해 주세요. :");
	    double math = sc.nextDouble();
	    //총점과 평균은 정수형
	    int averageScore = (int) (kor + eng + math);
	    int totalScore = (averageScore / 3);
	    System.out.println("국어점수="+kor+"영어점수="+eng+"수학점수="+math+"총점="+averageScore+"평균점수="+totalScore);
	}

}
