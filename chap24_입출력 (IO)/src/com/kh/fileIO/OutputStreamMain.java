package com.kh.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMain {
	/*
	FileOutputStream
	���� �����͸� ���Ͽ� ���� ���� ���
	��� �۾��� ó���ϱ� ���� Ŭ����
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "ex.txt";
		try {
			//������ ������ ������� FileOutputStram ����
			FileOutputStream fos = new FileOutputStream(filePath);
			
			//���Ͽ� ���� ������
			String data = "�ȳ��ϼ���.!!!!";
			
			//���ڿ��� ����Ʈ �迭�� ��ȯ�ϰ� ���Ͽ� ����
			byte[] bArray = data.getBytes();//getBytes() �޼��带 ����ؼ� ����Ʈ�� ��ȯ
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
