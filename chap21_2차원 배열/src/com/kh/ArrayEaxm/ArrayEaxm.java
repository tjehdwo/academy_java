package com.kh.ArrayEaxm;

import java.util.Scanner;

public class ArrayEaxm {
	public void practice1() {
		int value = 16;
	int[][] arr = new int[4][4];
	
	for(int i =0; i <arr.length; i++) {
		for(int j = 0;j<arr[i].length; j++) {
			arr[i][j] = value++;
		}
	}
		
	}
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		
		for(int i =0; i <arr.length; i++) {
			for(int j = 0;j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
		}
	}
	public void practice3() {
		int row = 0;
		int col = 0;
		char value = 'a';
		char[][] arr = null;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("���� ũ�� : ");
				row = sc.nextInt();
				
				arr = new char[row][];
				
				for(int i = 0; i<arr.length; i++) {
					System.out.println(i+ "���� ũ��");
					col = sc.nextInt();
					
					arr[i] = new char[col];
				}
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j <arr[i].length; j++) {
						arr[i][j] = value++;
					}
				}
				
				for (int i = 0; i<arr.length;i++) {
					for(int j =0;j<arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
	}
	public void practice4() {
		int count = 0;
		String[] students = {"���ǰ�","������","�����","�����","���̹�", "�ں���", "�ۼ���","������", "������", "��õ��", "��ǳǥ", "ȫ����"};
	    String[][] seat1 = new String[3][2];
	    String[][] seat2 = new String[3][2];
	    
	    for(int i = 0 ; i< seat1.length; i++) {
	    	for(int j = 0; j<seat1[i].length;j++) {
	    		seat1[i][j] = students[count++];
	    	}
	    }
	    for(int i = 0 ; i< seat2.length; i++) {
	    	for(int j = 0; j<seat2[i].length;j++) {
	    		seat2[i][j] = students[count++];
	    	}
	    }
	    System.out.println("==1�д�==");
	    for(int i = 0;i<seat1.length;i++) {
	    	for(int j = 0;j<seat1[i].length;j++) {
	    		System.out.print(seat1[i][j] + " ");
	    	}
	    	System.out.println();
	    }
		
	}
}
		
/*printf("��� ����",����� ����);
 * ��� �� �ٹٲ� ���� ����
 * �ٹٲ��� �Ϸ��� �����ڰ� %n �� �־������
 * %b boolean �������� ���
 * %d ���� �������� ���
 * 
 * println();//%n ���ԵǾ� �־ �ٹٲ�
 * 
 * 
 * 
 * 
 * */
