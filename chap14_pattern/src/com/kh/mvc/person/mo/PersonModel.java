package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	private int age;
	private char gender;
	private int number;
	
	public PersonModel(String name,int age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
	}
	public void isValidNumber() {
		if (this.number == 0) {
			System.out.println("숫자가 안들어왔습니다.");
		}
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}

	
	
}
