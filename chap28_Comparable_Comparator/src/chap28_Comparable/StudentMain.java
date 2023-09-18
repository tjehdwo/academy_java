package chap28_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.Student;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		std.add(new Student("������",28));
		std.add(new Student("��ö��",30));
		std.add(new Student("������",31));
		
		Collections.sort(std);
		for(Student student : std) {
			System.out.println(student);
		}
	}

}
