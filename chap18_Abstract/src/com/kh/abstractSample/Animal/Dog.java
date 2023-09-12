package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	//积己磊 super
	private String name;
	public Dog(String name) {
		super(name);
		this.name = name;
		
		
	}
	@Override
	public void makeSound() {
		System.out.println("港港");	
	}
}
