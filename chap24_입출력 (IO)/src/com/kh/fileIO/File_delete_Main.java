package com.kh.fileIO;

import java.io.File;

public class File_delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\User\\user1\\Desktop\\";
		String originFile = "C:\\User\\user1\\Desktop\\cute22.png";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �����ϴµ� �����߽��ϴ�.");
		}
	}

}
