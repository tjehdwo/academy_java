package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
	   /*
		*          ����                       ��
		*           |                        |
		*           v                        V
		*        [first] <-> [second] <-> [third]
		*     ^                                    ^
	    *     |                                    |
		*  [     ]                             [       ]
	    */
		// ArrayDequeue ����Ͽ� Dequeue ����
		Deque<String> deque = new ArrayDeque<>();
		
		//��� �߰�
		deque.addFirst("First");
		deque.addLast("Last");
		
		//�� �հ� �ǵ� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		//�Ǿհ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		//����ִ��� Ȯ��
		System.out.println();
		
	}

}
