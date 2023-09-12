package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEaxm {

	public static void main(String[] args) {
		//List 인터페이스 LinkedList 객체 활용해서 값 넣고 출력
		List<String> linkedList = new LinkedList<>();
		linkedList.add("서동재");
		linkedList.add("김철규");
		linkedList.add("김유민");
		
		System.out.println("linkedList : " + linkedList);
		//String 값 넣고 수정 삭제 출력
		linkedList.set(2,"김철준");
		System.out.println("수정 후 : " + linkedList);
		linkedList.remove(1);
		System.out.println("삭제 후 : " + linkedList);
		
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고
	}

}
