package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	public void swing() {
		System.out.println(getName() + " 주인이 다가오니 나뭇가지를 휘두른다.");
	}
	@Override
	public void eat() {
		System.out.println(getName()+ " 나무위로 올라가 밥을 먹는다.");
	}

}
