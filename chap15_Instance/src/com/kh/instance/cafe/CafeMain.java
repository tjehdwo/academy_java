package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("īǪġ��",1,true);
		client1.makeCoffee();
		System.out.println("");
		Cafe client2 = new Cafe("���",3,false);
		client2.makeCoffee();
		System.out.println("");
		Cafe client3 = new Cafe("�ٴҶ��",2,false);
		client3.makeCoffee();

	}

}
