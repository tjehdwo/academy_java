package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("�۹���");
		dog.makeSound();
		System.out.println(" ");
				
		Cat ct = new Cat("�߿���");
		ct.makeSound();
		System.out.println(" ");

		Animal[] animal = new Animal[2];
		animal[0] = new Dog("�۸���");
		animal[1] = new Cat("�߿���");
		
		for(Animal a :animal) {
			a.displayName();
			a.makeSound();
			
		}
		
		
		//1. cat�����
		//cat ct = new cat("�����");
		//2.��ü �迭�� animal ���� ���
		//animal[] animal = new animal[2];

	}

}
