package com.kh.switchsample;

public class SwitchBreak {

	public static void main(String[] args) {
		int day = 2;
		switch (day) { //day == 30
			case 1: //case�� 30�̸� ������ ��� false
				System.out.println("������"); //��µ��� ����
				
			case 2:
				System.out.println("ȭ����"); //��µ��� ����
				
			case 30:
				System.out.println("������");
				
			default :
				System.out.println("�ָ�");
		}

	}

}