package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {
	/*
	 * �𵨰� �並 ����
	 * ����� �Է��� ó���ϴ� ��
	 */
	private UserModel usermodel;
	private UserView userview;
	
	
	public void setView(UserView view) {
		this.userview = userview;
	}
	public void setModel(UserModel model) {
		this.usermodel = usermodel;
	}
	
	public UserModel getModel() {
		return usermodel;
	}
	public UserView getView() {
		return userview;
	}


	public UserController(UserModel model,UserView view) {
		this.usermodel = usermodel;
		this.userview = userview;
		
	}
}
