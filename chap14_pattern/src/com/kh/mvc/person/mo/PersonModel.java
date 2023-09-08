package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	private int age;
	private char gender;
	
	public PersonModel(String name,int age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public void displayInfo(String name,int age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("성별 : "+ gender);
	}
	
	
}
