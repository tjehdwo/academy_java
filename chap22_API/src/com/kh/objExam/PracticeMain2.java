package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice5();
	}
	public void practice1() {
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ������?");
		System.out.println(sb.toString());
	}
	public void practice2() {
		//���ڿ� ������
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ������");
		sb.reverse();
		System.out.println(sb.toString());
		
	}
	public void practice3() {
		//���ڿ� ���� inser ? ����
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ������");
		sb.insert(10, "? ����");
		System.out.println(sb.toString());
	}
	public void practice4() {
		//���ڿ� ��ü replace
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ������");
		sb.replace(6,10," �ػ깰 �߿� ������? ����");
		System.out.println(sb.toString());
	
	
	}	
	public void practice5() {
	//���ڿ� ����
	String str = "���� ������ ������";
	StringBuffer sb = new StringBuffer(str);
	
	sb.delete(3,6);
	System.out.println(sb.toString());


	}
}