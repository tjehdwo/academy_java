package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	public void sound() {
		System.out.println(getName() + " ũ�ƾƾ� ��ȿ �մϴ�.");
	}
	@Override
	public void eat(){
		System.out.println(getName()+ " ��߹� ����� ���� �Դ´�.");
	}
}
