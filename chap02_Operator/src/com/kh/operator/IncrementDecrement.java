package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// 3. ����������(Increment & Decrement)
		/* 
		 ���������ڴ� ������ ���� 1�� ������Ű�ų� ���ҽ�ų �� ���
		 ���� ���� ������(++x, --x) ���� ���� ������(x++, x--)
		  1-1)���� ���� ������
		   ++ ���� ���� 1�� ���Ѵ�.
		   val = ++num;//num�� ���� 1������ �� val ������ ����
		   val = --num;//num�� ���� 1������ �� val ������ ����
		 * */
		//++ ��ü�� +1�� ���شٶ�� ������ �������
		/*
		int val, val2;
		int num1 = 10;
		val = ++num1; //num�� ���� 1 ������ �� val ������ ������ �ϱ� ������ 11�� ���Ե�
		System.out.println("val : " + val);
		
		val2 = --num1; //num�� ���� 1 ������ ��  val ������ ����
		System.out.println("val2 : " + val2);
		*/
		//1-2 ���� ���� ������ : ++ ���� ���� 1�� ���Ѵ�.
		int val3, val4;
		int num2 = 10;
		System.out.println("num2�� �� : " + num2);
		
		val3 = num2++;//val3 ������ ���� num3 ���� ������ �� num3 �� 1 ����
		System.out.println("val3 : " + val3);
		System.out.println("num2�� �� : " + num2);
		
		
		
	}

}