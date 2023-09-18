package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String>{
	@Override
	public int compare (String num1, String num2) {
		if(num1.length() == num2.length()) {
			return 0;
		}
		else if (num1.length() > num2.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		//list ArrayList ���� comparator ����
		List<String> str = new ArrayList<>();
		str.add("������");
		str.add("��ö��");
		str.add("��ö��");
		str.add("������");
		str.add("������");
		
		Collections.sort(str, new User());
		
		for(String s : str) {
			System.out.println(s);
		}
	}

}
