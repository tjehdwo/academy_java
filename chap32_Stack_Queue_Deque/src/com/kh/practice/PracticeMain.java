package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
	//	pm.practiceStack();
		pm.practiceQueue();
	}
	
	public void practiceStack() {//stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(15);
		st.push(30);
		st.push(5);
		st.push(40);
		st.push(19);
		
		System.out.println("현재 스택 : " + st);
		
		st.peek();
		System.out.println("가장 상단의 값 : " + st.peek());
		
		st.pop();
		System.out.println("제거 후 스택 : " + st);
		
		
		st.contains(1);
		System.out.println("1이 포함되어 있는지 여부 : " + st.contains(1));
		
		st.size();
		System.out.println("스택의 크기 : " + st.size());
		
		st.clear();
		System.out.println("전체 삭제 후 스택 : "+ st);
		
		st.empty();
		System.out.println("스택이 비어 있는지 여부 : " + st.empty());
	}

	public void practiceQueue() {
	Queue<String> qe = new LinkedList<>();
	
	qe.offer("서동재");
	qe.offer("김철준");
	qe.offer("정우준");
	
	

	String removedElement = qe.poll();
	System.out.println(removedElement);
	System.out.println("");
	
	
	
	/*String frontElement = qe.peek();
	System.out.println(frontElement);*/
	
	
	while(!qe.isEmpty()) {
		String element = qe.poll();
		System.out.println(element);
	}
	}
	
}
