package com.kh.practice7;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		//����ڿ��� ���� ũ�⸦ �Է� �ް�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
		int numRows = sc.nextInt();
		sc.nextLine(); //���๮�� ����
		
		int[][] charArray = new int[numRows][];
		//�� ����ŭ�� �ݺ��� ���� 
		for(int i = 0; i < numRows; i++) {
			//���� ũ�⵵ �޾�
			System.out.println(i+"���� ũ�� �ޱ� : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i*numCols + 1;
			for (int j = 0; j < numCols; j++) {
				charArray[i][j] = StartValue++;
			}
		}
			//����ϼ���.
			//�迭 ���
			for (int i = 0; i < numRows; i++) {
				for (int j = 0; j<charArray[i].length; j++) {
					System.out.println((char)('a' + charArray[i][j]-1));
				}
				System.out.println();
			}
			sc.close();
		}
		
		//������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		//�׸��� �� �ε�����'a'���� �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		
	}

