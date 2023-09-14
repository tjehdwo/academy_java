package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		//pc.practice1();
		pc.practice2();
		
 }
	
	public void practice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile ="C:\\Users\\user1\\Desktop\\RealLove.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void practice2() {

		//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후 
		//바탕화면에다가 폴더를 만들어서
		//폴더 안에 복사한 이미지 저장하기!
		String folderPath = "C:\\Users\\user1\\Desktop\\newFolder";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		String newFolder ="C:\\Users\\user1\\Desktop\\img";
		String inputFile ="C:\\Users\\user1\\Desktop\\cute2.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\newFolder\\cute2.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
					byte[] buffer = new byte[1024];
					int byteRead;
					
					while((byteRead = fis.read(buffer))!= -1) {
						fos.write(buffer,0,byteRead);
					}
					System.out.println("파일이 복사되었습니다!");
				}catch(IOException e) {
					e.printStackTrace();
				}
	
	}

	
}