package com.kh.arrayListSample;

/*
 * toDoSample.java
 * ArrayList �̿��ؼ�
 * ���� ����� 3��
 * �����ϰ� (2��)
 * ����� (1)
 * ���δ� �����ϱ�
 */
import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoSample = new ArrayList();
		
		toDoSample.add("�ڵ�");
		toDoSample.add("����");
		toDoSample.add("�丮");
		System.out.println("�ؾ��� �� : " + toDoSample);
		
		toDoSample.set(1, "�����ϰ� ����");
		toDoSample.set(2, "������");
		System.out.println("����,�丮 �� : " + toDoSample);
		
		toDoSample.remove(1);
		System.out.println("���� ���� �Ϸ� : " + toDoSample);
		
		toDoSample.clear();
		System.out.println("��� ���� �� �� (��������) : " + toDoSample);
		
		
	}

}
