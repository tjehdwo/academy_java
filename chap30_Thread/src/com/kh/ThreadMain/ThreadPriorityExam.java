package com.kh.ThreadMain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		StudentThread st1 = new StudentThread("학생 1");
		StudentThread st2 = new StudentThread("학생 2");
		StudentThread st3 = new StudentThread("학생 3");
		StudentThread st4 = new StudentThread("학생 4");
		StudentThread st5 = new StudentThread("학생 5");
		
		//스레드에 우선순위 설정
		st1.setPriority(Thread.MAX_PRIORITY);//우선순위를 최대로 설정 max
		st2.setPriority(Thread.MIN_PRIORITY);//우선순위를 최소로 설정 min
		st3.setPriority(2);
		st4.setPriority(3);
		st5.setPriority(4);
		
		
		//스레드 시작
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		
	}

}
