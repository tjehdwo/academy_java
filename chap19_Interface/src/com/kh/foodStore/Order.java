package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü
public class Order implements FoodStore{
	private List<Menu> odermenus;
	
	public Order() {
		odermenus = new ArrayList<>();//�ֹ��� �����
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
		System.out.println("========�ֹ�����========");
		for (Menu menuA : odermenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}
