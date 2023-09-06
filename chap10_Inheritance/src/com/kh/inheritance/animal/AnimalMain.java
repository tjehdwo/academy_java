package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		System.out.println("");
		
		Cat myCat = new Cat("绊具固");
		myCat.info();
		myCat.run();
		myCat.eat();
		System.out.println("");
		
		Lion myLion = new Lion("缴官");
		myLion.info();
		myLion.sound();
		myLion.eat();
		System.out.println("");
		
		Monkey myMonkey = new Monkey("己盔件");
		myMonkey.info();
		myMonkey.swing();
		myMonkey.eat();
		System.out.println("");
		
	}

}
