package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� :");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("add = "+ cal.add());
		System.out.println("mul = "+ cal.multiply());
		System.out.println("mod = " + cal.mod(5,10));
		
		
	
	}
}
		/*Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		int num1 = sc.nextInt();
	
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result1 = cal.add();
		int result2 = cal.subsruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();

		System.out.println("Add : "+ result1);
		System.out.println("sub : "+ result2);
		System.out.println("mul : "+ result3);
		System.out.println("div : "+ result4);
		}
		
		
}

/* scanner �̿��ؼ� �ڵ� �����ϱ�*/
/*
     	int result1 = cal.add(10,5);
		int result2 = cal.subsruct(10,5);
		int result3 = cal.multiply(10,5);
		int result4 = cal.divide(10,5);
		System.out.println("Add : "+ result1);
		System.out.println("sub : "+ result2);
		System.out.println("mul : "+ result3);
		System.out.println("div : "+ result4);

	}
*	int result1 = cal.add();
		int result2 = cal.multiply();
		int result3 = cal.mod(5,10);
		System.out.println("add : "+ result1);
		System.out.println("mul : "+ result2);
		System.out.println("mod : "+ result3);
*
*/

