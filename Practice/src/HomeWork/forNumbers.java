package HomeWork;

import java.util.ArrayList;

public class forNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("numbers" + numbers);
		
		for(Integer aa:numbers) {
			System.out.println(aa);
		}
	}

}
/*
 * int[] numbers = {1,2,3,4,5};
 * for (int number : numbers){
 * 	System.out.println(number);
 * }
 */