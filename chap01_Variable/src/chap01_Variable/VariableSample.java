package chap01_Variable;

public class VariableSample {

	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		
		System.out.println("안녕하세요." + name + "입니다. 오늘 "+ hour +"시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + " 입니다.");
		System.out.println(score + " 은 학점 " + grade + " 입니다.");
		
		//변수에 이름과 나이와 자신의 성적 (double)로 넣기.
		/*
		 -이름 String
		 나이 int
		 성적 double
		 char를 이용한 등급 적용하고 출력하기 ~ 25분까지
		 * */
		String myName = "김경난";
		int myAge =90;
		double myScore = 90.5;
		char myGrade = 'A';
		
		System.out.println("저의 이름은 " + myName + "입니다. 저의 나이는" + myAge + "이구요, 나의 성적은" + myScore + "입니다. 저의 등급은 " + myGrade + " 입니다.");
	}

}
