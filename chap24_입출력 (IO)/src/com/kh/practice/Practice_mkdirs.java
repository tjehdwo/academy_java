package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {
	//폴더 연속으로 2개 만들기 C:\\User\\user1\\Desktop\\이름1\\이름2
	//폴더 연속으로 3개 만들기 C:\\User\\user1\\eclipse-workspace\\chap25_
	//폴더 연속으로 5개 만들기 C:\\User\\user1\\Desktop\\myPlace\\Music\\korean\\kPop\\Group

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice3();
	}
	public void Practice1() {     
		String dirPath = "C:\\Users\\user1\\Desktop\\Animal\\Dog";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		
		}

	public void Practice2() {
		String dirPath = "C:\\User\\user1\\eclipse-workspace\\chap25_folder\\fold\\feld";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
	}

	public void Practice3() {
		String dirPath = "C:\\User\\user1\\Desktop\\myPlace\\Music\\korean\\kPop\\Group";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}

}
