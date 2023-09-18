package com.kh.IiteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> snack = new ArrayList<>();
		snack.add("스윙칩");
		snack.add("포카칩");
		snack.add("꼬북칩");
		snack.add("칩포테토");
		
		Iterator<String> iter = snack.iterator();
		
		while(iter.hasNext()) {
			String snk = iter.next();
			System.out.println(snk);
		}
		iter = snack.iterator();
		while(iter.hasNext()) {
			String snk = iter.next();
			if(snk.equals("칩포테토")) {
				iter.remove();
			}
			System.out.println(snk);
		}
		System.out.println("삭제 후 출력");
		for (String b : snack) {
			System.out.println(b);
		}
	}

}
