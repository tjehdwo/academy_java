package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü2 ����ϴ� ���� ����
public class Order2 implements FoodStore{
private List<Menu> ordermenus;
	
	public Order2() {
		ordermenus = new ArrayList<>();//�ֹ��� �����
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		ordermenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	@Override
	public void printMenu() {
		
		//menuA.getItem();
	 System.out.println("dddd");
		for (Menu menuA: ordermenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}