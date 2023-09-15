package com.kh.collection.pracitce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		//pc.practiceList();
		//pc.practiceSet();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� ���� ���
		pList.add("������");
		pList.add("������");
		pList.add("��ö��");
		pList.add("������");
		System.out.println("List : ");
		for (String name : pList) {
			System.out.println(name);
		}
		
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		pSet.add("������");
		pSet.add("������");
		pSet.add("��ö��");
		pSet.add("������");
		System.out.println("List : ");
		for (String pName : pSet) {
			System.out.println(pName);
		}
		//String add �غ��� ���� ��� �ߺ��� �� add �ؾ���
	}
	public void practiceMap() {
	//Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����غ���
	Map<String,Integer> myMap = new HashMap<>();
	
	myMap.put("����", 5);
	myMap.put("����", 1);
	myMap.put("����", 3);
	myMap.put("����", 15);
	myMap.put("����", 100);
	myMap.put("����", 34);
	myMap.put("��õ", 37);
	
	for(String city:myMap.keySet()) {
		int code = myMap.get(city);
		System.out.println(city + " : " + code);
	}
	}
}
