package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("���� ������ �Է��� �ּ���. :");
	    double kor = sc.nextDouble();
	    System.out.println("���� ������ �Է��� �ּ���. :");
	    double eng = sc.nextDouble();
	    System.out.println("���� ������ �Է��� �ּ���. :");
	    double math = sc.nextDouble();
	    //������ ����� ������
	    int averageScore = (int) (kor + eng + math);
	    int totalScore = (averageScore / 3);
	    System.out.println("��������="+kor+"��������="+eng+"��������="+math+"����="+averageScore+"�������="+totalScore);
	}

}
