package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	public void swing() {
		System.out.println(getName() + " ������ �ٰ����� ���������� �ֵθ���.");
	}
	@Override
	public void eat() {
		System.out.println(getName()+ " �������� �ö� ���� �Դ´�.");
	}

}
