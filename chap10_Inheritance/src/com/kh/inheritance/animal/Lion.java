package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	public void sound() {
		System.out.println(getName() + " 크아아앙 포효 합니다.");
	}
	@Override
	public void eat(){
		System.out.println(getName()+ " 고야미 밥까지 뺏어 먹는다.");
	}
}
