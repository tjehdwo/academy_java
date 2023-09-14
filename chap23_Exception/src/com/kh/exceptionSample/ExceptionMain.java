package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();	
		//exmain.ExceptionF();
		exmain.ExceptionExam();
		
		
	}
	public void ExceptionA() {
		try {
			int result = 10 /0;//0���� ������ �õ�
			System.out.println("result : " + result);
			
		} catch(ArithmeticException e) {
			/*
			 ArithmeticException �������� ��� �������� �߻��ϴ� ���� 
			 ArithmeticException e : e�� �츮�� ������ ������
			 e�� ������ ������ �޼����� getMessage() �� ���޹޴´�.
			 */
			System.out.println("��� �������� ���� �߻��� ����!!" + e.getMessage());
		}
		
	}

	public void ExceptionN() {
	 try {
		String text = null;
		int length = text.length();
		//������ ���µ� text�� ���� ���ڿ��� ���̸� ���
		System.out.println("���ڿ� ���� : " + length);
	 } catch (NullPointerException abc) {
		 System.out.println("�� ����!!! " + abc.getMessage());
		 
	 }
	 
	 
	 }
		
	public void ExceptionF() {
		try {
			//050904
			String juminNumber = "�ȿ���904";
			int number = Integer.parseInt(juminNumber);//���ڿ��� ������ ��ȯ �õ�
			System.out.println("���� : " + number);//�ȿ� String�� ����ֱ� ������ ������ ���� ����
		} catch (NumberFormatException b) {
			System.out.println("���ڸ� �־��ּ��� ");
			System.out.println("NumberFormatEception �߻� " + b.getMessage());
		}
		
		
	}

	public void ExceptionExam() {
	  try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;//��ȿ���� ���� �ε��� �ѹ�
		int result = numbers[index];
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!");
	  }catch(Exception e) {
		  System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
	  }finally {
		  System.out.println("Finally ����!");
	  }
	  System.out.println("���α׷��� ����Ǿ����ϴ�.");
	  }

}
