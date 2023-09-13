package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	/*
	 * Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
	 * java1.1 ���� ������� ����
	 * 	jave.time �б��� LocalDate LocalTime LocalDateTime
	 * */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDtime = LocalDateTime.now();
		System.out.println("���� ��¥ �ð� : " + currentDtime);
	
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		System.out.println(" ");
		
		//minus plus �̿��ؼ� �� 2���� ������ ��4��
		LocalTime nextHour = LocalTime.now();
		LocalTime futureHour = nextHour.plusHours(3);
		System.out.println("3�ð� �� �ð� : " + futureHour);
		LocalTime beforeHour = LocalTime.now();
		LocalTime pastHour = beforeHour.minusHours(2);
		System.out.println("3�ð� �� �ð� : " + pastHour);
		System.out.println(" ");
		
		LocalDateTime nextDtime = LocalDateTime.now();
		LocalDateTime futureDtime = nextDtime.plusDays(5);
		System.out.println("5�� ��  ��¥ �ð� : " + futureDtime);
		LocalDateTime beforeDtime = LocalDateTime.now();
		LocalDateTime pastDtime = beforeDtime.minusDays(3);
		System.out.println("3�� ��  ��¥ �ð� : " + pastDtime);
		System.out.println(" ");
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date1 +" �� " + date2 + " ���� ���� ��¥�Դϴ�.");
			
		}else if(date1.isAfter(date2)) {
			System.out.println(date1 +" �� " + date2 + " ���� ���� ��¥�Դϴ�.");
			
		}else {
			System.out.println(date1 +" �� " + date2 + " �� ���� ��¥�Դϴ�.");
			
		}
	}

}
