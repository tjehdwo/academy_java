package com.kh.whileExample;

public class while04 {

	public static void main(String[] args) {
		//1���� 10���� �� ���ϱ�
		int sum = 0;//���� ��
		int num = 1;
		
		while(num <= 5) {
			System.out.println("num �� : " + num);
			sum += num;
			num = num +1;			
			//System.out.println("sum �� : "+ sum);
			//sum�� �հ踦 �ֱ������� ��������� while�� �ȿ� �ۼ��ϱ�
		}System.out.println("sum �� : "+ sum);
		/*
		  while�� ����Ǿ����ؼ� Ŭ������ ����� ���� �ƴ�
		  while���� ����� �� �����ִ� System.out.println(sum)�� ��µ�
	    */

	}

}
