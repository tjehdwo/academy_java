package com.kh.example.pracitce2.model.vo;

public class Product {
   String pName;
   int price;
   String brand;
   public Product(String pName,int price, String brand) {
	   //2.������ this�� Ȱ���ؼ� ��������
	   this.pName = pName;
	   this.price = price;
	   this.brand = brand;
   }
   //3. ���� ��� �޼ҵ� �����
   //+information():void   sysout +ctrl space ->�ڵ��ϼ�
   public void information(){
	   System.out.println("��ǰ�� :" + pName);
	   System.out.println("���� : "+ price+"��");
	   System.out.println("�귣�� : "+ brand);
	   
   }
}
