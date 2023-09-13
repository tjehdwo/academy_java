package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain rm = new ReplaceMain();
		rm.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, World!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println(input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World를 Java로 교체
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}

	public void replace3() {
		String originName = "Hello, world";
		//o로 적혀있는 문자열들 x로 변경하기
		String reOriginName = originName.replace("o", "x");
		System.out.println(reOriginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// fox - >cat
		String reOriginString = originString.replace("fox","cat");
		System.out.println(reOriginString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// 모든 공백 제거하기
		String reOriginString = originString.replace(" ", "");
		System.out.println(reOriginString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace 대신 replaceAll 을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)World","java" );
		System.out.println(reAllstr);
	}
}
