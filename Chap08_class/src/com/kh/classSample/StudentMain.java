package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		//public Student(String name, int age, String grade)
		
		Student student1 = new Student("서동재",28,"1학년");
		Student student2 = new Student("홍길동",29,"2학년");
		Student student3 = new Student("김개똥",30,"3학년");
		Student student4 = new Student("이아무개",31,"4학년");
		
		//학생 정보 출력
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		
		/*학생을 3명 만들어서 3명 출력하기
          student2, student3, student4
          각각의 이름과 나이와 학년을 displayInfo(); 를 사용해서 출력하세요. 
        */

	}

}
