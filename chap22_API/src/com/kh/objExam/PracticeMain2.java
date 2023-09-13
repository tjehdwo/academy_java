package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice5();
	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³áÀº ¹¹¸ÔÁö?");
		System.out.println(sb.toString());
	}
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³áÀº ¹¹¸ÔÁö");
		sb.reverse();
		System.out.println(sb.toString());
		
	}
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ inser ? ¤¾¤¾
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³áÀº ¹¹¸ÔÁö");
		sb.insert(10, "? ¤¾¤¾");
		System.out.println(sb.toString());
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³áÀº ¹¹¸ÔÁö");
		sb.replace(6,10," ÇØ»ê¹° Áß¿¡ ¹¹¸ÔÁö? ¤¾¤¾");
		System.out.println(sb.toString());
	
	
	}	
	public void practice5() {
	//¹®ÀÚ¿­ »èÁ¦
	String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
	StringBuffer sb = new StringBuffer(str);
	
	sb.delete(3,6);
	System.out.println(sb.toString());


	}
}