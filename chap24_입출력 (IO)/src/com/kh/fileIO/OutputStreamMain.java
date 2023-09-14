package com.kh.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMain {
	/*
	FileOutputStream
	이진 데이터를 파일에 쓰기 위해 사용
	출력 작업을 처리하기 위한 클래스
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "ex.txt";
		try {
			//지정된 파일을 대상으로 FileOutputStram 생성
			FileOutputStream fos = new FileOutputStream(filePath);
			
			//파일에 쓰일 데이터
			String data = "안녕하세요.!!!!";
			
			//문자열을 바이트 배열로 변환하고 파일에 쓰자
			byte[] bArray = data.getBytes();//getBytes() 메서드를 사용해서 바이트로 변환
			try {
				fos.write(bArray);
				
				fos.close();
			}catch(IOException e) {
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
