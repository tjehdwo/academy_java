package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEaxm {

	public static void main(String[] args) {
		//List �������̽� LinkedList ��ü Ȱ���ؼ� �� �ְ� ���
		List<String> linkedList = new LinkedList<>();
		linkedList.add("������");
		linkedList.add("��ö��");
		linkedList.add("������");
		
		System.out.println("linkedList : " + linkedList);
		//String �� �ְ� ���� ���� ���
		linkedList.set(2,"��ö��");
		System.out.println("���� �� : " + linkedList);
		linkedList.remove(1);
		System.out.println("���� �� : " + linkedList);
		
		
		//LinkedList ��ü new LinkedList ��ü
		//int �� �ְ�
	}

}
