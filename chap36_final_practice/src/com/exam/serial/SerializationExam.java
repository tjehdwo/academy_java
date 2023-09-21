package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationExam {

	public static void main(String[] args) {
		PersonSerial p = new PersonSerial("kh",30);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Person 객체가 직렬화 되어 person.txt파일에 저장됨");
			
			//PersonSerial deSerialPerson = (PersonSerial) out.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//파일에서 객체를 역직렬화하여 읽어옴
		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("person.txt 파일에서 객체를 역직렬화 하였습니다.");
			System.out.println("역직렬화된 객체 정보 : " + deSerialPerson);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
