package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(3);
		int intValue = intBook.get();// �� ��ȯ �ʿ����
		
		// ���ڿ� ������ �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("gggggg");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("c++");
		String strValue = strBook.get();
		
		//���ʸ� Ŭ���� ����ؼ� �پ��� ������ ������ ó���� �� �ְ�
		//����� �� ����
		System.out.println("Int value : " + intValue);
		System.out.println("String Value : " + strValue);
	
	
	
	}

}
