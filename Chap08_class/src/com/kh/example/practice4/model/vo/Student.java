package com.kh.example.practice4.model.vo;

     public class Student {
			int grade;
			int classroom;
			String name;
			double height;
			char gender;
	
			public Student() {
		    this.grade = grade = 1; //grade�� 1�� �ʱ�ȭ
			this.classroom = classroom = 2; //classroom 2�� �ʱ�ȭ
			this.name = "�ڼ�ö"; //name �ʱ�ȭ
			this.height = 180.5; //Ű �ʱ�ȭ
			this.gender = '��'; //���� '��'���� �ʱ�ȭ
		}
		//3. ��� �޼ҵ� + information() : void
	 public void information() {
		 System.out.println("�г� : " + grade);
		 System.out.println("�� : "+ classroom);
		 System.out.println("�̸� : " + name);
		 System.out.println("Ű :" + height);
		 System.out.println("���� : " + gender);
	 }
}
