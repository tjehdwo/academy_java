package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors"+ colors);
		
		colors.add("빨강");
		colors.add("주황");
		colors.add("노랑");
		colors.add("초록");
		colors.add("파랑");
		colors.add("남색");
		colors.add("보라");
		
		System.out.println("전체색상 : "+colors);
		
		colors.set(1,"블랙");
		colors.set(3,"브라운");
		colors.set(4,"그린");
		
		System.out.println("수정 : "+colors);
		
		colors.add(2,"옐로우");
		System.out.println("옐로우 추가 : "+colors);
		colors.add(6,"연한파랑");
		System.out.println("연한파랑 추가 : "+colors);
		
		for(String AAA:colors) {
			System.out.println(AAA);
		}
		colors.add("파랑");
		System.out.println("파랑 다시 추가 : "+colors);
		System.out.println("최후 출력 : " + colors.get(0)+" "+colors.get(8)+" "+colors.get(9));
		
	}

}
