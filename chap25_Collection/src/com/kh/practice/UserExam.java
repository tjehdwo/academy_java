package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// Map <String,Integer>
		Map<String,Integer> UNameAge = new HashMap<>();
		// �̸�����
		UNameAge.put("������", 28);
		UNameAge.put("������", 28);
		UNameAge.put("��ö��", 28);
		UNameAge.put("������", 31);
		UNameAge.put("��ö��", 30);
		//contains
	
		
		String userName = "������";
		if(UNameAge.containsKey(userName)) {
			int age = UNameAge.get(userName);
			System.out.println(userName + "�� ����" + age);
		}else {
			System.out.println(userName + "�� ���̸� ã�� �� �����ϴ�.");
		}
	}

}
