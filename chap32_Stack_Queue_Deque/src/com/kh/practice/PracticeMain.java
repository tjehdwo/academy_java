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
	
	public void practiceStack() {//stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(15);
		st.push(30);
		st.push(5);
		st.push(40);
		st.push(19);
		
		System.out.println("���� ���� : " + st);
		
		st.peek();
		System.out.println("���� ����� �� : " + st.peek());
		
		st.pop();
		System.out.println("���� �� ���� : " + st);
		
		
		st.contains(1);
		System.out.println("1�� ���ԵǾ� �ִ��� ���� : " + st.contains(1));
		
		st.size();
		System.out.println("������ ũ�� : " + st.size());
		
		st.clear();
		System.out.println("��ü ���� �� ���� : "+ st);
		
		st.empty();
		System.out.println("������ ��� �ִ��� ���� : " + st.empty());
	}

	public void practiceQueue() {
	Queue<String> qe = new LinkedList<>();
	
	qe.offer("������");
	qe.offer("��ö��");
	qe.offer("������");
	
	

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
