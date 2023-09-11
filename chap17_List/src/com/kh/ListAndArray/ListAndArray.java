package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListAndArray ar = new ListAndArray();
		ar.ListArray2();
		
	}
	/*1.번 public static void ListArray1 로 변경후
	ListArray1();
	
	2.번
	*/
	
	
		public static void ListArray1() {	//Array 예제
			int[] intArray = new int[2]; //크기가 5인 정수 배열 생성
			intArray[0]=1;
			intArray[1]=2;
		
		//Array 출력
		System.out.println("Array 요소 : ");
		for(int a=0; a < intArray.length ;a++) {
			System.out.println(intArray[a] + " ");
		}
		System.out.println();//개행문자 포함돼있어 enter 같은 역할을 함
		                         //빈 배열 리스트 생성

		List<Integer> intList = new ArrayList<>();//Integer 객체를 저장하는 ArrayList
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		System.out.println("List 요소 : ");
		for (int num : intList) {
			System.out.print(num + " ");
			System.out.println(" ");
		}
	}
	
	public void ListArray2() {	
		String[] stArray = new String[2];
		stArray[0]="서동재";
		stArray[1]="김철준";
		
		System.out.println("Array 요소 : ");
		for(int a = 0 ; a <stArray.length;a++) {
			System.out.println(stArray[a] + " ");
		}
		System.out.println();
		
		
		List<String> stList = new ArrayList<>();
		stList.add("김유민");
		stList.add("김철규");
		stList.add("정우준");
		stList.add("조창연");
		
		System.out.println("List 요소 : ");
		for(String str : stList) {
			System.out.print(str + " ");
			System.out.print(" ");
		}
	
	
	
	}
	
}
		
	
	
	

