package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {
	//���� �������� 2�� ����� C:\\User\\user1\\Desktop\\�̸�1\\�̸�2
	//���� �������� 3�� ����� C:\\User\\user1\\eclipse-workspace\\chap25_
	//���� �������� 5�� ����� C:\\User\\user1\\Desktop\\myPlace\\Music\\korean\\kPop\\Group

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice3();
	}
	public void Practice1() {     
		String dirPath = "C:\\Users\\user1\\Desktop\\Animal\\Dog";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
		
		
		}

	public void Practice2() {
		String dirPath = "C:\\User\\user1\\eclipse-workspace\\chap25_folder\\fold\\feld";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
		
	}

	public void Practice3() {
		String dirPath = "C:\\User\\user1\\Desktop\\myPlace\\Music\\korean\\kPop\\Group";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	}

}
