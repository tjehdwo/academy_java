package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		//������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\image";//���ϴ� ��� ����
		//���� �����
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		try {
		FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\image\\UserInfo");
		w.write("User ������ ��� ���Դϴ�.");
		w.write("Kh �л�");
		w.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
