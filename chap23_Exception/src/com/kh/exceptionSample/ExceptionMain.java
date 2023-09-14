package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();	
		//exmain.ExceptionF();
		exmain.ExceptionExam();
		
		
	}
	public void ExceptionA() {
		try {
			int result = 10 /0;//0으로 나누는 시도
			System.out.println("result : " + result);
			
		} catch(ArithmeticException e) {
			/*
			 ArithmeticException 수학적인 계산 과정에서 발생하는 오류 
			 ArithmeticException e : e는 우리가 지정한 변수명
			 e로 지정한 변수로 메세지를 getMessage() 로 전달받는다.
			 */
			System.out.println("산술 연산으로 인해 발생한 에러!!" + e.getMessage());
		}
		
	}

	public void ExceptionN() {
	 try {
		String text = null;
		int length = text.length();
		//내용이 없는데 text로 부터 문자열의 길이를 얻기
		System.out.println("문자열 길이 : " + length);
	 } catch (NullPointerException abc) {
		 System.out.println("빈 값임!!! " + abc.getMessage());
		 
	 }
	 
	 
	 }
		
	public void ExceptionF() {
		try {
			//050904
			String juminNumber = "팔오공904";
			int number = Integer.parseInt(juminNumber);//문자열을 정수로 변환 시도
			System.out.println("숫자 : " + number);//안에 String이 들어있기 때문에 실행이 되지 않음
		} catch (NumberFormatException b) {
			System.out.println("숫자만 넣어주세요 ");
			System.out.println("NumberFormatEception 발생 " + b.getMessage());
		}
		
		
	}

	public void ExceptionExam() {
	  try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;//유효하지 않은 인덱스 넘버
		int result = numbers[index];
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!!");
	  }catch(Exception e) {
		  System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
	  }finally {
		  System.out.println("Finally 등장!");
	  }
	  System.out.println("프로그램이 종료되었습니다.");
	  }

}
