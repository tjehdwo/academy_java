package com.kh.inheritance.calculator;

public class Calculator {
	//����
	//1. ���ϱ�
	int num1,num2;
	public int add() {//�Ķ���� = �Ű����� ���� 2�� �־��ֱ�
		return num1+num2;
	}
	//2. ����
	public int subsruct() {
		return num1 - num2;
	}
	//3. ���ϱ�
	public int multiply() {
		return num1*num2;
	}
	//4. ������
	public int divide() {
		return num1 / num2;
	}

}
