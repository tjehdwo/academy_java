package com.kh.classSample;

import com.kh.classSample.Student;

public class Student {
	//1. �������( �л��� �Ӽ� )
	String name;
	int age;
	String grade;
	
	/******** ������ *******/
	public Student(String name, int age, String grade) {
		this.name = name;
	    this.age = age;
	    this.grade = grade;
	}
	//�л� ���� ��� �޼���
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("��    �� : " + age);
		System.out.println("��    �� : " + grade);
		System.out.println();
	}
	   

}
