package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 **/
public class RandomMain {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
		
		
	}
	
	public void Lotto() {
		Random rd = new Random();
		//ArrayList ����ؼ� ��ٱ��� ���
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ� ���ϱ� ���� set�� ����� �� ����
		//6���ڸ� �� ��
		int six = 6; //�ζ� ��ȣ � ���� �� ���� ����
		while(lottoNum.size() < six) {
			int ranNumber = rd.nextInt(45)+1; //0~44 �ڸ��� �������� ��ȣ �ϳ�
			
			//�����ϴ��� ���� �ߺ�x
			if(!lottoNum.contains(ranNumber)) {
				//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
			
		
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
		// 1~ 45 ������ �����ؼ� ���� ����
		
	}
	public void RandomExam() {
		Random rd = new Random();// ���� ��ü ����
		
		//1.���� ���� ������ ������ ������ ������ �ڴ�.
		int ranInt = rd.nextInt(100); // 0~99 ���̿��� 1��
		System.out.println(ranInt);
		
		//2. �Ǽ� �������� ������ ������ �����߰ڴ�
		double radD = rd.nextDouble();
		System.out.println(ranInt + radD);
		
		//3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}
