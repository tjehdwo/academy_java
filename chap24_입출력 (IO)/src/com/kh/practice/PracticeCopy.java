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
			System.out.println("������ ����Ǿ����ϴ�.");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void practice2() {

		//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� 
		//����ȭ�鿡�ٰ� ������ ����
		//���� �ȿ� ������ �̹��� �����ϱ�!
		String folderPath = "C:\\Users\\user1\\Desktop\\newFolder";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
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
					System.out.println("������ ����Ǿ����ϴ�!");
				}catch(IOException e) {
					e.printStackTrace();
				}
	
	}

	
}