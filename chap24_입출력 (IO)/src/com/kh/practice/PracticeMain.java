package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice2();
	}
	
	public void practice1() {
		try {
		FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\practice1.txt");
		w.write("��μ��� �� ����3 ");//���� ����
		w.close();//���� �ݱ�
		
		FileReader r = new FileReader("C:\\Users\\user1\\Desktop\\practice1.txt");
		BufferedReader br = new BufferedReader(r);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder";
		File f = new File(folderPath);
		
		if(!f.exists()) {
			f.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �ֽ��ϴ�.");
		}
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder\\newText.txt");
			//���� �ȿ� ���� �ۼ��ϱ�
			w.write("������ ó�� ���� �����Դϴ�.");
			w.write("����");
			w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
