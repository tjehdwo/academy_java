package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors"+ colors);
		
		colors.add("����");
		colors.add("��Ȳ");
		colors.add("���");
		colors.add("�ʷ�");
		colors.add("�Ķ�");
		colors.add("����");
		colors.add("����");
		
		System.out.println("��ü���� : "+colors);
		
		colors.set(1,"��");
		colors.set(3,"����");
		colors.set(4,"�׸�");
		
		System.out.println("���� : "+colors);
		
		colors.add(2,"���ο�");
		System.out.println("���ο� �߰� : "+colors);
		colors.add(6,"�����Ķ�");
		System.out.println("�����Ķ� �߰� : "+colors);
		
		for(String AAA:colors) {
			System.out.println(AAA);
		}
		colors.add("�Ķ�");
		System.out.println("�Ķ� �ٽ� �߰� : "+colors);
		System.out.println("���� ��� : " + colors.get(0)+" "+colors.get(8)+" "+colors.get(9));
		
	}

}
