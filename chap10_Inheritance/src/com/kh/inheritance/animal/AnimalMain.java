package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		System.out.println("");
		
		Cat myCat = new Cat("��߹�");
		myCat.info();
		myCat.run();
		myCat.eat();
		System.out.println("");
		
		Lion myLion = new Lion("�ɹ�");
		myLion.info();
		myLion.sound();
		myLion.eat();
		System.out.println("");
		
		Monkey myMonkey = new Monkey("������");
		myMonkey.info();
		myMonkey.swing();
		myMonkey.eat();
		System.out.println("");
		
	}

}
