package com.kh.example.practice2.model.vo;

public class Product {
   String pName;
   int price;
   String brand;
   public Product(String pName,int price, String brand) {
	   //2.생성자 this를 활용해서 만들어야함
	   this.pName = pName;
	   this.price = price;
	   this.brand = brand;
   }
   //3. 정보 출력 메소드 만들기
   //+information():void   sysout +ctrl space ->자동완성
   public void information(){
	   System.out.println("상품명 :" + pName);
	   System.out.println("가격 : "+ price+"원");
	   System.out.println("브랜드 : "+ brand);
	   
   }
}
