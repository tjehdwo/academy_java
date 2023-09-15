package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer>  UserAge = new HashMap<>();
		//유저의 이름과 나이
		UserAge.put("서동재",28);
		UserAge.put("정우준",28);
		UserAge.put("나종원",31);
		UserAge.put("김철규",30);
		//특정 유저 검색
		String userName = "서동재";
		if (UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println("이름이 " + userName + "의 나이 : " + age);
		}else {
			System.out.println("이름이 " + userName + "인 유저를 찾을 수 없습니다.");
		}
		System.out.println();
		//모든 유저 정보 출력
		for (Map.Entry<String,Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		//유저 나이수정
		System.out.println();
		String UserUpdate = "나종원";
		int newAge = 30;
		UserAge.put(UserUpdate, newAge);
	//	System.out.println(UserAge + "의 나이를 " + newAge + "로 수정");
		System.out.println(UserUpdate + "의 나이를 " + newAge + "로 수정");
		System.out.println();
		//유저 탈퇴
		String removeUser = "김철규";
		UserAge.remove(removeUser);
		System.out.println(removeUser + " 유저가 탈퇴했습니다.");
		System.out.println();
		//최종 유저 이름 나이 출력
		System.out.println("최종 유저 목록 : ");
		for (Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		

	}

}
