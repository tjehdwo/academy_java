package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// Map <String,Integer>
		Map<String,Integer> UNameAge = new HashMap<>();
		// 이름나이
		UNameAge.put("서동재", 28);
		UNameAge.put("정우준", 28);
		UNameAge.put("김철준", 28);
		UNameAge.put("김유민", 31);
		UNameAge.put("김철규", 30);
		//contains
	
		
		String userName = "김유민";
		if(UNameAge.containsKey(userName)) {
			int age = UNameAge.get(userName);
			System.out.println(userName + "의 나이" + age);
		}else {
			System.out.println(userName + "의 나이를 찾을 수 없습니다.");
		}
	}

}
