package com.kh.practice5;

import java.util.Random;

public class Lotto {
	


	public static void main(String[] args) {
		/*

		 * 
		 * 
		 * 
		 * */
		int lotto[] = new int[6];
		System.out.println("�ζ� ��ȣ : ");
		
		//��� �ص� �ǰ� ���ص� ��
		for(int i = 0;i<lotto.length;i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i]= num;
		}
	}
}
	
	
			
		
		
		
		





