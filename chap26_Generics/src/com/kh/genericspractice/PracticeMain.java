package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	//String Integer T 사용하여 출력
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
		//box 객체를 com.kh.genericparactice; 밑에생성
		//정수형 데이터를 저장하는 box 인스턴스 생성
		Box<Integer> intBox = new Box<>();
		intBox.put(33);
		intBox.put(19);
		int intValue = intBox.get();
		//문자열 데이터를 저장하는 box 인스턴스 생성
		Box<String> strBox = new Box<>();
		strBox.put("안녕");
		strBox.put("안녕");
		strBox.put("나는 동재야");
		String strValue = strBox.get();
		//각각 출력
		
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		// 향상된 for문 이용해서 값 모두 출력
		printBox(intBox);
		}
		public static <T> void printBox(Box<T> intbox ) {
			
			}
		
	}
	
	

