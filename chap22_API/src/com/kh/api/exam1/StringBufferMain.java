package com.kh.api.exam1;
/*
 * StringBuffer	
 * 		���ڿ��� ȿ�������� �ٷ�� ���� Ŭ����
 * 		�ٲ�ų� �ٲ� �� �ִ� ���ڿ��� ���³���,
 * 		���ڿ��� �����̳� ������ �ʿ��� ��� ���
 */
public class StringBufferMain {

	public static void main(String[] args) {
		//�� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		//���ڿ� �߰�
		sb.append("Hello,");
		sb.append("Java");
		sb.append("StringBuffer!");
		//���ڿ� ���
		System.out.println(sb.toString());
		
		//���ڿ� ����
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
		//���ڿ� ��ü
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		//���ڿ� ����
		sb.delete(13,20);
		System.out.println(sb.toString());
		
		//���ڿ� ������
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}
