package HomeWork;

import java.util.ArrayList;

import java.util.Scanner;

public class forHomeWork {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է����ּ���.");
		numbers.add(sc.nextInt());
		System.out.println("�ι�° ���� �Է����ּ���.");
		numbers.add(sc.nextInt());
		System.out.println("����° ���� �Է����ּ���.");
		numbers.add(sc.nextInt());
		System.out.println("�׹�° ���� �Է����ּ���.");
		numbers.add(sc.nextInt());
		System.out.println("�ټ���° ���� �Է����ּ���.");
		numbers.add(sc.nextInt());
		
		System.out.println("��� ���� �߰��� �迭 : " + numbers);
		
		Integer firstNumber = numbers.get(0);
		Integer secondNumber = numbers.get(1);
		Integer thirdNumber = numbers.get(2);
		Integer fourthNumber = numbers.get(3);
		Integer fifthNumber = numbers.get(4);
	
		for (int number : numbers) {
			if (number == 5) {
				System.out.println(numbers.get(0)+numbers.get(1)+numbers.get(2)+numbers.get(3)+numbers.get(4));
				
			}else { 
				System.out.println("");
				
			}
			
		}	
	}

}