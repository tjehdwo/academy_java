package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListAndArray ar = new ListAndArray();
		ar.ListArray2();
		
	}
	/*1.�� public static void ListArray1 �� ������
	ListArray1();
	
	2.��
	*/
	
	
		public static void ListArray1() {	//Array ����
			int[] intArray = new int[2]; //ũ�Ⱑ 5�� ���� �迭 ����
			intArray[0]=1;
			intArray[1]=2;
		
		//Array ���
		System.out.println("Array ��� : ");
		for(int a=0; a < intArray.length ;a++) {
			System.out.println(intArray[a] + " ");
		}
		System.out.println();//���๮�� ���Ե��־� enter ���� ������ ��
		                         //�� �迭 ����Ʈ ����

		List<Integer> intList = new ArrayList<>();//Integer ��ü�� �����ϴ� ArrayList
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		System.out.println("List ��� : ");
		for (int num : intList) {
			System.out.print(num + " ");
			System.out.println(" ");
		}
	}
	
	public void ListArray2() {	
		String[] stArray = new String[2];
		stArray[0]="������";
		stArray[1]="��ö��";
		
		System.out.println("Array ��� : ");
		for(int a = 0 ; a <stArray.length;a++) {
			System.out.println(stArray[a] + " ");
		}
		System.out.println();
		
		
		List<String> stList = new ArrayList<>();
		stList.add("������");
		stList.add("��ö��");
		stList.add("������");
		stList.add("��â��");
		
		System.out.println("List ��� : ");
		for(String str : stList) {
			System.out.print(str + " ");
			System.out.print(" ");
		}
	
	
	
	}
	
}
		
	
	
	

