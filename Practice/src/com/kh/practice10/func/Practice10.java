package com.kh.practice10.func;

public class Practice10 {

	public static void main(String[] args) {
		/*
		 * �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
		 * ��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���
		 * ex.
		 * �ֹε�Ϲ�ȣ(-����) : 123456-1234567
		 * 123456-1******
		 */
		//1. �ֹι�ȣ �����
		              //012345678910111213
		String jumin = "123456-1234567"; //14�ڸ�
		
		//2. �����ڸ� ���� ��ǥ ����°� �����
		String makestar = "*";
		
		//�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		//to char Array�� ����ؼ� String-> char Array�� ����
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		for(int a =8; a<=13; a++) {
			juminStar[a] = '*';
		}
		System.out.println(juminStar);
	 
	}

}
