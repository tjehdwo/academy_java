package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// product ���� 3�� �ϰ�, ���� ��ǰ�� ���� �귣��� ���
		Product product1 = new Product("�Ŷ��",1100,"���");
        System.out.println("Product ����:");
		product1.information();
		Product product2 = new Product("�����",1200,"���ѱ�");
		System.out.println("Product ����:");
		product2.information();
		Product product3 = new Product("�����",1150,"���");
		System.out.println("Product ����:");
		product3.information();
	
	
	}

}
