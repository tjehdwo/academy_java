package com.kh.whileExample;

public class while03 {

	public static void main(String[] args) {
		// �ݺ������� ���
		int i = 1;
		while (i <=10) {//i�� 5���� ���ų� ���� �� true��� 
			//���ڰ� 5�� �� �� ����� ���߰� �;�
			System.out.println(i);
			i = ++i;//; ->���ѷ��� ������ �����
			/*
			 i++ �� �� i�� 1�� ���� ���� �����߱� ������ 
			 ++�� �۵����� ����
			 ���ѷ��� �߻�
			 ++i �� ���� i�� +1�� ���� ����
			 1~10���� ��� ����
			 ���ѷ����� �߻����� ����
			 */
		}

	}

}
