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
		w.write("경로설정 후 파일3 ");//파일 쓰기
		w.close();//파일 닫기
		
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
		//폴더를 만들고 폴더 안에 파일을 만들기
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder";
		File f = new File(folderPath);
		
		if(!f.exists()) {
			f.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 있습니다.");
		}
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder\\newText.txt");
			//파일 안에 내용 작성하기
			w.write("깃폴더 처럼 만든 파일입니다.");
			w.write("깃깃깃");
			w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
