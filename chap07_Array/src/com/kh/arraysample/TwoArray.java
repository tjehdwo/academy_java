package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		//���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple","banana","cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi"}
		};
		System.out.println("fruits.length : "+ fruits.length);
		System.out.println("fruits[0].length : "+ fruits[0].length);
		System.out.println("fruits[1].length : "+ fruits[1].length);
		System.out.println("fruits[2].length : "+ fruits[2].length);
		for (int i = 0; i<fruits.length;i++) {
			//System.out.println("ù��° ���� :"+ i);
			for(int a = 0;a <fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				//System.out.println("�ι�° ���� : "+a);
			}
			System.out.println();//���������� �̵��� �� �ְ� enter �� ��� �޼��� �Է�
		}
	}

}
