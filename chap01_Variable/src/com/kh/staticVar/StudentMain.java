package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh");
		//System.out.println(skKim.serialNum);
		stKim.serialNum++;
		//우리 서점 국어책 10번 칸
		//우리 서점 국어책 2번째 11번 칸
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2학생");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.println("kh 2학생 : ");
		System.out.println(khLee.serialNum);
	}

}
