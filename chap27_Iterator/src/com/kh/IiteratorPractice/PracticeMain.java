package com.kh.IiteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> snack = new ArrayList<>();
		snack.add("����Ĩ");
		snack.add("��īĨ");
		snack.add("����Ĩ");
		snack.add("Ĩ������");
		
		Iterator<String> iter = snack.iterator();
		
		while(iter.hasNext()) {
			String snk = iter.next();
			System.out.println(snk);
		}
		iter = snack.iterator();
		while(iter.hasNext()) {
			String snk = iter.next();
			if(snk.equals("Ĩ������")) {
				iter.remove();
			}
			System.out.println(snk);
		}
		System.out.println("���� �� ���");
		for (String b : snack) {
			System.out.println(b);
		}
	}

}
