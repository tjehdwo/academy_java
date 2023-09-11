package com.kh.instance.cafe;

public class Cafe {
	private String type;
	private int size;
	private boolean isSugar;
	
	public  Cafe(String type,int size,boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
		
	}
	public void makeCoffee() {
		System.out.println("커피를 만듭니다.");
		System.out.println("커피 종류 : " + type);
		System.out.println("커피 크기 : " + size);
		if(isSugar) {
			System.out.println("설탕 추가");
		}else {
			System.out.println("설탕 X ");
		}
	}
}
