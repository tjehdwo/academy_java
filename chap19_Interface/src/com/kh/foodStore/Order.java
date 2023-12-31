package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//주문 객체
public class Order implements FoodStore{
	private List<Menu> odermenus;
	
	public Order() {
		odermenus = new ArrayList<>();//주문한 내용들
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		odermenus.add(menuA);
		
	}
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	@Override
	public void printMenu() {
		System.out.println("========주문내역========");
		for (Menu menuA : odermenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}
