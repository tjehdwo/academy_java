package com.kh.abstractSample;
//�߻�Ŭ���� ����
abstract class Shape {
	private String color;
	
	//�߻� �޼��� (���� Ŭ�������� �����ؾ� ��)
	abstract double calculateArea();
	
	//������
	public Shape(String c) {
		this.color = c;
	}
	
	//�Ϲ� �޼���
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	public static void main(String[] args) {
		//�Ϲ� �ʵ�
		
	}

}
