package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//String filePath = "���� ���� ��/�����IO.txt";
	//System.out.println("����");
	// FileWriter fWriter = new FileWriter(filePath,true);
	//true : ���� ���� �̾��
	//false: ���� �����
	
	/*f.createNewFile();
	String fileName = f.getName();
	// FileReader fReader = new FileReader(f,true);*/

/*File f = new File("new.txt");
try {
	if(f.createNewFile()) {
		System.out.println("������ �����߽��ϴ�.");
	}else {
		System.out.println("�̹� �����ϴ� �����Դϴ�.");
	}
}catch(IOException e) {
	e.printStackTrace();
}

}
/*FileReader reader = new FileReader("abcd.txt");
		BufferedReader bufferdReader = new BufferedReader(reader);
		
		String line;
		while ((line = bufferdReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferdReader.close();*/


public class File_IO_Main {
	
	public static void main(String[] args) {
		try {
		FileWriter writer = new FileWriter("2.txt");//����
		writer.write("���� ���� �������� �׽�Ʈ");//���� ����
		writer.close();// ���� �ȿ� ������ �� ���� �ݱ�
		
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	

	}
	
}

