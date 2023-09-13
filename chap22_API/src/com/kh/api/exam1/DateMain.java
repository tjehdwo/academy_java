package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	/*
	 * Date : 날짜와 시간 정보를 나타내는데 사용
	 * java1.1 이후 권장되지 않음
	 * 	jave.time 패기지 LocalDate LocalTime LocalDateTime
	 * */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime currentDtime = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : " + currentDtime);
	
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		System.out.println(" ");
		
		//minus plus 이용해서 각 2개씩 만들어보기 총4개
		LocalTime nextHour = LocalTime.now();
		LocalTime futureHour = nextHour.plusHours(3);
		System.out.println("3시간 후 시간 : " + futureHour);
		LocalTime beforeHour = LocalTime.now();
		LocalTime pastHour = beforeHour.minusHours(2);
		System.out.println("3시간 후 시간 : " + pastHour);
		System.out.println(" ");
		
		LocalDateTime nextDtime = LocalDateTime.now();
		LocalDateTime futureDtime = nextDtime.plusDays(5);
		System.out.println("5일 후  날짜 시간 : " + futureDtime);
		LocalDateTime beforeDtime = LocalDateTime.now();
		LocalDateTime pastDtime = beforeDtime.minusDays(3);
		System.out.println("3일 전  날짜 시간 : " + pastDtime);
		System.out.println(" ");
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date1 +" 은 " + date2 + " 보다 이전 날짜입니다.");
			
		}else if(date1.isAfter(date2)) {
			System.out.println(date1 +" 은 " + date2 + " 보다 이후 날짜입니다.");
			
		}else {
			System.out.println(date1 +" 은 " + date2 + " 와 같은 날짜입니다.");
			
		}
	}

}
