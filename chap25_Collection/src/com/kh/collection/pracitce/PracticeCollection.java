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
		//String add 해보고 포문 출력
		pList.add("서동재");
		pList.add("김유민");
		pList.add("김철규");
		pList.add("서동재");
		System.out.println("List : ");
		for (String name : pList) {
			System.out.println(name);
		}
		
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		pSet.add("서동재");
		pSet.add("정우준");
		pSet.add("김철준");
		pSet.add("서동재");
		System.out.println("List : ");
		for (String pName : pSet) {
			System.out.println(pName);
		}
		//String add 해보고 포문 출력 중복된 값 add 해야함
	}
	public void practiceMap() {
	//키와 값을 이용해서 map put 한다음 향상된 포문으로 출력해보기
	Map<String,Integer> myMap = new HashMap<>();
	
	myMap.put("전주", 5);
	myMap.put("서울", 1);
	myMap.put("대전", 3);
	myMap.put("경주", 15);
	myMap.put("서울", 100);
	myMap.put("원주", 34);
	myMap.put("춘천", 37);
	
	for(String city:myMap.keySet()) {
		int code = myMap.get(city);
		System.out.println(city + " : " + code);
	}
	}
}
