package com.kh.objExam;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	public static void main(String[] args) {
		Practice4 p4 = new Practice4();
		p4.pracitce5();
	}
	
	public void pracitce1() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(d1);
		System.out.println("포멧팅 된 년,월,일 : " + forDate);
	
	}	
	
	public void pracitce2() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(d1);
		System.out.println("포멧팅 된 시,분,초 : " + forDate);
	}
	
	public void pracitce3() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(d1);
		System.out.println("포멧팅 된 월,일 : " + forDate);
			
		}
	
	public void pracitce4() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(d1);
		System.out.println("포멧팅 된 연도,시간 : " + forDate);
			
			
	}
	
	public void pracitce5() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		String forDate = sdf.format(d1);
		System.out.println("포멧팅 된 연도,월,일,요일 : " + forDate);
		
	}
	
}
