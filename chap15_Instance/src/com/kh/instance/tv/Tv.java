package com.kh.instance.tv;

public class Tv {
	//Tv ����
	//Tv �Ӽ�(�ʵ�)
	String color;  //����
	boolean power; //��������
	int channel;   //ä��
	//Tv ���(�޼���)
	public void power() {
		power = !power; //��������
	}
	
	public void channelUp() {
		++channel;
		
	}
	
	public void channelDown() {
		--channel;
	}
	
	
}
