package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	//String Integer T ����Ͽ� ���
	public void practice1() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(33);
		intList.add(21);
		intList.add(40);
		intList.add(58);
		
		printList(intList);
	
		
		
	}
	public static <T> void printList(ArrayList<T> list) {
		for (T item:list) {
			System.out.println(item);
		}
		
	}

	public void practice2() {
		//box ��ü�� com.kh.genericparactice; �ؿ�����
		//������ �����͸� �����ϴ� box �ν��Ͻ� ����
		Box<Integer> intBox = new Box<>();
		intBox.put(33);
		intBox.put(19);
		int intValue = intBox.get();
		//���ڿ� �����͸� �����ϴ� box �ν��Ͻ� ����
		Box<String> strBox = new Box<>();
		strBox.put("�ȳ�");
		strBox.put("�ȳ�");
		strBox.put("���� �����");
		String strValue = strBox.get();
		//���� ���
		
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		// ���� for�� �̿��ؼ� �� ��� ���
		printBox(intBox);
		}
		public static <T> void printBox(Box<T> intbox ) {
			
			}
		
	}
	
	

