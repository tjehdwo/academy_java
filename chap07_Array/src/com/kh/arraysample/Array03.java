package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 ���ڿ��� �Է� �޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ�
		 ���ڿ��� �� �� �� �ִ��� ������
		 �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
	    */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");//���ڿ��� �Է�
		String inputString = sc.next();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");//�˻��� ����
		char searchChar = sc.next().charAt(0);//ù ��°
		//���ڿ��� -> ���ڷ� ��ȯ
		////�ȳ��ϼ���. -> {'��', '��', '��', '��', '��'}
        
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		char[] charString = inputString.toCharArray();		
		//inputString �� ���� ���ڰ� ��
		//3. ���ڿ��� �� �� �� �ִ��� ����üũ
		int charCount = charString.length;
		System.out.println("charCount :"+charCount);
		
		//String -> char
		
		//�˻��� ���ڰ�
		//���ڿ��� �� �� �� �ִ��� ������ -> length
		//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� �ε��� �� ���
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		int count = 0;
		System.out.println(inputString+ "��"+ searchChar+ "�� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��
		for (int i = 0; i <charCount; i++) {
		    //���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� �� ��° �ε����� �����ϴ��� �ε��� ����ϱ�
			if (charString[i] == searchChar) {
				//charString[i] �������� �ƴ϶� i���� �Ǿ� �ϴ� ������
				//searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �־�� ��.
				//���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
				System.out.println(i);
				count++;	
				
				
			}
			
			
			
		
		}
		

	}

}
