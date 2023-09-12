package com.kh.hw.person;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private int salary;
	private String dept;
	private int grade;
	private String major;
	
	public Person(String name,int age,double height,double weight,int grade,String major) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.grade = grade;
		this.major = major;
		
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	
	}public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight =  weight;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major =  major;
	}
public void information() {
	System.out.println("이름 : " + name);
	System.out.println("나이 : " + age);
	System.out.println("키 : " + height);
	System.out.println("몸무게 : " + weight);
	System.out.println("학년 : " + grade);
	System.out.println("전공 : " + major);
}

}
