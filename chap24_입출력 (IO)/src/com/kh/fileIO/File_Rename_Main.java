package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String originFile = "C:\\User\\user1\\Desktop\\love.png";
		String newFile = "C:\\User\\user1\\Desktop\\cute22.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//���� �̸� �����ϱ�
		//���࿡ ������ �ִٸ�!
		if (currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ����!");
		}else {
			System.out.println("���� �̸� ���� ����.");
		}
	}

}
