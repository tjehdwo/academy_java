package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh");
		//System.out.println(skKim.serialNum);
		stKim.serialNum++;
		//�츮 ���� ����å 10�� ĭ
		//�츮 ���� ����å 2��° 11�� ĭ
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2�л�");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.println("kh 2�л� : ");
		System.out.println(khLee.serialNum);
	}

}
