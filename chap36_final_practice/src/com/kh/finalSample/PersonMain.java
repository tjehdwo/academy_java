package com.kh.finalSample;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] pArray = new Person[3];
		
		pArray[0] = new Person("������");
		pArray[1] = new Person("��ö��");
		pArray[2] = new Person("��ö��");
		
		for(int i = 0; i<pArray.length;i++) {
			System.out.println(pArray[i].getName());
		}
	}

}
