package com.kh.arrayListSample;

/*
 * toDoSample.java
 * ArrayList 이용해서
 * 할일 만들고 3개
 * 수정하고 (2개)
 * 지우고 (1)
 * 전부다 삭제하기
 */
import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoSample = new ArrayList();
		System.out.println("해야할 일 : " + toDoSample);
		
		toDoSample.add("코딩");
		toDoSample.add("빨래");
		toDoSample.add("요리");
		System.out.println("해야할 일 : " + toDoSample);
		
		int size = toDoSample.size();
		System.out.println("해야할 일의 개수 : " + size);
		
		String firstToDoSample = toDoSample.get(0);
		System.out.println("처음에 할일 : " + firstToDoSample );
		String lastToDoSample = toDoSample.get(2);
		System.out.println("마지막 할일 : " + lastToDoSample);
		
		toDoSample.set(1, "빨래하고 정리");
		toDoSample.set(2, "설거지");
		System.out.println("빨래,요리 후 : " + toDoSample);
		
		toDoSample.remove(1);
		System.out.println("빨래 정리 완료 : " + toDoSample);
		
		for (String aaaaaaaa:toDoSample) {
			System.out.println("해야할 일 목록 : " + aaaaaaaa);
		}
		
		toDoSample.clear();
		System.out.println("모든 일을 한 후 (전부제거) : " + toDoSample);
		
		
	}

}
