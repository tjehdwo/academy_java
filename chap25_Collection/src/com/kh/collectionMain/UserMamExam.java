package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer>  UserAge = new HashMap<>();
		//������ �̸��� ����
		UserAge.put("������",28);
		UserAge.put("������",28);
		UserAge.put("������",31);
		UserAge.put("��ö��",30);
		//Ư�� ���� �˻�
		String userName = "������";
		if (UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println("�̸��� " + userName + "�� ���� : " + age);
		}else {
			System.out.println("�̸��� " + userName + "�� ������ ã�� �� �����ϴ�.");
		}
		System.out.println();
		//��� ���� ���� ���
		for (Map.Entry<String,Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		//���� ���̼���
		System.out.println();
		String UserUpdate = "������";
		int newAge = 30;
		UserAge.put(UserUpdate, newAge);
	//	System.out.println(UserAge + "�� ���̸� " + newAge + "�� ����");
		System.out.println(UserUpdate + "�� ���̸� " + newAge + "�� ����");
		System.out.println();
		//���� Ż��
		String removeUser = "��ö��";
		UserAge.remove(removeUser);
		System.out.println(removeUser + " ������ Ż���߽��ϴ�.");
		System.out.println();
		//���� ���� �̸� ���� ���
		System.out.println("���� ���� ��� : ");
		for (Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		

	}

}
