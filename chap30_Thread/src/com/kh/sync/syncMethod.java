package com.kh.sync;
/*
  synchronized
  다중 스레드 환경에서 동시 접근으로부터 데이터의 일관성을 보호하기 위해 사용되는 키워드
  하나의 스레드가 특정 블록 또는 메서드를 실행하는 동안
  다른 스레드가 동일한 블록 또는 메서드에 동시에 접근하지 못하도록 함
  스레드 간 경쟁 조건과 데이터 불일치 문제를 방지하는데 도움
	
  메서드 동기화 : 메서드 전체를 동기화 하는 경우 해당 메서드의 실행 중에는
  			   다른 스레드가 해당 메서드에 접근할 수 없음
  	ex) public synchronized void syncMethod(){
  					//동기화된 메서드 내용
	}
  블록 동기화 : 특정 블록을 동기화하는 경우 블록 내부의 코드만 가능
   ex) public void someMethod(){
   			//비동기코드
   			  
   			  synchronized(){
   			  //동기화된 블록 내용
   			  
   			  }
 */
public class syncMethod {
	private int count = 0;
	private Object lockObj = new Object();//동기화를 위한 객체
	
	public synchronized void increment() {
		count++;
	}
	
	public void pTask() {
		// 다른 비동기 코드
		synchronized(lockObj) {
			//lockObj 를 사용한 동기화된 블록
			count++;
		}
		//다른 비동기 코드
		
	}
	public static void main(String[] args) {
		syncMethod sync = new syncMethod();
		
		// Runnable 인터페이스 구현을 사용해서 스레드 생성
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i <1000; i++) {
					sync.increment();
				}
			}
		};
		
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 1000;i++) {
					sync.increment();
				}
			}
		};
		
		//스레드 생성 및 시작
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		//모든 스레드가 종료될 때 까지 대기
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("최종카운트 : " + sync.count);
	}

}
