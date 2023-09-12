package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("∏€π∂¿Ã");
		dog.makeSound();
		System.out.println(" ");
				
		Cat ct = new Cat("æﬂøÀ¿Ã");
		ct.makeSound();
		System.out.println(" ");

		Animal[] animal = new Animal[2];
		animal[0] = new Dog("∏€∏€¿Ã");
		animal[1] = new Cat("æﬂøÀ¿Ã");
		
		for(Animal a :animal) {
			a.displayName();
			a.makeSound();
			
		}
		
		
		//1. cat∏∏µÈ±‚
		//cat ct = new cat("∞ÌæÁ¿Ã");
		//2.∞¥√º πËø≠∑Œ animal ¡§¿« √‚∑¬
		//animal[] animal = new animal[2];

	}

}
