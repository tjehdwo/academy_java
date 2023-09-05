package com.kh.example.practice4.model.vo;

     public class Student {
			int grade;
			int classroom;
			String name;
			double height;
			char gender;
	
			public Student() {
		    this.grade = grade = 1; //grade를 1로 초기화
			this.classroom = classroom = 2; //classroom 2로 초기화
			this.name = "박성철"; //name 초기화
			this.height = 180.5; //키 초기화
			this.gender = '남'; //성별 '남'으로 초기화
		}
		//3. 출력 메소드 + information() : void
	 public void information() {
		 System.out.println("학년 : " + grade);
		 System.out.println("반 : "+ classroom);
		 System.out.println("이름 : " + name);
		 System.out.println("키 :" + height);
		 System.out.println("성별 : " + gender);
	 }
}
