package com.kh.practice10.func;

public class Practice10 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		 * 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		 * ex.
		 * 주민등록번호(-포함) : 123456-1234567
		 * 123456-1******
		 */
		//1. 주민번호 만들기
		              //012345678910111213
		String jumin = "123456-1234567"; //14자리
		
		//2. 성별자리 이후 별표 만드는거 만들기
		String makestar = "*";
		
		//주민등록번호 성별자리 이후부터 *로 가리고 출력
		//to char Array를 사용해서 String-> char Array로 변경
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		for(int a =8; a<=13; a++) {
			juminStar[a] = '*';
		}
		System.out.println(juminStar);
	 
	}

}
