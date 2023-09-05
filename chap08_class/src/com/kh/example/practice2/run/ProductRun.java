package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// product 생성 3개 하고, 각각 상품명 가격 브랜드명 출력
		Product product1 = new Product("신라면",1100,"농심");
        System.out.println("Product 정보:");
		product1.information();
		Product product2 = new Product("진라면",1200,"오뚜기");
		System.out.println("Product 정보:");
		product2.information();
		Product product3 = new Product("삼양라면",1150,"삼양");
		System.out.println("Product 정보:");
		product3.information();
	
	
	}

}
