package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;


public class PersonController {
	private PersonModel personmodel;
	private PersonView personview;
	
	public PersonController(PersonModel personmodel,PersonView personview) {
		this.personmodel = personmodel;
		this.personview = personview;
	}
	
	public void setPersonName(String name) {
		personmodel.setName(name);
	}
	public void setPersonAge(int age) {
		personmodel.setAge(age);
	}
	public void setPersonGender(char gender) {
		personmodel.setGender(gender);
	}
	
	public String getPersonName() {
		return personmodel.getName();
	}
	public int getPersonAge() {
		return personmodel.getAge();
	}
	public char getPersonGender() {
		return personmodel.getGender();
	}
	
	public void updateView() {
		personview.displayInfo(personmodel.getName(),personmodel.getAge(),personmodel.getGender());
	}
}
