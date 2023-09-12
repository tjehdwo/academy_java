package com.kh.abstractSample.Animal;

public abstract class Animal {
	
	//�ʵ� s name;
	private String name;

	//������
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name =name;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	
	//�߻�޼��� �����Ҹ���� void makeSound();
	 public abstract void makeSound(); 
		
		
	
	
	//�Ϲݸ޼��� �����̸���� void displayName();
	public void displayName() {
		System.out.println("���� �̸� : " + name);
		
		
	}
}
