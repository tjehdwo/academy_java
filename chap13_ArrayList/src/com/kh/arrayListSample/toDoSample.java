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
		System.out.println("�ؾ��� �� : " + toDoSample);
		
		toDoSample.add("�ڵ�");
		toDoSample.add("����");
		toDoSample.add("�丮");
		System.out.println("�ؾ��� �� : " + toDoSample);
		
		int size = toDoSample.size();
		System.out.println("�ؾ��� ���� ���� : " + size);
		
		String firstToDoSample = toDoSample.get(0);
		System.out.println("ó���� ���� : " + firstToDoSample );
		String lastToDoSample = toDoSample.get(2);
		System.out.println("������ ���� : " + lastToDoSample);
		
		toDoSample.set(1, "�����ϰ� ����");
		toDoSample.set(2, "������");
		System.out.println("����,�丮 �� : " + toDoSample);
		
		toDoSample.remove(1);
		System.out.println("���� ���� �Ϸ� : " + toDoSample);
		
		for (String aaaaaaaa:toDoSample) {
			System.out.println("�ؾ��� �� ��� : " + aaaaaaaa);
		}
		
		toDoSample.clear();
		System.out.println("��� ���� �� �� (��������) : " + toDoSample);
		
		
	}

}
