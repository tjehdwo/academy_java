package com.kh.inheritance.animal;

public class Animal { //���� Ŭ���� ����
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void info() {
		System.out.println("�̸� "+name);
	}
	public void eat() {
		System.out.println(name + " ���̸� �Խ��ϴ�.");
	}
	public void sleep() {
		System.out.println(name + " �� ���� ��ϴ�.");
	}
	
}

