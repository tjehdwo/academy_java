package HomeWork;

import java.util.ArrayList;

import java.util.Scanner;

public class forHomeWork {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해주세요.");
		numbers.add(sc.nextInt());
		System.out.println("두번째 수를 입력해주세요.");
		numbers.add(sc.nextInt());
		System.out.println("세번째 수를 입력해주세요.");
		numbers.add(sc.nextInt());
		System.out.println("네번째 수를 입력해주세요.");
		numbers.add(sc.nextInt());
		System.out.println("다섯번째 수를 입력해주세요.");
		numbers.add(sc.nextInt());
		
		System.out.println("모든 수가 추가된 배열 : " + numbers);
		
		Integer firstNumber = numbers.get(0);
		Integer secondNumber = numbers.get(1);
		Integer thirdNumber = numbers.get(2);
		Integer fourthNumber = numbers.get(3);
		Integer fifthNumber = numbers.get(4);
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("모든 배열의 합 : "+ sum);
		} 
			
	}

