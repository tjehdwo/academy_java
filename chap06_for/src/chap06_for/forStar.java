package chap06_for;

import java.util.Scanner;

public class forStar {
	/*
	������ ���� ���� ������ �����ϼ���.
	�簢��
	*****
	*   *
	*   *
	*   *
	*****
	*/

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("�����Է� : ");
	  int num = sc.nextInt();
	  
	  //�簢��
	  for(int i =1;i <=5;i++) {//�� ����
		 for(int j = 1; j<=5; j++) {//�� ����
			 //���� 1�� ��� (���� ����)
			 //���� �࿡�� ����ϴ� ���� ù ��° ���� ��� (j == 1)
			 //���� �࿡�� ���� ������ ���� ��� (j == num)
			 if(i == 1 ||  j == 1|| i == num|| j == num) {
				 System.out.print("*");	 
			 } else {
				 System.out.print(" ");
			 }
			
		 }
		 System.out.println(); //�ٹٲ�
	  }
	  

	}

}
