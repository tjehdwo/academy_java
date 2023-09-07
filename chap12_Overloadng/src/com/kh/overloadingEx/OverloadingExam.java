package com.kh.overloadingEx;
/*
 * java ������ ����µ�
 * OverSample.java �����
 * �����ε� 5�� ����� 5�� ����ϱ�
 */
public class OverloadingExam {
	//������ ����
	public int sum(int a,int b) {
		return a+b;
	}
	//�� ���� ������ ����
	public int sum(int a,int b, int c) {
		return a+b+c;
	}
	//�� ���� �Ǽ��� ����
	public double sum(double a,double b) {
		return a+b;
	}
	public double sum(double a,double b,double c) {
		return a+b+c;
	}
		

	public static void main(String[] args) {
		
		OverloadingExam obj = new OverloadingExam();
		
		//�޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.sum(10, 20));
		System.out.println("�� ������ �� : " + obj.sum(10, 20, 30));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5,10.5));
		
	}

}
