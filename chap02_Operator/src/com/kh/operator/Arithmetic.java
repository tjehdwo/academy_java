package com.kh.operator;
   
public class Arithmetic {

	public static void main(String[] args) {
		// 1. ������ �̸��� ������, ����, ������ھ�(_), 
				//    �޷�($)�� ������ �� �ִ�.
				int abc1 = 1;
				int abc_ = 2;
				// int abc- = 3; //������ھ�� �޷��� ����� �� �ִ�.

				//2. ������ �̸��� ���ڷ� ������ �� ����.
				//int 1_abc = 2;
				
				//3. ���� �̸� ���̿��� ������ ������ �� ����.
				//int a b c = 1; 
				//����� ��Ģ���� ����� ���� ���� 
				//������ �� ����ϱ� ������ ������� �ʴ´�.
				
				//4. �ڹٿ��� �̸� ������ ���� �����̸����� ������� ���Ѵ�.
				//int int  =1;
				
				
				//�Ǽ��� (�Ҽ����� �ִ� ���� : float, double)
				float pie1 = 3.141332213123213f; //float�� f�� �빮��F�� �ۼ����ش�.
				float pie3 = 3.141332213123213F; //3.14133
				
				double pie2 = 3.141332213123213; //3.141332213123213 ���� ���
				//System.out.print("float : ");
				//System.out.println(pie1);
				//System.out.print("double : ");
				//System.out.println(pie2);
			
			//2. ������
			// byte : �̴� -128 ~ 127 ���� ��밡��
			//byte bt = -129; //int�� �����ϰų� ���� byte + byte �� �־���� �Ѵ�.
			byte bt = 127; //-129�� 128 �̻���� ����� ���� �ʴ� �� Ȯ��
			//System.out.println(bt);
			
			//short = -32,768 ~ 32,767 ���� ��밡��
			//short shrt = -32769; //-32789�� 32768 ���� ��µ��� ����
			short shrt = -32767;
			//System.out.println(shrt);
			
			// int -2,147,483,648 ~ 2,147,483,647 ���� ��� ����
			int nt = -2147483648;
			//System.out.println(nt);
			
			//long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
			long lng = 2000L; //�ڿ� L, l�� �ٿ��ش�.
			long lng2 = 2000l;
			
			//3. ������
			// char : ������ ���ڸ� �ѹ��ڸ� ������ �� ����
			// 		  '';
			//char chr1 = 'a';
			//System.out.print(chr1);
			
			//String�� �⺻���� 
			//�ڷ����� ������ ������ �⺻������ ����
			//�⺻���� �ڷ����� ���� �ʱ� ������ String���� ǥ����
			// String ""�� ''�ȿ� ���ڸ� �ۼ��� ��
			//String name = "�ȳ��ϼ���.";
			
			//4. ����
			//boolean �� true�� false �� ǥ���Ѵ�. 
			//����� boolean bln = true; false;
			boolean bln = true;
			//System.out.println(bln);
			boolean bln2 = false;
			//System.out.println(bln2);
			
			System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
			String name = "ȫ�浿";
			System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
			//�� �� Ÿ���� ������ ������ �缱���� ���� �ʰ� �״�� ����ص� �ȴ�.
			//�� �� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �� �� ����.
			//������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����.
			name = "��ö��";
			System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
			
			int age = 22;
			String baseball = "�߱�";
			System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
			System.out.println("���� ���̴� " + age + "�� �̰�, ");
			System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
			
			char score = 'a';
			System.out.println("���� ������ " + score + "�Դϴ�.");
			 

	}

}
