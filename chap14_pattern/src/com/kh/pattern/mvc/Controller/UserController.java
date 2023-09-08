package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;

import com.kh.pattern.mvc.View.UserView;

public class UserController {
	/*
	 * 모델과 뷰를 연결
	 * 사용자 입력을 처리하는 곳
	 */
	private UserModel usermodel;
	private UserView userview;
	
	
	public UserController(UserModel usermodel,UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
		
	}
	public void setUserName(String name) {
		//this.userview = userview;
		usermodel.setName(name);
	}
	public void setUserAge(int age) {
		//this.usermodel = usermodel;
		usermodel.setAge(age);
	}
	
	public String getUserName() {
		return usermodel.getName();
	}
	public int getUserAge() {
		return usermodel.getAge();
	}
	
	public void updateView() {
		userview.displayInfo(usermodel.getName(),usermodel.getAge());
	}
	
	

	
}
