package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڿ��� �Է����ּ���.");
		String str1 = sc.next();
		System.out.println("�� ��° ���ڿ��� �Է����ּ���.");
		String str2 = sc.next();
		sc.close();
		
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		//���ڿ��� �ؽ� �ڵ� ���
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode1);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		//���ڿ��� ���ڿ� ǥ�� ���
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("ù ��° ���ڿ��� ���ڿ� ǥ�� : " + str1String);
		System.out.println("�� ��° ���ڿ��� ���ڿ� ǥ�� : " + str2String);
	}
}
