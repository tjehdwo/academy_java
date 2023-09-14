package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//String filePath = "설명 적는 란/입출력IO.txt";
	//System.out.println("생성");
	// FileWriter fWriter = new FileWriter(filePath,true);
	//true : 파일 끝에 이어쓰기
	//false: 파일 덮어쓰기
	
	/*f.createNewFile();
	String fileName = f.getName();
	// FileReader fReader = new FileReader(f,true);*/

/*File f = new File("new.txt");
try {
	if(f.createNewFile()) {
		System.out.println("파일을 생성했습니다.");
	}else {
		System.out.println("이미 존재하는 파일입니다.");
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
		FileWriter writer = new FileWriter("2.txt");//생성
		writer.write("파일 덮어 써지는지 테스트");//파일 쓰기
		writer.close();// 파일 안에 내용을 다 쓰면 닫기
		
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	

	}
	
}

