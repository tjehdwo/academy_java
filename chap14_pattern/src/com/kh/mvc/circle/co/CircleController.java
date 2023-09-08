package com.kh.mvc.circle.co;

import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleController {
	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model,CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		double userInput = view.getUserInput();
		model.setRadius(userInput);
		double result = model.AreaCircle();
		System.out.println("°á°ú : " + result);
	}

}
