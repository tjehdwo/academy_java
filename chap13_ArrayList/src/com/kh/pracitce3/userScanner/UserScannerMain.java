package com.kh.pracitce3.userScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		
		int[] numbers = new int[5];
		
		//�迭���ٰ� 5���� ������ �Է��ϴ� ����
		for(int i = 0; i<=4; i++) {
			System.out.println("���� index "+(i)+ " : ");
			//System.out.println("���� �ڸ��� "+(i+1)+ " : ");
			numbers[i] = sc.nextInt();
			//ArrayList ��� colors.get(0)
			//�迭�� [] �ȿ� ����
			/*�ٵ� �迭�� �ڸ��� ����? �迭�� �ڸ� ���� �������߰ڴ�
			���?
			�ٱ����ٰ� int numbers �̳༮�� �迭�� ����������!
			������ �����ϱ����� ��ü���� ��ٱ��ϴ� �����������ݾ�
			*/
			
			//�Ǵ� �⺻ for���� ����ϰ� �ʹٸ� length �̿��ؼ� ��� ����
			
		}
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//������ �������� ���ϴ� ���ͽ� ������ ���� for �� ���
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : "+ sum);
	}

}
