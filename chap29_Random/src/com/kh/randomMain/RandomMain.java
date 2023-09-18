package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용되는 클래스
 	난수 : 무작위로 만들어진 수
 **/
public class RandomMain {

	public static void main(String[] args) {
		//로또 번호 생성기
		RandomMain rm = new RandomMain();
		rm.Lotto();
		
		
	}
	
	public void Lotto() {
		Random rd = new Random();
		//ArrayList 사용해서 장바구니 담기
		List<Integer> lottoNum = new ArrayList<>();
		//중복 피하기 위해 set을 사용할 수 있음
		//6숫자만 들어갈 것
		int six = 6; //로또 번호 몇개 뽑을 것 인지 설정
		while(lottoNum.size() < six) {
			int ranNumber = rd.nextInt(45)+1; //0~44 자리의 랜덤으로 번호 하나
			
			//존재하는지 여부 중복x
			if(!lottoNum.contains(ranNumber)) {
				//!가 사라지면 값이 존재할 떄만 list에 저장되는 것이기 때문에 무한루프
				lottoNum.add(ranNumber);
			}
			
		
		}
		System.out.println("로또 번호 : " + lottoNum);
		// 1~ 45 범위를 지정해서 난수 생성
		
	}
	public void RandomExam() {
		Random rd = new Random();// 랜덤 객체 생성
		
		//1.정수 범위 내에서 랜덤한 난수를 만들어야 겠다.
		int ranInt = rd.nextInt(100); // 0~99 사이에서 1개
		System.out.println(ranInt);
		
		//2. 실수 범위에서 랜덤한 난수를 만들어야겠다
		double radD = rd.nextDouble();
		System.out.println(ranInt + radD);
		
		//3. 불리언 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}
