package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		//�迭�� Student ��ü�� �߰�
		//[0] �ε��� 0��° �л����� �ε��� [2] �л����� �߰� �����ϱ�
		student[0] = new Student("ȫ�浿",17);
		student[1] = new Student("�踶��",18);
		student[2] = new Student("�����",19);
		
		//�� ���̸� ���ϰ� ������ length
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù��° �л��� �̸� : " + student[0].name);
		System.out.println("ù��° �л��� ���� : " + student[0].age);
		//�ι�° �л��� �̸��� ���� ���
		System.out.println("�ι�° �л��� �̸� : " + student[1].name);
		System.out.println("�ι�° �л��� ���� : " + student[1].age);
		//����° �л��� �̸��� ���� ���
		System.out.println("����° �л��� �̸� : " + student[2].name);
		System.out.println("����° �л��� ���� : " + student[2].age);
		
		
		
		
		//for���� �̿��ؼ� 1��° �л�~3��° �л����� ����ϱ�
		for(int i = 0;i<student.length;i++) {
			System.out.println((i+1)+"��° �л��� �̸� :" + student[i].name);
			System.out.println((i+1)+"��° �л��� ���� : " + student[i].age);
			
		}
			//System.out.println(i�� Ȱ���ؼ� ����ϱ�);
		
	}

}
