package com.kh.practice7.classroom;

public class ClassRoom {

	public static void main(String[] args) {
		//1. �л� �̸��� �����ϴ� ���ڿ� �迭 �����ϰ� �ʱ�ȭ
		String[] students = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		//2. �� �д��� ��� ���� ������ ���� rows �ళ�� cols ������
		int cols = 2;
		int rows = 3;
		
		//3. �� ���� 2���� ���ڿ� �迭 classRoom1 classRoom2 ���� �� �ʱ�ȭ
		//�� �д��� �ڸ� ��ġ�� ��Ÿ��
		String[][] classRoom1 = new String[rows][cols];
		String[][] classRoom2 = new String[rows][cols];
		//4. �л� �迭�� �ݺ�ó���ϱ� ���� �ݺ���
		//   i ������ �л� �ε���
		for (int i = 0; i < students.length; i++) {
			int row = i % rows; //row ������ �� �ε���
			int col = i /rows;  //col ������ �� �ε���
			if (col % 2 == 0) {//���� ���� ¦�� ������ Ȯ��
							   //¦�� ���� ù ��° �дܿ� �ش�
				classRoom1[row][col/2] = students[i]; // col/2 �� �ε����� ������ ������ ��ġ
			}else {//���� ���� Ȧ�� ���� ��� �� ��° �дܿ� �ش�
				classRoom2[row][col/2] = students[i];
			}
		
		}
		System.out.println("==========1�д�==========");
		printClassRoom(classRoom1);
		System.out.println("==========2�д�==========");
		printClassRoom(classRoom2);
		
	}
		//classRoom ��� �޼ҵ� �д� �ڸ� ��ġ�� ����ϴ� ����
		public static void printClassRoom(String[][] classRoom) {
			// ���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ�
			for(int row = 0; row<classRoom.length;row++) {
				//
				for(int col = 0; col<classRoom[0].length;col++) {
					System.out.print(classRoom[row][col] + " ");
				}
				System.out.println();
			}
		}
}
