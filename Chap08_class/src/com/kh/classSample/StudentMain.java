package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		//public Student(String name, int age, String grade)
		
		Student student1 = new Student("������",28,"1�г�");
		Student student2 = new Student("ȫ�浿",29,"2�г�");
		Student student3 = new Student("�谳��",30,"3�г�");
		Student student4 = new Student("�̾ƹ���",31,"4�г�");
		
		//�л� ���� ���
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		
		/*�л��� 3�� ���� 3�� ����ϱ�
          student2, student3, student4
          ������ �̸��� ���̿� �г��� displayInfo(); �� ����ؼ� ����ϼ���. 
        */

	}

}
