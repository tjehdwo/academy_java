package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		order.addMenu("Â«»Í ÁÖ¹®");
		order.addMenu("Â¥Àå¸é ÁÖ¹®");
		order.addMenu("±¼Â«»Í ÁÖ¹®");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("¹ä ÁÖ¹®");
		order1.addMenu("±¼ºñ ÁÖ¹®");
		order1.addMenu("»ı¼º ÁÖ¹®");
		order1.printMenu();
	}

}
