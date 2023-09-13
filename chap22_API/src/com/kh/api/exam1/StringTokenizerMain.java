package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는 데 사용
  						주어진 구분자(기본:공백)를 기준으로 문자열을 토큰으로 분리
 */
	public static void main(String[] args) {
		StringTokenizerMain sdj = new StringTokenizerMain();
		sdj.stringToMath();	
	}
	public void STExam(){
		String text = "apple orange banana";
	StringTokenizer tokenizer = new StringTokenizer(text);
	
	//hasMoreTokens
	while (tokenizer.hasMoreTokens()) {
		String token = tokenizer.nextToken();
		System.out.println(token);
	}
}
	
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text,",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void stExam3() {

		String text = "정우준,서동재,조창연,김유민,나종원";
		StringTokenizer tokenizer2 = new StringTokenizer(text,",");
		
		while(tokenizer2.hasMoreTokens()) {
			String name = tokenizer2.nextToken();
			System.out.println(name);
		}
		
	}
	
	public void stExam4() {
		
	}
	
	public void stExam5() {
		String text = "This is a test. But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text,",");
		
		while(tokenizer.hasMoreTokens()){
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	
	public void stExam6() {
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
	}
	
	public void stringToMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text," $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token);
			}
		}
	}


}

